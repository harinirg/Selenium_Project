package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class InvalidTraineeTest {
	@Test 
	public void getTraineer() {
		Response response=RestAssured.given().when().get("http://localhost:3000/trainees/97");
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), 404);
	}
}
