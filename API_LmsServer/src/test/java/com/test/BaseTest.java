package com.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BaseTest {
	@Test
	public void baseURI() {
		RestAssured.baseURI = "https://lms-server-3-wedg.onrender.com";
	}
}
