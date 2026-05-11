package com.Definitions;

import org.testng.Assert;

import com.Actions.HomePageActions;
import com.Actions.LoginPageActions;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("the user is on Homepage {string}")
	public void the_user_is_on_homepage(String url) {
	   HelperClass.openPage(url);
	}

	@When("user enter username,password and click login button")
	public void user_enter_username_password_and_click_login_button() {
	   objLogin.login();
	   
	}

	@Then("the user should be able to login successfully and should see Dashboard")
	public void the_user_should_be_able_to_login_successfully_and_should_see_dashboard() {
		Assert.assertEquals(objHome.getHomePageText(),"Dashboard");
	}

}
