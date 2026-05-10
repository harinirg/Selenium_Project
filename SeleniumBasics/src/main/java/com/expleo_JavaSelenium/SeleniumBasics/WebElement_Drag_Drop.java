package com.expleo_JavaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElement_Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement blogsmenuElement=driver.findElement(By.id("blogsmenu"));
		Actions action=new Actions(driver);
		action.moveToElement(blogsmenuElement).perform();
		WebElement drag=driver.findElement(By.xpath("div[id='form:conpnl']"));
        action.dragAndDropBy(drag,200,0).perform();

	}

}
