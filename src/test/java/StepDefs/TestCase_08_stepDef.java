package StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TestCase_08_stepDef extends BaseStep {
    @When("the user clicks on product button on Home_Page")
    public void theUserClicksOnProductButtonOnHome_Page() {
        pages.getHeader().clickProductsButton();
    }

    @Then("verify Product_Page is visible successfully")
    public void verifyProduct_PageIsVisibleSuccessfully() {
        String style = pages.getHeader().verifyProductsPage();
        Assert.assertTrue(style.contentEquals("color: orange;"));
    }

    @Then("verify the product list is visible on Product_Page")
    public void verifyTheProductListIsVisibleOnProduct_Page() {
        String msg = pages.getProductPage().getAllProductMessage();
        Assert.assertEquals(msg, "ALL PRODUCTS");
    }

    @When("the user clicks view product of first product on Product_Page")
    public void theUserClicksViewProductOfFirstProductOnProduct_Page() {
        pages.getProductPage().clickViewProduct(0);
    }

    @Then("verify that detail is visible on ProductDetail_Page")
    public void verifyThatDetailIsVisible() {
        String msg = pages.getProductDetailPage().getWriteYourReviewMessage();
        Assert.assertEquals("WRITE YOUR REVIEW", msg);
    }

}
