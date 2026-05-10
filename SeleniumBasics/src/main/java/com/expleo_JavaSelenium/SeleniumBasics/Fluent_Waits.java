package com.expleo_JavaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.Keys;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
public class Fluent_Waits {
	public static void main(String args[]) {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://omayo.blogspot.com/");

	        // Click dropdown
	        driver.findElement(By.cssSelector(".dropdown .dropbtn")).click();

	        Wait<WebDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(10))
	                .pollingEvery(Duration.ofMillis(500))
	                .ignoring(NoSuchElementException.class); 

	        WebElement facebook = wait.until(
	        	    ExpectedConditions.visibilityOfElementLocated(
	        	        By.xpath("//a[contains(text(),'Facebook')]")
	        	    )
	        	);
	}
}