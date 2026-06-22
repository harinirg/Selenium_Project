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

        String authToken = AuthenticationTest.token;

        // Create Note
        Map<String, Object> noteRequestBody = new HashMap<>();
        noteRequestBody.put("title", "API Test Note");
        noteRequestBody.put("content", "Created by tester");
        noteRequestBody.put("tags", Arrays.asList("qa", "demo"));
        noteRequestBody.put("color", "#ffeb3b");
        noteRequestBody.put("isPinned", false);

        Response createResult = given()
                .header("Authorization", "Bearer " + authToken)
                .contentType(ContentType.JSON)
                .body(noteRequestBody)
                .when()
                .post("/create/notes");

        Assert.assertEquals(createResult.getStatusCode(), 201);
        Assert.assertEquals(createResult.jsonPath().getString("message"),
                "Note created successfully");

        String currentNoteId = createResult.jsonPath().getString("data._id");
        Assert.assertNotNull(currentNoteId);

        // Get All Notes
        Response getAllResult = given()
                .header("Authorization", "Bearer " + authToken)
                .when()
                .get("/getAll/notes");

        Assert.assertEquals(getAllResult.getStatusCode(), 200);
        Assert.assertTrue(getAllResult.jsonPath().getList("data").size() > 0);

        // Get Note By ID
        
        Response getByIdResult = given()
                .header("Authorization", "Bearer " + authToken)
                .pathParam("id", currentNoteId)
                .when()
                .get("/getById/notes/{id}");

        Assert.assertEquals(getByIdResult.getStatusCode(), 200);
        Assert.assertEquals(getByIdResult.jsonPath().getString("data.title"),
                "API Test Note");

        // Update Note
        Map<String, Object> updatedNoteBody = new HashMap<>();
        updatedNoteBody.put("title", "API Test Note (edited)");
        updatedNoteBody.put("content", "Updated content");

        Response updateResult = given()
                .header("Authorization", "Bearer " + authToken)
                .contentType(ContentType.JSON)
                .pathParam("id", currentNoteId)
                .body(updatedNoteBody)
                .when()
                .put("/update/notes/{id}");

        Assert.assertEquals(updateResult.getStatusCode(), 200);
        Assert.assertEquals(updateResult.jsonPath().getString("data.title"),
                "API Test Note (edited)");
        // Toggle Pin
        Response toggleResult = given()
                .header("Authorization", "Bearer " + authToken)
                .pathParam("id", currentNoteId)
                .when()
                .put("/toggle-pin/notes/{id}");
        Assert.assertEquals(toggleResult.getStatusCode(), 200);
        Assert.assertTrue(toggleResult.jsonPath().getBoolean("data.isPinned"));

        // Delete Note
        Response deleteResult = given()
                .header("Authorization", "Bearer " + authToken)
                .pathParam("id", currentNoteId)
                .when()
                .delete("/delete/notes/ById/{id}");
        Assert.assertEquals(deleteResult.getStatusCode(), 200);
        Assert.assertEquals(deleteResult.jsonPath().getString("message"),
                "Notes deleted successfully");
    }
}