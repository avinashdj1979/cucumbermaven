package cucumberex.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/cucumberex/featurefiles/fftags/"},
		glue = {"cucumberex.stepdefs.stepsboth"},
		monochrome = true,
		stepNotifications = true,
		dryRun = false,
		tags = "@P0 and not @Valid",
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class MainRunnerTags {
/*
 * 1. tags = "@P0"
 * 2. tags = "@P0 or @P1"
 * 3. tags = "@Regression"  //Feature level tag
 * 4. tags = "@P0 and @Valid"
 * 5. tags = "@P0 and not @Valid"
 */

}
