package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("User enter URL and redirect on login page")
	public void user_enter_url() {
	System.out.println("User enter URL and redirect on login page");
	}

	@When("User enters username and password")
	public void user_enters_UN_and_pass() {
		System.out.println("User enters username and password");
	}

	@When("click on login button")
	public void click_on_login_btn() {
		System.out.println("click on login button");
	}

	@Then("User nevigated to dasboard page of Admin")
	public void user_nevigated_to_dasboard_page_of_admin() {
		System.out.println("User nevigated to dasboard page of Admin");
	}


}
