package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PUTUpdateTest {
	@Test
	public void putUpdate(){
		Map<String, Object> payload = new HashMap<>();
        payload.put("name", "Salim");
        payload.put("email", "salim@gmail.com");
        payload.put("company", "Flipkart");
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .put("http://localhost:3000/trainees/1");
        System.out.println("Status Code: " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("company"),"Flipkart");
	}

}
