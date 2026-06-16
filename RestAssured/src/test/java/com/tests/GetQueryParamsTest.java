package com.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class GetQueryParamsTest {
  @Test
  public void getQueryParams() {
	  Response response = RestAssured
	            .given()
	            .queryParam("postId", 1)
	            .when()
	            .get("https://jsonplaceholder.typicode.com/comments");

	    response.prettyPrint();

	    Assert.assertEquals(response.getStatusCode(), 200);
  }
}
