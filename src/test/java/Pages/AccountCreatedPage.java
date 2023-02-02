package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{

    @FindBy(xpath = "//h2[@class='title text-center']/b")
    WebElement accountCreatedMessage;


    @FindBy(xpath = "//div[@class='pull-right']/a")
    WebElement continueButton;

    public String getCreatedMessage() {
        return accountCreatedMessage.getText();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
