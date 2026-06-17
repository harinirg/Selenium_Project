package com.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class OptionsTest {
    @Test
    public void optionTrainee() {
        RestAssured.baseURI = "http://localhost:3000";
        Response response = RestAssured.given()
                .when()
                .options("/trainees");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Allow Header: " + response.getHeader("Allow"));
        response.prettyPrint();
        Assert.assertTrue(response.getStatusCode() == 204);
    }
}