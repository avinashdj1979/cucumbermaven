package cucumberex1.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	@Given("The user clicks on the Sign in Link")
	public void theUserClicksOnTheSignInLink() {
	    System.out.println("the user clicks on SignIn Link");
	}

	@Given("The user enters the user name")
	public void theUserEntersTheUserName() {
		System.out.println("the user enters user name");
	}

	@Given("The user enters the password")
	public void theUserEntersThePassword() {
		System.out.println("the user enters the password");
	}

	@When("Click on the Sign in button")
	public void clickOnTheSignInButton() {
		System.out.println("the user clicks on SignIn Button");
	}

	@Then("User should be able to Login Successfully")
	public void userShouldBeAbleToLoginSuccessfully() {
		System.out.println("the user should be able to login successfully");
	}

	@Then("User logs out by clicking on sign out link")
	public void userLogsOutByClickingOnSignOutLink() {
		System.out.println("the user clicks on Sign out Link");
	}
}
