package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	By dashboardPageTitle=By.xpath("//h6[normalize-space()='Dashboard']");
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	public String getHomePageText() {
		return driver.findElement(dashboardPageTitle).getText();
	}

}
