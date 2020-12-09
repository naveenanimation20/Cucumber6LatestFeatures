package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on Application landing page")
	public void user_is_on_application_landing_page() {
	}

	@When("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	}

	@Then("user is displayed login screen")
	public void user_is_displayed_login_screen() {
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String string) {
	}

	@When("user clicks Sign in button")
	public void user_clicks_sign_in_button() {
	}

	@Then("user gets login failed error message")
	public void user_gets_login_failed_error_message() {
	}

}
