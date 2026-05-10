package com.expleo_JavaSelenium.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.Keys;
public class Xpath_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		WebElement register = driver.findElement(with(By.tagName("button")).above(reset));
		WebElement refresh = driver.findElement(By.xpath("//button[text()='Refresh']"));
		WebElement clear = driver.findElement(with(By.tagName("button")).toRightOf(refresh));
		
		

	}

}
