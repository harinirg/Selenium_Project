package com.expleo_JavaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Omayo_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		//Thread.sleep(5000);(static waits)
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));(implicit waits)	
		
		//driver.findElement(By.linkText("Gmail")).click();
		
		

}

}
