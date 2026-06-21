package com.test;

import static io.restassured.RestAssured.given;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CRUDTest extends BaseTest {

    @Test(dependsOnMethods = "com.test.AuthenticationTest.authenticationTest")
    public void CRUDTests() {

        String token = AuthenticationTest.token;

        // Create Note
        Map<String, Object> payload = new HashMap<>();
        payload.put("title", "API Test Note");
        payload.put("content", "Created by tester");
        payload.put("tags", Arrays.asList("qa", "demo"));
        payload.put("color", "#ffeb3b");
        payload.put("isPinned", false);
        Response createResponse = given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("/create/notes");
        Assert.assertEquals(createResponse.getStatusCode(), 201);
        String noteId = createResponse.jsonPath().getString("data._id");
        Assert.assertNotNull(noteId);

        // Get All Notes
        Response getAllResponse = given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get("/getAll/notes");

        Assert.assertEquals(getAllResponse.getStatusCode(), 200);

        // Get Note By ID
        Response getByIdResponse = given()
                .header("Authorization", "Bearer " + token)
                .pathParam("id", noteId)
                .when()
                .get("/getById/notes/{id}");

        Assert.assertEquals(getByIdResponse.getStatusCode(), 200);
        Assert.assertEquals(getByIdResponse.jsonPath().getString("data.title"),"API Test Note");

        // Update Note
        Map<String, Object> updatePayload = new HashMap<>();
        updatePayload.put("title", "API Test Note (edited)");
        updatePayload.put("content", "Updated content");
        Response updateResponse = given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .pathParam("id", noteId)
                .body(updatePayload)
                .when()
                .put("/update/notes/{id}");

        Assert.assertEquals(updateResponse.getStatusCode(), 200);

        // Toggle Pin
        Response pinResponse = given()
                .header("Authorization", "Bearer " + token)
                .pathParam("id", noteId)
                .when()
                .put("/toggle-pin/notes/{id}");

        Assert.assertEquals(pinResponse.getStatusCode(), 200);

        // Delete Note
        Response deleteResponse = given()
                .header("Authorization", "Bearer " + token)
                .pathParam("id", noteId)
                .when()
                .delete("/delete/notes/ById/{id}");

        Assert.assertEquals(deleteResponse.getStatusCode(), 200);
        Assert.assertEquals(deleteResponse.jsonPath().getString("message"),"Notes deleted successfully");
    }
}

