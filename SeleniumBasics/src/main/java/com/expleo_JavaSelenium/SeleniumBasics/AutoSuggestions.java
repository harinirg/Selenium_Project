package com.expleo_JavaSelenium.SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
		searchBox.click();
		searchBox.sendKeys("Selenium WebDriver",Keys.ENTER);
		searchBox.sendKeys("AWS");
		WebDriverWait wait= new WebDriverWait (driver,Duration.ofSeconds(10));
		List<WebElement> suggestions=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class=\"ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset\"]/li")));
		for(WebElement option:suggestions) {
			if(option.getText().equals("AWS")||option.getText().equals("Selenium WebDriver")||option.getText().equals("Appium")) {
				option.click();
			}
		}
		
   }
}
