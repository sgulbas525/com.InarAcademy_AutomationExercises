package StepDefs;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Hooks {

    @Before
    public static void setup(Scenario scenario) {
        System.out.println("::::: TEST STARTS :::::");
        System.out.println("Browser: " + ConfigurationReader.getProperty("browser"));
        System.out.println("URL: " + ConfigurationReader.getProperty("url"));
        System.out.println("Test name: " + scenario.getName());

    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}