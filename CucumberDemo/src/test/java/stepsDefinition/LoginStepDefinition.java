package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	@Given("User is on Home PAge")
	public void user_is_on_home_p_age() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    System.out.println("Home Page");
	}

	@When("User enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Enter UserName");

	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Enter Password");

	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Enter Password");

	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    System.out.println("Login successfully");

	}


}
