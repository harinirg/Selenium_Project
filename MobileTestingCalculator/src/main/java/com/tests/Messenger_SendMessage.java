package com.tests;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Messenger_SendMessage {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("1597080582000FB");
        options.setUdid("1597080582000FB");

        options.setAppPackage("com.google.android.apps.messaging");
        options.setAppActivity("com.google.android.apps.messaging.ui.ConversationListActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            System.out.println("Step 1 - Click Continue As");
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("com.google.android.apps.messaging:id/continue_as_button"))).click();
            System.out.println("Step 2 - Click Ok");
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("com.google.android.apps.messaging:id/conversation_list_spam_popup_positive_button")));
            System.out.println("Step 3 - Click Start Chat");
            wait.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.accessibilityId("Start chat"))).click();
            System.out.println("Step 4 - Enter Phone Number");
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//android.widget.TextView[@text=\"Type name, phone number, or email\"]")))
                    .sendKeys("9150390001");
            System.out.println("Step 5 - Select Contact");
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//android.view.View[@resource-id=\"ContactSuggestionList\"]/android.view.View[2]")))
                    .click();
            System.out.println("Step 6 - Type Message");
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("com.google.android.apps.messaging:id/compose_message_text")))
                    .sendKeys("Hi from Appium");
            System.out.println("Step 7 - Send SMS");
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("//android.view.View[@resource-id=\"Compose:Draft:Send\"]/android.widget.Button")))
                    .click();
            System.out.println("Message sent successfully");

        } catch (Exception e) {
            System.out.println("Test Failed");
            e.printStackTrace();
        } finally {
            Thread.sleep(3000);
            driver.quit();
        }
    }
}