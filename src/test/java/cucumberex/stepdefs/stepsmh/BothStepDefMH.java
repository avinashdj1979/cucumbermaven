package cucumberex.stepdefs.stepsmh;

import framework.factory.DriverFactory;
import framework.factory.PageProvider;
import framework.pageobject.HomePage;
import framework.pageobject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BothStepDefMH extends DriverFactory {

	HomePage homePage;
	LoginPage loginPage;

	@Given("The user clicks on the sign in link")
	public void theUserClicksOnTheSignInLink() {
		loginPage = new PageProvider(driver).getLoginPage();
		homePage = new PageProvider(driver).getHomePage();
		homePage.clickSignIn();
	}

	@Given("The user enters the user name")
	public void theUserEntersTheUserName() {
		loginPage.enterUserName("avinashact1979@gmail.com");
	}

	@Given("The user enters the password")
	public void theUserEntersThePassword() {
		loginPage.enterPassword("Sadu2006$");
	}

	@When("The user clicks on the sign in button")
	public void theUserClicksOnTheSignInButton() {
		loginPage.clickSignInButton();
	}

	@Then("User should be able to login successfully")
	public void userShouldBeAbleToLoginSuccessfully() {
		homePage.isAddressesLinkVisible();
	}

	@Then("User click on the logout button")
	public void userClickOnTheLogoutButton() {
		homePage.clickSignOut();
	}

	@Given("The user enters an invalid user name")
	public void theUserEntersAnInvalidUserName() {
		loginPage.enterUserName("avinashact@gmail.com");
	}

	@Given("The user enters an invalid password")
	public void theUserEntersAnInvalidPassword() {
		loginPage.enterPassword("test");
	}

	@Then("Appropriate error message must be shown")
	public void appropriateErrorMessageMustBeShown() {
		loginPage.validateErrorMessgeShown("Bad email or password");
	}
}
