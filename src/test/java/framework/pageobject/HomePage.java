package framework.pageobject;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "sign-in" )
	private WebElement signIn;
	
	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	private WebElement signOut;
	
	@FindBy(how = How.LINK_TEXT, using = "Addresses")
	private WebElement addresses;

	public void clickSignIn() {
		click(signIn);
	}
	
	public void clickSignOut() {
		click(signOut);
	}
	
	public void clickAddresses() {
		click(addresses);
	}
	
	public void isAddressesLinkVisible() {
		waitUntilVisible(addresses);
	}
}
