package cucumberex1.stepsmh;

import org.openqa.selenium.WebDriver;

import framework.factory.DriverFactory;
import framework.factory.PageProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MasterHooks {
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
		driver.get("http://a.testaddressbook.com");
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
