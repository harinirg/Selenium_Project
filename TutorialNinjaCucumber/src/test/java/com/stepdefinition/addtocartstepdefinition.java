package com.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class addtocartstepdefinition {

    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on TutorialsNinja Application")
    public void user_is_on_tutorials_ninja_application() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("User clicks on Login link")
    public void user_clicks_on_login_link() {

        driver.findElement(By.xpath("//span[text()='My Account']")).click();

        driver.findElement(By.linkText("Login")).click();
    }

    @When("User enters the valid username as {string} and valid password as {string}")
    public void user_enters_the_valid_username_as_and_valid_password_as(String email, String password) {

        driver.findElement(By.id("input-email")).sendKeys(email);

        driver.findElement(By.id("input-password")).sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @When("User adds valid products to cart")
    public void user_adds_valid_products_to_cart(DataTable dataTable) {

        List<String> products = dataTable.asList();

        for (String product : products) {

            WebElement search = driver.findElement(By.name("search"));

            search.clear();

            search.sendKeys(product);

            driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//span[text()='Add to Cart'])[1]"))).click();

            System.out.println(product + " added");
        }
    }

    @Then("Products should be successfully added to cart")
    public void products_should_be_successfully_added_to_cart() {

        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();

        Assert.assertTrue(driver.getTitle().contains("Shopping Cart"));

        System.out.println("Products added successfully");

        driver.quit();
    }
}