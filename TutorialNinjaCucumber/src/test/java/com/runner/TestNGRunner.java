package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/com/features/addtocart.feature",
	    glue = "com.stepdefinition",
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports/TestNGReport.html"
	    }
	   
	)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
