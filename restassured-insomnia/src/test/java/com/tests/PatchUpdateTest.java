
package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PatchUpdateTest {
 
    @Test
    public void patchUpdate() {

        Map<String, Object> payload = new HashMap<>();
        payload.put("company", "Tessolve");

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .patch("http://localhost:3000/trainees/2");

        System.out.println("Status Code: " + response.getStatusCode());
        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("company"), "Tessolve");
    }
}