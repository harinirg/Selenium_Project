package com.tests;

import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Calculator_Subtraction {
	public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("1597080582000FB");
        options.setUdid("1597080582000FB");
        options.setAppPackage("com.vivo.calculator");
        options.setAppActivity("com.vivo.calculator.Calculator");
        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options);
        Thread.sleep(5000);
        // Click 1
        driver.findElement(By.id("com.vivo.calculator:id/digit_8")).click();
        // Click +
        driver.findElement(By.id("com.vivo.calculator:id/op_sub")).click();
        // Click 5
        driver.findElement(By.id("com.vivo.calculator:id/digit_2")).click();
        // Click =
        driver.findElement(By.id("com.vivo.calculator:id/eq")).click();
        System.out.println("Subtraction operation completed successfully");
        Thread.sleep(3000);

        driver.quit();
    }
}
