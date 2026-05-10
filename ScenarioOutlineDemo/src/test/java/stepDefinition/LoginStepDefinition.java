/*package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	WebDriverWait wait;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.manage().window().maximize();		
	    
	}

	@Given("User click on Login Link")
	public void user_click_on_login_link() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();	
	   
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
	    
	}

	@When("User clicks Login Button")
	public void user_clicks_login_button() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();
	    
	}

	@Then("User should be able to see an {string}")
	public void user_should_be_able_to_see_an(String error) {
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert = driver.switchTo().alert();
		 String text = alert.getText();
		 Assert.assertEquals(text, error);
		 alert.accept();
	}	

}
*/