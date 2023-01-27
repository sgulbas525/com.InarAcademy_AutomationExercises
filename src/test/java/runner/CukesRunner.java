package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/TestCase_05.html",
                "json:target/cucumber-reports/TestCase_05.json",
                "rerun:target/rerun.txt"},
        features = "src/test/java/Features",
        glue = "StepDefs",
        tags = "@RegisterUserWithExistingEmail_TestCase_05",
        dryRun = false)
public class CukesRunner {
}
