package com.tests;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class InvalidLoginTest {

    @Test
    public void invalidLoginTest() {

        Map<String, Object> payload = new HashMap<>();
        payload.put("username", "admin");
        payload.put("password", "Admin");

        RestAssured.baseURI = "http://localhost:5000";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("/login");

        System.out.println("Status Code: " + response.getStatusCode());
        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 401);
    }
}