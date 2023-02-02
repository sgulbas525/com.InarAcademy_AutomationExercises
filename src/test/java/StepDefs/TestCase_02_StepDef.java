package StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestCase_02_StepDef extends BaseStep {
    @Then("verify {string} is visible")
    public void verifyIsVisible(String msg) {
        String message = pages.getLoginPage().getLoginToYourAccountMessage();
        Assert.assertTrue(message.contentEquals(msg));
    }

    @When("the user enters email {string} address and password {string} on Login_Page")
    public void theUserEntersEmailAddressAndPasswordOnLogin_Page(String email, String password) {
        pages.getLoginPage().setLoginEmail(email);
        pages.getLoginPage().setLoginPassword(password);
    }

    @When("the user clicks login button on Login_Page")
    public void theUserClickLoginButtonOnLogin_Page() {
        pages.getLoginPage().clickLoginButton();
    }

    @Then("verify the logged in username {string} is visible")
    public void verifyTheLoggedInUsernameIsVisible(String name) {
        String whomLogged = pages.getHeaderAfterLoggedIn().whomLoggedIn();
        Assert.assertTrue(whomLogged.contentEquals(name));
    }

}
