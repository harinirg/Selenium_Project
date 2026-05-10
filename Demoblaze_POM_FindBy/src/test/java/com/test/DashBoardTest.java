package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.DashBoardPage;
import com.Pages.LoginPage;

public class DashBoardTest extends BaseTest{
    
	LoginPage objLogin; 
	DashBoardPage objDashboardPage;
	@Test(priority = 0)
	public void DashBoardTest() {

		objLogin = new LoginPage(driver);
		objLogin.login("Admin", "admin123");

		objDashboardPage = new DashBoardPage(driver);
		Assert.assertTrue(objDashboardPage.getHomePageText().contains("Dashboard"));
	}
}