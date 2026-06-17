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
        payload.put("name", "Ram");
        payload.put("email", "ram@gmail.com");
        payload.put("company", "Amazon");
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .put("http://localhost:3000/trainees/nDOEJaIx-HA");
        System.out.println("Status Code: " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("company"),"Amazon");
	}

}
