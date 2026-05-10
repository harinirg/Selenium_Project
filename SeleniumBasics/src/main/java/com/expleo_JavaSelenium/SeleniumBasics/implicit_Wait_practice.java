package com.expleo_JavaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


	
public class implicit_Wait_practice {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

		driver.findElement(By.id("adder")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement box = wait.until(
		        ExpectedConditions.presenceOfElementLocated(By.id("box0"))
		);

		String width = box.getCssValue("width");
		System.out.println("Width: " + width);

		driver.quit();
	}
}