package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDetailPage extends BasePage{
    @FindBy(xpath = "//div[@class='product-information']/h2")
    private WebElement clothesName;

    @FindBy(xpath = "(//div[@class='product-information']/p)[2]")
    private WebElement availability;

    @FindBy(xpath = "//div[@class='product-information']/span/span")
    private WebElement price;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    private WebElement addToCartButton;

    @FindBy(id = "name")
    private WebElement nameBoxInReview;

    @FindBy(id = "email")
    private WebElement emailBoxInReview;

    @FindBy(id = "review")
    private WebElement reviewBoxInReview;

    @FindBy(id = "button-review")
    private WebElement submitButton;

    @FindBy(xpath = "//li[@class='active']/a")
    private WebElement writeYourReviewMessage;

    public String getWriteYourReviewMessage() {
        return writeYourReviewMessage.getText();
    }

    public void setNameBoxInReview(String name) {
        nameBoxInReview.sendKeys(name);
    }

    public void setEmailBoxInReview(String email) {
        emailBoxInReview.sendKeys(email);
    }

    public void setReviewBoxInReview(String review) {
        reviewBoxInReview.sendKeys(review);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getClothesName() {
        return clothesName.getText();
    }

    public String getAvailability() {
        return availability.getText();
    }

    public String getPrice() {
        return price.getText();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }
}
