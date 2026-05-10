package com.expleo_JavaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class TestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium", Keys.ENTER);
		System.out.println("page title is" + driver.getTitle());
		driver.close();
	}
}
