package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.HomePageLocators;
import com.Utilities.HelperClass;

public class HomePageActions {
	
	
	HomePageLocators homePageLocators;
	
	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
	}
	
	
	public String getHomePageText() {
		return homePageLocators.dashbord.getText();
	}

}
