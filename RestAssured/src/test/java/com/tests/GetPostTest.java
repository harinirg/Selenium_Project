package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPostTest {

    @Test
    public void getPostTest() {

        Response response = RestAssured
                .given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts");

        System.out.println("Status Code: " + response.getStatusCode());

        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}