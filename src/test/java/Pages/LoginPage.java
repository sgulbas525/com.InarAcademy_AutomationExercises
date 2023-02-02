package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Email Address']")
    private WebElement loginEmail;

    @FindBy(xpath = "//input[@placeholder='Password']")
     private WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement signupName;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    private WebElement signupEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signupButton;

    @FindBy(xpath = "//div[@class='signup-form']//h2")
    private WebElement newUSerSignUpMessage;

    @FindBy(xpath = "//div[@class='login-form']/h2")
    private WebElement loginToYourAccountMessage;

    @FindBy(xpath = "//form[@action='/login']/p")
    private WebElement errorMessageForInvalidCredentialsInLogin;

    @FindBy(xpath = "//form[@action='/signup']/p")
    private WebElement errorMessageForEmailAlreadyExistInSignup;

    public void setSignupName(String name) {
        signupName.sendKeys(name);
    }

    public void setSignupEmail(String email) {
        signupEmail.sendKeys(email);
    }

    public void clickSignupButton() {
        signupButton.click();
    }

    public void setLoginPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void setLoginEmail(String name){
        loginEmail.sendKeys(name);
    }
    public String getNewUSerSignUpMessage(){
        return newUSerSignUpMessage.getText();
    }
    public String getLoginToYourAccountMessage(){
        return loginToYourAccountMessage.getText();
    }

    public void clickLoginButton(){
        loginButton.click();
    }



public String getInvalidCredentialsErrorMessage(){
        return errorMessageForInvalidCredentialsInLogin.getText();
}

public String getEmailAlreadyExistErrorMessage(){
        return errorMessageForEmailAlreadyExistInSignup.getText();
}
}

