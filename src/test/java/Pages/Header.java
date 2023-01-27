package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class Header extends BasePage{
    @FindBy(xpath = "(//div/ul/li/a)[1]")
    private  WebElement homeButton;

    @FindBy(xpath = "(//div/ul/li/a)[2]")
    private  WebElement productButton;

    @FindBy(xpath = "(//div/ul/li/a)[3]")
    private  WebElement cartButton;

    @FindBy(xpath = "(//div/ul/li/a)[4]")
    private  WebElement loginAndSignupButton;
    @FindBy(xpath = "(//div/ul/li/a)[5]")
    private  WebElement testCasesButton;
    @FindBy(xpath = "(//div/ul/li/a)[6]")
    private  WebElement APITestingButton;

    @FindBy(xpath = "(//div/ul/li/a)[7]")
    private  WebElement videoTutorialsButton;

    @FindBy(xpath = "(//div/ul/li/a)[8]")
    private  WebElement contactUsButton;





    public  void clickLoginSignUpButton() {
        this.loginAndSignupButton.click();
    }
    public  void clickProductsButton() {
            productButton.click();
    }
    public  void clickCartButton() {
            cartButton.click();
    }
    public  void clickTestCasesButton() {
            testCasesButton.click();
    }
    public  void clickAPITestingButton() {
            APITestingButton.click();
    }
    public  void clickVideoTutorialsButton() {
            videoTutorialsButton.click();
    }
    public  void clickContactUsButton() {
            contactUsButton.click();
    }

    }


