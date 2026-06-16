package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdatePutTest {

    @Test
    public void updatePutTest() {

        Map<String, Object> payload = new HashMap<>();
        payload.put("id", 1);
        payload.put("title", "Title updated");
        payload.put("body", "Body is updated");
        payload.put("userId", 1);
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1");

        System.out.println("Status Code: " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("title"),"Title updated");
    }
}