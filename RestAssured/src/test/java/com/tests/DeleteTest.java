package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTest {

    @Test
    public void deleteTest() {

        Response response = RestAssured
                .given()
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println("Status Code: " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}