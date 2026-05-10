package com.expleo_JavaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElementActions_contentClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsmenuElement=driver.findElement(By.id("blogsmenu"));
		Actions action=new Actions(driver);
		action.moveToElement(blogsmenuElement).perform();
		WebElement option2=driver.findElement(By.xpath("//input[@name='q']"));
        action.contextClick(option2).perform();
	}

}
