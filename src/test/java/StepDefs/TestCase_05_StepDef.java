package StepDefs;

import Utilities.Browser;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TestCase_05_StepDef extends BaseStep{
    @Then("verify {string} email already exist error message is visible")
    public void verifyEmailAlreadyExistErrorMessageIsVisible(String errorMessage){
        Browser.verifyElementDisplayed(Driver.getDriver().findElement(By.xpath("//form[@action='/signup']/p")));
        String msg = pages.getLoginPage().getEmailAlreadyExistErrorMessage();
        Assert.assertTrue(msg.contentEquals(errorMessage));
    }

}