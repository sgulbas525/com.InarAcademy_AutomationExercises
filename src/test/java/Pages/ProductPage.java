package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {
    @FindBy(id = "search_product")
    private WebElement searchBox;

    @FindBy(id = "submit_search")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='choose']//a")
    private List<WebElement> viewProductButtonOfAllProducts;

    @FindBy(xpath = "(//a[@data-parent='#accordian'])[1]")
    private WebElement womenButton;

    @FindBy(xpath = "(//a[@data-parent='#accordian'])[2]")
    private WebElement menButton;

    @FindBy(xpath = "(//a[@data-parent='#accordian'])[3]")
    private WebElement kidsButton;

    @FindBy(xpath = "//div[@id='Women']/div/ul/li/a")
    private List<WebElement> categoriesButtonsForWomen;

    @FindBy(xpath = "//div[@id='Men']/div/ul/li/a")
    private List<WebElement> categoriesButtonsForMen;

    @FindBy(xpath = "//div[@id='Kids']/div/ul/li/a")
    private List<WebElement> categoriesButtonsForKids;

    @FindBy(xpath = "//div[@class='productinfo text-center']//a")
    private List<WebElement> addToCartButtonsOfAllProducts;

    @FindBy(xpath = "//div[@class='productinfo text-center']//p")
    private List<WebElement> productsName;

    @FindBy(xpath = "//div[@class='brands-name']/ul/li/a")
    private List<WebElement> brandsButton;

    @FindBy(xpath = "//div[@class='brands-name']/ul/li/a/span")
    private List<WebElement> brandsName;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement allProductMessage;

    public String getAllProductMessage() {
        return allProductMessage.getText();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void setSearchBox(String s) {
        searchBox.sendKeys(s);
    }

    public void clickAddToProduct(String name) {
        for (int i = 0; i < addToCartButtonsOfAllProducts.size(); i++) {
            if (productsName.get(i).getText().equalsIgnoreCase(name)) {
                addToCartButtonsOfAllProducts.get(i).click();
                return;
            }
        }
    }

    public void clickViewProduct(String name) {
        for (int i = 0; i < addToCartButtonsOfAllProducts.size(); i++) {
            if (productsName.get(i).getText().equalsIgnoreCase(name)) {
                viewProductButtonOfAllProducts.get(i).click();
                return;
            }
        }
    }

    public void clickBrand(String brand) {
        for (int i = 0; i < brandsButton.size(); i++) {
            if (brandsName.get(i).getText().equalsIgnoreCase(brand)) {
                brandsButton.get(i).click();
                return;
            }
        }
    }

    public void clickOptionFromCategory(String option, String clothes) {
        switch (option.toLowerCase()) {
            case "women":
                womenButton.click();
                for (WebElement c : categoriesButtonsForWomen) {
                    if (c.getText().equalsIgnoreCase(clothes)) {
                        c.click();
                    }
                }
                break;
            case "men":
                menButton.click();
                for (WebElement c : categoriesButtonsForMen) {
                    if (c.getText().equalsIgnoreCase(clothes)) {
                        c.click();
                    }
                }
                break;
            case "kids":
                kidsButton.click();
                for (WebElement c : categoriesButtonsForKids) {
                    if (c.getText().equalsIgnoreCase(clothes)) {
                        c.click();
                    }
                }
                break;
            default:
                Assert.fail("Invalid option");
        }
    }

    public void clickAddToProduct(int index) {
        addToCartButtonsOfAllProducts.get(index).click();
    }

    public void clickBrand(int index) {
        brandsButton.get(index).click();
    }

    public void clickViewProduct(int index) {
        viewProductButtonOfAllProducts.get(index).click();
    }
}

