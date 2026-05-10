package com.expleo_JavaSelenium.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ExplicitWait_Seleniumdev {
    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

        driver.findElement(By.id("reveal")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement text = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("revealed"))
        );

        text.sendKeys("Hello all!");
        System.out.println(text.getAttribute("value"));
        driver.quit();
    }
}