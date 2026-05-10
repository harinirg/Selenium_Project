package com.test;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utilities.ExcelUtil;

@Listeners(TestListener.class)
public class LoginTest {
	public static Logger log = LogManager.getLogger(LoginTest.class);

	private static final ThreadLocal <WebDriver> driver=new ThreadLocal <WebDriver>();

	@BeforeMethod
	public void beforeMethod() {

		log.info("Starting the test");
		driver.set(new ChromeDriver());
	}

	@Test(dataProvider="ValidexcelData",dataProviderClass=ExcelUtil.class)
	public void LoginValidation(String UserName,String Password) {
		if (UserName == null || UserName.isEmpty() || Password == null || Password.isEmpty()) {
			log.warn("Skipping test due to empty data");
			return;
		}


		WebDriver driver1 = driver.get();
		log.info("Opening application");

		driver1.manage().window().maximize();

		driver1.get("https://www.demoblaze.com/");

		driver1.findElement(By.id("login2")).click();

		WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(10));
		log.info("Entering username: ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(UserName);
		log.info("Entering password");
		driver1.findElement(By.id("loginpassword")).sendKeys(Password);
		log.info("Clicking login submit");

		driver1.findElement(By.xpath("//button[text()='Log in']")).click();

		String ExpectedMessage = "Log out";

		String Actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout2"))).getText();

		Assert.assertEquals(Actual,ExpectedMessage);

		log.info("Login Successful");
	}

	@Test(dataProvider="InValidexcelData",dataProviderClass=ExcelUtil.class)
	public void InvalidLogin(String userName,String password) {

		WebDriver driver2 = driver.get();

		driver2.manage().window().maximize();

		driver2.get("https://www.demoblaze.com/");

		driver2.findElement(By.id("login2")).click();

		WebDriverWait wait = new WebDriverWait(driver2,Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(userName);

		driver2.findElement(By.id("loginpassword")).sendKeys(password);

		driver2.findElement(By.xpath("//button[text()='Log in']")).click();

		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver2.switchTo().alert();
		String alert_message = alert.getText();
		log.info("Alert message: " + alert_message);

		Assert.assertTrue(alert_message.equals("Wrong password.") || 
				alert_message.equals("User does not exist.")
				);
		System.out.println(alert.getText());

		alert.accept();
	}
	@AfterMethod
	public void afterMethod() {
		log.info("Closing browser");
		WebDriver driver1 = driver.get();
		if(driver1 != null)
			driver1.quit();
	}
}
