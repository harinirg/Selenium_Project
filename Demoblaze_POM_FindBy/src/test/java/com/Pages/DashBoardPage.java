package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
	public DashBoardPage(WebDriver driver) {
		  super(driver);
	  }
  
  @FindBy(id="logout2")
  public WebElement LogOut;
  
  
  //get the user name from home page
  public String getHomePageText() {
	  return LogOut.getText();
  }
}