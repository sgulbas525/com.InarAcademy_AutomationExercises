package StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TestCase_07_stepDef extends BaseStep{
    @When("the user clicks on test cases button on Home_Page")
    public void theUserClicksOnTestCasesButtonOnHome_Page(){
        pages.getHeader().clickTestCasesButton();
    }


    @Then("verify that TestCases_Page is visible successfully")
    public void verifyThatTestCases_PageIsVisibleSuccessfully() {
        String style = pages.getHeader().verifyTestCasesPage();
        Assert.assertTrue(style.contentEquals("color: orange;"));
    }
}
