package cucumberex1.stepsoutline;

import org.openqa.selenium.WebDriver;

import framework.factory.DriverFactory;
import framework.factory.PageProvider;
import framework.pageobject.HomePage;
import framework.pageobject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
		driver.get("http://a.testaddressbook.com");
		homePage = new PageProvider(driver).getHomePage();
		loginPage = new PageProvider(driver).getLoginPage();
		
	}
	
	@Given("The user clicks on the Sign in Link")
	public void theUserClicksOnTheSignInLink() {
	    System.out.println("the user clicks on SignIn Link");
	    homePage.clickSignIn();
	}

	@When("Click on the Sign in button")
	public void clickOnTheSignInButton() {
		System.out.println("the user clicks on SignIn Button");
		loginPage.clickSignInButton();
	}

	@Then("User logs out by clicking on sign out link")
	public void userLogsOutByClickingOnSignOutLink() {
		System.out.println("the user clicks on Sign out Link");
		homePage.clickSignOut();
	}
	
	@Given("^The user enters an ([^\"]*)$")
	public void theUserEntersAnEmail(String email) {
		 System.out.println(email);
		 loginPage.enterUserName(email);
	}

	@Given("^The user enters the ([^\"]*)$")
	public void theUserEntersThePassword(String password) {
		 System.out.println(password);
		 loginPage.enterPassword(password);
	}

	@Then("^Login should be ([^\"]*)$")
	public void validateTheSuccessOrFailure(String result) {
	    System.out.println(result);
	    if(result.equals("success")) {
	    	homePage.isAddressesLinkVisible();
	    } else {
	    	loginPage.validateErrorMessgeShown("Bad email or password.");
	    }
	}

	
	@After
	public void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
}
