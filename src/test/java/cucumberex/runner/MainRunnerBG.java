package cucumberex.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/cucumberex/featurefiles/ffbackground/"},
		glue = {"cucumberex.stepdefs.stepsboth"},
		monochrome = true,
		stepNotifications = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class MainRunnerBG {

}
