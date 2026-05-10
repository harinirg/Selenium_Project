package com.expleo_JavaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String oldUrl="https://www.flipkart.com/";
		String title=driver.getTitle();
		System.out.println("Page Title: "+title+"\n Length of the title: "+title.length());
		String currentUrl=driver.getCurrentUrl();
		if(oldUrl.equals(currentUrl)) {
			System.out.println("It is correct URL");
		}
		else {
			System.out.println("It is not correct in ");
		}
		String pageSource=driver.getPageSource();
		System.out.println("Length of the pageSource: "+pageSource.length());
		driver.close();

	}

}
