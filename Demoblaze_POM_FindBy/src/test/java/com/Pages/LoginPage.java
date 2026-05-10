package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@id='login2']")
	public WebElement Log;

	@FindBy(id = "loginusername")
	public WebElement username;

	@FindBy(id = "loginpassword")
	public WebElement password;

	@FindBy(id ="logInModalLabel")
	public WebElement login_text;

	@FindBy(xpath = "//button[@onclick='logIn()']")
	public WebElement login;

	public void login(String strUsername, String strPassword) {
		Log.click();
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		login.click();

	}
	public String getLogintext() {
		return login.getText();
	}
}


