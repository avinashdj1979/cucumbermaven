package cucumberex.stepdefs.stepsboth;

import org.openqa.selenium.WebDriver;

import framework.constants.UIConstants;
import framework.factory.DriverFactory;
import framework.factory.PageProvider;
import framework.pageobject.HomePage;
import framework.pageobject.LoginPage;
import framework.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BothStepDef {
	
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
		driver.get(new PropertyReader().getProperty(UIConstants.BASE_URL));
		loginPage = new PageProvider(driver).getLoginPage();
		homePage = new PageProvider(driver).getHomePage();
	}

	@Given("The user clicks on the sign in link")
	public void theUserClicksOnTheSignInLink() {
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
	
	@After
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
	
}
