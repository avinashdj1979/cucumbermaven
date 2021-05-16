package cucumberex.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/cucumberex/featurefiles/ffoutline/"},
		glue = {"cucumberex.stepdefs.stepsoutline"},
		monochrome = true,
		stepNotifications = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class MainRunnerExtentOutline {

}
