package StepDefs;

import Utilities.Browser;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class TestCase_06_StepDef extends BaseStep {
    @When("the user clicks contact us button on Home_Page")
    public void theUserClicksContactUsButtonOnHome_Page() {
        pages.getHeader().clickContactUsButton();
    }

    @Then("verify {string} get in touch message is visible")
    public void verifyGetInTouchMessageIsVisible(String message) {
        String msg = pages.getContactUsPage().getGetInTouchMessage();
        Assert.assertTrue(msg.contentEquals(message));
    }

    @When("the user enters name {string}, email {string}, subject{string} and message {string} on ContactUs_Page")
    public void theUserEntersNameEmailSubjectAndMessageOnContactUs_Page(String name, String email, String subject, String message) {
        pages.getContactUsPage().setNameBox(name);
        pages.getContactUsPage().setEmailBox(email);
        pages.getContactUsPage().setSubjectBox(subject);
        pages.getContactUsPage().setMessageBox(message);
    }

    @And("the user uploads the file on ContactUs_Page")
    public void theUserUploadsTheFileOnContactUs_Page() {

        pages.getContactUsPage().setUploadFile("/Users/Serhat/Desktop/ayakkabi.jpeg");
        Browser.wait(3);
    }

    @And("the user clicks OK button")
    public void theUserClicksOKButton() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("the user clicks submit button on ContactUs_Page")
    public void theUserClicksSubmitButtonOnContactUs_Page() {
        pages.getContactUsPage().clickSubmitButton();

    }

    @Then("verify {string} succes message is visible on ContactUs_Page")
    public void verifySuccesMessageIsVisibleOnContactUs_Page(String msg) {
        Assert.assertTrue(msg.contentEquals(pages.getContactUsPage().getSuccessMessage()));
    }

    @When("the user clicks home button on ContactUs_Page")
    public void theUserClicksHomeButtonOnContactUs_Page() {
        pages.getContactUsPage().clickHomeButton();
    }
}
