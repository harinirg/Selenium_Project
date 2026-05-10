/*package stepDefinition;

import java.time.Duration;
import java.util.List;

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

public class DataTableLogin {
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
	@When("User enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException{
		System.out.println("Credentials Entered");

	    List<List<String>> data = dataTable.asLists(String.class);

	    String username = data.get(0).get(0);
	    String password = data.get(0).get(1);

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(username);
	    driver.findElement(By.id("loginpassword")).sendKeys(password);
	   
	}

	@When("User clicks Login Button")
	public void user_clicks_login_button() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();
	    
	}
	@Then("User should be able to see an {string}")
	public void user_should_be_able_to_see_an(String expectedMessage) {
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    String actualMessage = alert.getText();
	    Assert.assertEquals(actualMessage, expectedMessage);
	    alert.accept(); 
	}


}*/
