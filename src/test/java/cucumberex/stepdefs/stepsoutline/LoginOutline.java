package cucumberex.stepdefs.stepsoutline;

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

public class LoginOutline {
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

	@Given("^The user enters the email ([A-Za-z0-9@.]*)$")
	public void theUserEntersTheEmail(String email) {
		loginPage.enterUserName(email);
	}

	@Given("^The user enters the password ([^\"]*)$")
	public void theUserEntersThePassword(String password) {
		loginPage.enterPassword(password);
	}

	@When("The user clicks on the sign in button")
	public void theUserClicksOnTheSignInButton() {
	    loginPage.clickSignInButton();
	}

	@Then("^login should be ([A-Za-z]*)$")
	public void loginShouldBeSuccess(String status) {
	    if(status.equalsIgnoreCase("success")) {
	    	homePage.isAddressesLinkVisible();
	    } else {
	    	loginPage.validateErrorMessgeShown("Bad email or password");
	    }
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
