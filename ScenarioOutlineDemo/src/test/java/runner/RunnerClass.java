package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports/DataTable.html"},
features = "src\\test\\resources\\com\\features\\MultipleValueLogin.feature",
tags="@InvalidCredentials",
glue = "stepDefinition")
public class RunnerClass extends AbstractTestNGCucumberTests{

}