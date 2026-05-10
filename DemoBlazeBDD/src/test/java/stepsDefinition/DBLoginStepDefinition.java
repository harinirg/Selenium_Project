package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DBLoginStepDefinition {
	WebDriver driver;
	WebDriverWait wait;
	@Before
	public void setup() {
		System.out.println("--------------Before Executing----------------");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
	}
	@Given("user launches the application")
	public void user_launches_the_application() {
	    driver.get("https://demoblaze.com/");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.manage().window().maximize();	
	}

	@Given("click login link")
	public void click_login_link() {
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();	
	}
	


	@When("the user click the login button")
	public void the_user_click_the_login_button() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();
	}

	@Then("user should see the welcome message")
	public void user_should_see_the_welcome_message() {
	       String welcome=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))).getText();
		   Assert.assertEquals(welcome,"Welcome Admin");
		   System.out.println("Login successful");
	}

	@Then("user should see the alert message as wrong password")
	public void user_should_see_the_alert_message_as_wrong_password() {
	   
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
	
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		driver.findElement(By.id("loginpassword")).sendKeys("admin");
		
	}

	@Then("user should see pop message as wrong password")
	public void user_should_see_pop_message_as_wrong_password() {
	    
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")))
        .sendKeys("Admin");
	  
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
	   
	}
	@After
	public void close() {
		driver.quit();
		System.out.println("-----------after Executing-----------");
	}



}
