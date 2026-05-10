package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	public WebElement loginButton;

}
