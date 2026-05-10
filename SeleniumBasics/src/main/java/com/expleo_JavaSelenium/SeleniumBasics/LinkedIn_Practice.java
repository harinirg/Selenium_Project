package com.expleo_JavaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.Keys;

	public class LinkedIn_Practice {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.linkedin.com/");

	        driver.findElement(By.cssSelector("a.nav__button-secondary")).click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        WebElement username = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("username"))
	        );
	        username.sendKeys("2k22ece028@kiot.ac.in");

	        WebElement password = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("password"))
	        );
	        password.sendKeys("Harini@26");

	        WebElement signInBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
	        );
	        signInBtn.click();

	        driver.quit();
	    }
 }
