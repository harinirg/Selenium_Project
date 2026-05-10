package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.DashboardPage;

public class DashboardTest extends BaseTest {

    LoginPage objLogin;
    DashboardPage objDashboard;

    @Test
    public void verifyDashboardPage() {

        objLogin = new LoginPage(driver);
        objLogin.login("Admin", "admin123");

        objDashboard = new DashboardPage(driver);
        String dashboardText = objDashboard.getHomePageText();

        Assert.assertTrue(dashboardText.contains("Dashboard"));
        }
}