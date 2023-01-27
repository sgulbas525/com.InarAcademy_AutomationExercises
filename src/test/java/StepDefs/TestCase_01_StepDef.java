package StepDefs;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TestCase_01_StepDef extends BaseStep {


    @Given("the user lands home page")
    public void theUserLandsHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks signup_login button on Home_Page")
    public void theUserClicksSignupLoginButton() {
        pages.getHeader().clickLoginSignUpButton();

    }

    @Then("verify login page message {string} is visible")
    public void verifyLoginPage(String msg) {
        String message = pages.getLoginPage().getSignupMessage();
        Assert.assertTrue(message.contentEquals(msg));
    }
    @When("the user enters name {string} and email {string} on Login_Page")
    public void theUserEntersNameEmail(String name, String email) {
        pages.getLoginPage().setSignupName(name);
        pages.getLoginPage().setSignupEmail(email);
    }
    @When("the user clicks signup button on Login_Page")
    public void theUserClicksSignupButton() {
        pages.getLoginPage().clickSignupButton();
    }
    @Then("verify signup page message {string} is visible")
    public void verifySignupPage(String msg) {
        String message = pages.getSignupPage().verifySignupPage();
        Assert.assertTrue(message.contentEquals(msg));
    }

    @When("the user fill details {string} {string} {string} {string}{string} {string} {string} {string} {string} {string} {string} {string}{string}{string}{string} on Signup_Page")
    public void theUserFillDetailsAndClickCreateButton(String gender, String password, String birthDay, String newsletter, String specialOffer, String firstName, String lastName, String company, String address, String address1, String country, String state, String city, String zipCode, String mobilePhone) {
        String[] arr = new String[]{gender, password, birthDay, newsletter, specialOffer, firstName, lastName, company, address, address1, country, state, city, zipCode, mobilePhone};
        pages.getSignupPage().setAddressForm(arr);
    }

    @When("click create button on Signup_Page")
    public void theUserClicksCreateButton() {

        pages.getSignupPage().clickCreateButton();
    }

    @Then("verify account created message {string} is visible")
    public void verifyAccountCreatePage(String msg) {
        String message = pages.getAccountCreatedPage().getCreatedMessage();
        Assert.assertTrue(message.contentEquals(msg));
    }


    @Then("the user clicks continue button on AccountCreated_Page")
    public void theUserClicksContinueButtonOnAccountCreatedPage() {
        pages.getAccountCreatedPage().clickContinueButton();
    }

    @Then("verify the logged in username {string}")
    public void verifyTheLoggedInUsernameName(String name) {
        Assert.assertTrue("Names don't match!", pages.getHeaderAfterLoggedIn().whomLoggedIn().equals(name));
    }

    @When("the user clicks delete account button on Home_Page")
    public void theUserClicksDeleteAccountButton() {
        pages.getHeaderAfterLoggedIn().clickDeleteButton();

    }

    @Then("verify account deleted message {string} is visible and click continue button on AccountDeleted_Page")
    public void verifyAccountDeletePageAndClickContinueButton(String msg) {

        String message = pages.getAccountDeletedPage().getDeletedMessage();
        Assert.assertTrue(message.contentEquals(msg));
        pages.getAccountDeletedPage().clickContinueButton();


    }


}



