package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignupPage extends BasePage {
    @FindBy(xpath = "//div[@class='login-form']/h2/b")
    private WebElement enterAccountInfoMessage;

    @FindBy(id = "id_gender1")
    private WebElement genderMr;

    @FindBy(id = "id_gender2")
    private WebElement genderMrs;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "days")
    private WebElement dateOfBirt_DAYs;

    @FindBy(id = "months")
    private WebElement dateOfBirt_MONTHs;

    @FindBy(id = "years")
    private WebElement dateOfBirt_YEARs;

    @FindBy(id = "newsletter")
    private WebElement newsLetter;

    @FindBy(id = "optin")
    private WebElement specialOffers;

    @FindBy(xpath = "//input[@class='form-control']")
    private List<WebElement> addressForm;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement createButton;




    @FindBy(xpath = "//div[@class='login-form']/h2/b")
    private WebElement signupPageVerifyingText;



    public String getAccountInfoMessage() {
        return enterAccountInfoMessage.getText();
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("mr")) {
            selectMrTitle();
        } else if (gender.equalsIgnoreCase("mrs")) {
            selectMrsTitle();
        } else
            System.out.println("Invalid gender");

    }

    private void selectMrTitle() {
        genderMr.click();
    }

    private void selectMrsTitle() {
        genderMrs.click();
    }

    public void setName(String name) {
        this.name.clear();
        this.name.sendKeys(name);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setBirthDayMonthYear(String birthDay) {
        String[] arr = birthDay.split("\\.");
        setDay(arr[0]);
        setMonth(arr[1]);
        setYear(arr[2]);
    }

    private void setDay(String day) {
        dateOfBirt_DAYs.click();
        Select select = new Select(dateOfBirt_DAYs);
        select.selectByVisibleText(day);
    }

    private void setMonth(String month) {
        dateOfBirt_MONTHs.click();
        Select select = new Select(dateOfBirt_MONTHs);
        String m = "";
        switch (month) {
            case "1":
                m = "January";
                break;
            case "2":
                m = "February";
                break;
            case "3":
                m = "March";
                break;
            case "4":
                m = "April";
                break;
            case "5":
                m = "May";
                break;
            case "6":
                m = "June";
                break;
            case "7":
                m = "July";
                break;
            case "8":
                m = "August";
                break;
            case "9":
                m = "September";
                break;
            case "10":
                m = "October";
                break;
            case "11":
                m = "November";
                break;
            case "12":
                m = "December";
        }
        select.selectByVisibleText(m);
    }

    private void setYear(String year) {
        dateOfBirt_YEARs.click();
        Select select = new Select(dateOfBirt_YEARs);
        select.selectByVisibleText(year);
        dateOfBirt_YEARs.sendKeys(Keys.ESCAPE);

    }

    public void selectNewsletterTitle() {
        newsLetter.click();
    }

    public void unselectNewsletterTitle() {
        if (newsLetter.isSelected())
            newsLetter.click();
    }


    public void selectSpecialOffersTitle() {
        specialOffers.click();
    }

    public void unselectSpecialOffersTitle() {
        if (specialOffers.isSelected())
            specialOffers.click();
    }

    public void setAddressForm(String[] input) {
        selectGender(input[0]);
        setPassword(input[1]);
        setBirthDayMonthYear(input[2]);

        if (input[3].equalsIgnoreCase("yes")) {
            selectNewsletterTitle();
        } else {
            unselectNewsletterTitle();
        }


        if (input[4].equalsIgnoreCase("yes")) {
            selectSpecialOffersTitle();
        } else {
            unselectSpecialOffersTitle();
        }


        for (int i = 3, j = 5; i < addressForm.size(); i++, j++) {
            if (input[j].equals("null")) {
                continue;
            }
            addressForm.get(i).sendKeys(input[j]);

            if (i == 9) {
                Select select = new Select(country);
                select.selectByVisibleText("United States");
            }

        }
    }

    public void clickCreateButton() {
        createButton.click();
    }

    public void setAddress2(String address) {
        addressForm.get(4).sendKeys(address);
    }

    public void setCompany(String company) {
        addressForm.get(2).sendKeys(company);
    }




    public String verifySignupPage() {
        return signupPageVerifyingText.getText();
    }
}
