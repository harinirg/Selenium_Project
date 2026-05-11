package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.LoginPageLocators;
import com.Utilities.HelperClass;

public class LoginPageActions {

	LoginPageLocators loginPageLocators;
	
	String strUserName,strPassword;
	
	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	
	
	public void setUserName(String userName) {
    	loginPageLocators.userName.sendKeys(userName);
	}
	
	public void setPassword(String Password) {
		loginPageLocators.password.sendKeys(Password);
	}
	
	public void clickLogin() {
		loginPageLocators.loginButton.click();
	}
	
	public void login() {
		File file = new File("src/test/resources/Logindata.properties");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		strUserName = prop.getProperty("username");
		strPassword = prop.getProperty("password");
		
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
	}
	
	
}
