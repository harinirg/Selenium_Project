package com.Automation.Selenium;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assessment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		//1.Login to the Application
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();		
		String home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Welcome Admin']"))).getText();
		if (home.equals("Welcome Admin")) {
			System.out.println("Login Successful");
		}
		//2. Category Navigation & Product Handling
		WebElement laptop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptops']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(laptop).click().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MacBook air']")));
		List<String> productNames = new ArrayList<>();
		List<WebElement> firstPage = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( By.xpath("//div[@class='card-block']/h4/a")));
		for (WebElement product : firstPage) {
			productNames.add(product.getText());
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.id("next2"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Apple monitor 24']")));
		List<WebElement> secondPage = driver.findElements(By.xpath("//div[@class='row']//child::a[@class='hrefch']"));
		for (WebElement product : secondPage) {
		    productNames.add(product.getText());
		}

		Collections.sort(productNames);
		Set<String> productSet = new TreeSet<>(productNames);
		for (String name : productSet) {
			System.out.println(name);
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement macbook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MacBook Pro']")));
		js.executeScript("arguments[0].scrollIntoView(true);", macbook);

		String Title = macbook.getText();

		if (Title.contains("MacBook Pro")) {
			System.out.println("Found Laptop: " + Title);
		} else {
			System.out.println("MacBook Pro not found");
		}
		//3. Add Product to Cart 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='MacBook Pro']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']"))).click();
		//Alert
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur"))).click();
		String productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]"))).getText();

		String productPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[3]"))).getText();
		if (productTitle.equals("MacBook Pro")) {
			System.out.println("Product added to cart");
			System.out.println("MacBook Pro added to cart.");
		}
		//4. Place Order
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Harini");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("card")).sendKeys("123456789");
		driver.findElement(By.id("month")).sendKeys("12");
		driver.findElement(By.id("year")).sendKeys("2026");
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		String purchase = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sweet-alert  showSweetAlert visible']//p"))) .getText();
		if (purchase.contains("Id")) {
			System.out.println("Order is placed successfully");
			System.out.println(purchase);

		} 
		else {
			System.out.println("Order is Unsuccessful");
		}

		driver.quit();

	}

}
