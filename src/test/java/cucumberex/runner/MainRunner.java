package cucumberex.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/cucumberex/featurefiles/ffvalidlogin/"},
		glue = {"cucumberex.stepdefs.stepsvalidlogin"},
		monochrome = true,
		stepNotifications = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class MainRunner {

}
