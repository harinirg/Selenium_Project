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
public class VisiblilityofElementLocator {
	public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    WebElement timerbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert2")));
	

}
}
