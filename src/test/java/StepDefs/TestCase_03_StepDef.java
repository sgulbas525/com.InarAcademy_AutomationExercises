package StepDefs;

import Utilities.Browser;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TestCase_03_StepDef extends BaseStep {

    @Then("verify {string} invalid credentials error message is visible")
    public void verifyInvalidCredentialsErrorMessageIsVisible(String errorMessage) {
        Browser.verifyElementDisplayed(Driver.getDriver().findElement(By.xpath("//form[@action='/login']/p ")));
        String msg = pages.getLoginPage().getInvalidCredentialsErrorMessage();
        Assert.assertTrue(msg.contentEquals(errorMessage));
    }
}
