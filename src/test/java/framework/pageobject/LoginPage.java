package framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(id="session_password")
	private WebElement password;
	
	@FindBy(name="commit")
	private WebElement signInButton;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-notice')]")
	private WebElement badEmailError;
	
	public void login() {
		type(email, "avinash.vcentry1@gmail.com");
		type(password, "Sadu2006$");
		click(signInButton);
	}
	
	public void enterUserName(String value) {
		type(email, value);
	}
	
	public void enterPassword(String value) {
		type(password, value);
	}
	
	public void validateErrorMessgeShown(String message) {
		waitUntilTheElementContainsText(badEmailError, message);
	}
	
	public void clickSignInButton() {
		click(signInButton);
	}
	
}
