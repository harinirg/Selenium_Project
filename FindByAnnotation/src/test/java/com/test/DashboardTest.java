package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest{
    
	LoginPage objLogin; 
	DashboardPage objDashboardPage;
	@Test(priority = 0)
	public void DashBoardTest() {

		objLogin = new LoginPage(driver);
		objLogin.login("Admin", "admin123");

		objDashboardPage = new DashboardPage(driver);
		Assert.assertTrue(objDashboardPage.getHomePageText().contains("Dashboard"));
	}
}