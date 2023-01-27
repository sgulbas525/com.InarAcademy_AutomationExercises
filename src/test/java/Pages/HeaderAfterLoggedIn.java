package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderAfterLoggedIn extends BasePage {
    @FindBy(xpath = "(//div/ul/li/a)[1]")
    private WebElement homeButton;

    @FindBy(xpath = "(//div/ul/li/a)[2]")
    private  WebElement productButton;

    @FindBy(xpath = "(//div/ul/li/a)[3]")
    private  WebElement cartButton;

    @FindBy(xpath = "(//div/ul/li/a)[4]")
    private  WebElement logoutButton;


    @FindBy(xpath = "(//div/ul/li/a)[5]")
    private  WebElement deleteAccountButton;

    @FindBy(xpath = "(//div/ul/li/a)[7]")
    private  WebElement testCasesButton;
    @FindBy(xpath = "(//div/ul/li/a)[8]")
    private  WebElement APITestingButton;

    @FindBy(xpath = "(//div/ul/li/a)[9]")
    private  WebElement videoTutorialsButton;

    @FindBy(xpath = "(//div/ul/li/a)[10]")
    private  WebElement contactUsButton;

    @FindBy(xpath = "(//div/ul/li)[10]/a/b")
    private  WebElement whomLogged;





    public  void clickProductsButton() {
        productButton.click();
    }
    public  void clickCartButton() {
        cartButton.click();
    }
    public  void clickLogoutButton() {
        logoutButton.click();
    }
    public  void clickDeleteButton() {
        deleteAccountButton.click();
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

    public  String whomLoggedIn(){
        return whomLogged.getText();

    }
}
