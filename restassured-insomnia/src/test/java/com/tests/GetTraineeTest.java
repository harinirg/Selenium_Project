package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetTraineeTest {
	@Test 
	public void getTraineer() {
		Response response=RestAssured.given().when().get("http://localhost:3000/trainees/1");
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), 200);
	    int id = response.jsonPath().getInt("id");
	    Assert.assertEquals(id, 1);		
	}

}
