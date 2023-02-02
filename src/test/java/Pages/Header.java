package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    @FindBy(xpath = "(//div/ul/li/a)[1]")
    private WebElement homeButton;

    @FindBy(xpath = "(//div/ul/li/a)[2]")
    private WebElement productButton;

    @FindBy(xpath = "(//div/ul/li/a)[3]")
    private WebElement cartButton;

    @FindBy(xpath = "(//div/ul/li/a)[4]")
    private WebElement signupAndLoginButton;
    @FindBy(xpath = "(//div/ul/li/a)[5]")
    private WebElement testCasesButton;
    @FindBy(xpath = "(//div/ul/li/a)[6]")
    private WebElement APITestingButton;

    @FindBy(xpath = "(//div/ul/li/a)[7]")
    private WebElement videoTutorialsButton;

    @FindBy(xpath = "(//div/ul/li/a)[8]")
    private WebElement contactUsButton;


    public String verifyHomePage() {
        return homeButton.getAttribute("style");
    }

    public String verifyProductsPage() {
        return productButton.getAttribute("style");
    }

    public String verifyCartPage() {
        return cartButton.getAttribute("style");
    }

    public String verifySignup_LoginPage() {
        return signupAndLoginButton.getAttribute("style");
    }

    public String verifyTestCasesPage() {
        return testCasesButton.getAttribute("style");
    }

    public String verifyAPITestingPage() {
        return APITestingButton.getAttribute("style");
    }

    public String verifyVideoTutorialsPage() {
        return videoTutorialsButton.getAttribute("style");
    }

    public String verifyContactUsPage() {
        return contactUsButton.getAttribute("style");
    }

    public void clickLoginSignUpButton() {
        this.signupAndLoginButton.click();
    }

    public void clickProductsButton() {
        productButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickTestCasesButton() {
        testCasesButton.click();
    }

    public void clickAPITestingButton() {
        APITestingButton.click();
    }

    public void clickVideoTutorialsButton() {
        videoTutorialsButton.click();
    }

    public void clickContactUsButton() {
        contactUsButton.click();
    }

}


