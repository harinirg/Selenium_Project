package com.stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerstepdefinition {
	 WebDriver driver;
	    WebDriverWait wait;

	    @Before
	    public void setup() {
	        System.out.println("Launching browser");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        driver = new ChromeDriver(options);

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    }
	@Given("User shouble on Home page")
	public void user_shouble_on_home_page() {
		driver.get("https://tutorialsninja.com/demo/");
	}

	@When("User clicks my account button and select the register button")
	public void user_clicks_my_account_button_and_select_the_register_button() {
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	}

	@When("User fills the required details to register")
	public void user_fills_the_required_details_to_register(DataTable dataTable) {

	    List<Map<String,String>> reg = dataTable.asMaps(String.class,String.class);
	    Map<String,String> row = reg.get(0);

	    driver.findElement(By.name("firstname")).sendKeys(row.get("First Name"));
	    driver.findElement(By.name("lastname")).sendKeys(row.get("Last Name"));
	    driver.findElement(By.name("email")).sendKeys(row.get("E-mail"));
	    driver.findElement(By.name("telephone")).sendKeys(row.get("Telephone"));
	    driver.findElement(By.name("password")).sendKeys(row.get("Password"));
	    driver.findElement(By.name("confirm")).sendKeys(row.get("Password confirm"));
	}

	@When("User agree the privacy policy and click continue button")
	public void user_agree_the_privacy_policy_and_click_continue_button() {
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User should be able to register successfully and to see the account creation")
	public void user_should_be_able_to_register_successfully_and_to_see_the_account_creation() {
		 String actualMessage = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		 String expectedMessage = "Your Account Has Been Created!";
		 Assert.assertEquals(actualMessage, expectedMessage);
		    
	}
	 @After
	    public void tearDown() {
	        System.out.println("Closing browser");
	        driver.quit();
	    }
	

}
