package com.expleo_JavaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGround_SwitchTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/child::span[@class='ui-button-text ui-c']\r\n")).click();

	}

}
