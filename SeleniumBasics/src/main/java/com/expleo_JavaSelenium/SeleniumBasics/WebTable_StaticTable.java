package com.expleo_JavaSelenium.SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable_StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='table1']//td"));
		int size=table.size();
		System.out.println("Size of table:"+size);
		for(WebElement values:table) {
			System.out.println(values.getText());
		}

		

	}

}
