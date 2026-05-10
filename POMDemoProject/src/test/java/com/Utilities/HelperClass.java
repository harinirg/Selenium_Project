package com.Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	
//	private static HelperClass helperClass;
//	private static WebDriver driver;
//	private static WebDriverWait wait;
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();
	
	public final static int TIMEOUT=10; 
	
	HelperClass(){
//		driver = new ChromeDriver();
//		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
//		driver.manage().window().maximize();
		
		WebDriver webDriver = new ChromeDriver();
		driver.set(webDriver);
		wait.set(new WebDriverWait(webDriver,Duration.ofSeconds(TIMEOUT)));
		
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		webDriver.manage().window().maximize();
	}
	
	private static HelperClass helperClass;
	
	public static void openPage(String url) {
		getDriver().get(url);
	}

	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void setupDriver() {
		if(helperClass == null) {
			helperClass = new HelperClass();
		}
	}
	
	public static void tearDown() {
		if(getDriver()!=null) {
			getDriver().quit();
		}
		
		helperClass=null;
	}
}
