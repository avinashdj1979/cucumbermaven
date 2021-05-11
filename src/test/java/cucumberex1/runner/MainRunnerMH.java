package cucumberex1.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		features = {"src/test/java/cucumberex1/fftags/"},
		glue = {"cucumberex1.stepsmh"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class MainRunnerMH extends AbstractTestNGCucumberTests{
	
}
