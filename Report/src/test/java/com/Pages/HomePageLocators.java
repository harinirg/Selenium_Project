package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	public WebElement dashbord;
	
}
