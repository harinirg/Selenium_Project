package com.expleo_JavaSelenium.SeleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowsDemo {
	public static void main(String args[]) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allWindowHandles=driver.getWindowHandles();
		System.out.println("Count of window: "+allWindowHandles.size());
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		Set<String> newWindowhandles=driver.getWindowHandles();
		System.out.println("Count of new window: "+newWindowhandles.size());
		Iterator<String> iterator=newWindowhandles.iterator();
		 String mainWindow = iterator.next();
	        String childWindow = iterator.next();
	        System.out.println("Parent window: "+mainWindow);
	        System.out.println("The child window: "+childWindow);
	        
	        driver.switchTo().window(childWindow);
	        
	        WebElement text = driver.findElement(By.id("sampleHeading"));
	        System.out.println("Child_Title: "+text.getText());
	        
	        driver.close();
	        
	        driver.switchTo().window(parent);
	        System.out.println("Parent titel: "+driver.getTitle());
	        
	        driver.close();

	}

}
