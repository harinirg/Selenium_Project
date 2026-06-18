package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_All_Roles_Test extends BaseTest{
	@Test
	public void get_all_roles() {
		String token = AuthenticationTest.token;
		Response response = RestAssured.given().header("Authorization", "Bearer "+token)
				.when().get("/roles/getAll");
		Assert.assertEquals(response.getStatusCode(), 401);
		System.out.println(response.prettyPrint());
	}
}
