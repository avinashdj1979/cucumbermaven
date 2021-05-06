package cucumberex1.steps;

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

	@Given("The user enters the user name")
	public void theUserEntersTheUserName() {
		System.out.println("the user enters user name");
		loginPage.enterUserName();
	}

	@Given("The user enters the password")
	public void theUserEntersThePassword() {
		System.out.println("the user enters the password");
		loginPage.enterPassword();
	}

	@When("Click on the Sign in button")
	public void clickOnTheSignInButton() {
		System.out.println("the user clicks on SignIn Button");
		loginPage.clickSignInButton();
	}

	@Then("User should be able to Login Successfully")
	public void userShouldBeAbleToLoginSuccessfully() {
		System.out.println("the user should be able to login successfully");
	}

	@Then("User logs out by clicking on sign out link")
	public void userLogsOutByClickingOnSignOutLink() {
		System.out.println("the user clicks on Sign out Link");
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
