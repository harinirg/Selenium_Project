package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPost1Test {
  @Test
  public void getPost1Test() {
	  Response response = RestAssured
	            .given()
	            .when()
	            .get("https://jsonplaceholder.typicode.com/posts/1");

	    response.prettyPrint();

	    Assert.assertEquals(response.getStatusCode(), 200);

	    int id = response.jsonPath().getInt("id");

	    Assert.assertEquals(id, 1);
  }
}
