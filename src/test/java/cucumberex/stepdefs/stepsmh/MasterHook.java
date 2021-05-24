package cucumberex.stepdefs.stepsmh;

import org.openqa.selenium.WebDriver;

import framework.constants.UIConstants;
import framework.factory.DriverFactory;
import framework.factory.PageProvider;
import framework.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MasterHook {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
		driver.get(new PropertyReader().getProperty(UIConstants.BASE_URL));
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
