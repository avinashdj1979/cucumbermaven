package cucumberex1.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/cucumberex1/fftags/"},
		glue = {"cucumberex1.steps"},
		monochrome = true,
		tags = "",
		plugin = {"html:target/cucumber.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class MainRunnerTags extends AbstractTestNGCucumberTests{
}
