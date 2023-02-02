package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/TestCase_08.html",
                "json:target/cucumber-reports/TestCase_08.json",
                "rerun:target/rerun.txt"},
        features = "src/test/java/Features",
        glue = "StepDefs",
        tags = "@VerifyAllProductsAndProductDetailPage_TestCase_08",
        dryRun = false)
public class CukesRunner {
}
