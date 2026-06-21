package com.test;
import io.restassured.RestAssured;

public class BaseTest {
	
    public BaseTest() {
        RestAssured.baseURI = "https://lms-server-3-wedg.onrender.com";
    }
}