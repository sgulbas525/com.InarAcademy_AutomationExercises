package StepDefs;

import io.cucumber.java.en.When;

public class TestCase_04_StepDef extends BaseStep{
        @When("the user clicks logout button on Home_Page")
        public void theUserCLicksLogoutButton(){
            pages.getHeaderAfterLoggedIn().clickLogoutButton();
        }

}
