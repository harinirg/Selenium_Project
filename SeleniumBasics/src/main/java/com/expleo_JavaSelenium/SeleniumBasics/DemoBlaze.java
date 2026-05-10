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

public class DemoBlaze {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.cssSelector("a#login2")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        username.sendKeys("admin");
        WebElement password = wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
        password.sendKeys("admin");
        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='logIn()']")));
        String actual=signIn.getText();
        if(actual.equals("Welcome admin")) {
        	System.out.println("Login successfull");
        }
        else {
        	System.out.println("Not login");
        }
        
        signIn.click();
        
}
}
