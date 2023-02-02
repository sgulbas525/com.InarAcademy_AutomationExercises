package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement nameBox;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement subjectBox;

    @FindBy(id = "message")
    private WebElement messageBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement uploadFile;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='contact-form']/h2")
    private WebElement getInTouchMessage;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement successMessage;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    private WebElement homeButton;

    public String getGetInTouchMessage() {
        return getInTouchMessage.getText();
    }

    public void clickUploadFile() {
        uploadFile.click();
    }

    public void setNameBox(String name) {
        nameBox.sendKeys(name);
    }

    public void setEmailBox(String email) {
        emailBox.sendKeys(email);
    }

    public void setSubjectBox(String subject) {
        subjectBox.sendKeys(subject);
    }

    public void setMessageBox(String message) {
        messageBox.sendKeys(message);
    }

    public void setUploadFile(String file) {
        uploadFile.sendKeys(file);
    }

    public void clickHomeButton() {
        homeButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
