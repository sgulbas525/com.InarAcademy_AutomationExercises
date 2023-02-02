package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends BasePage {

    @FindBy(xpath = "//h2[@class='title text-center']/b")
    private WebElement accountDeletedMessage;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButton;

    public String getDeletedMessage() {
        return accountDeletedMessage.getText();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

}
