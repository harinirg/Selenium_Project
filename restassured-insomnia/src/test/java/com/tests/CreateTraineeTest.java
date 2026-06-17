package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateTraineeTest {

    @Test
    public void createTrainee() {

        Map<String, Object> payload = new HashMap<>();
        payload.put("name", "Jayasree");
        payload.put("email", "jaya@gmail.com");
        payload.put("company", "TexValley");
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)  
                .body(payload)                  
                .when()
                .post("http://localhost:3000/trainees");
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 201); 
    }
}