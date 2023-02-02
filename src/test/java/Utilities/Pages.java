package Utilities;
import Pages.*;

public class Pages {
    public ProductsDetailPage getProductDetailPage() {
        return productDetailPage;
    }


    private ProductsDetailPage productDetailPage;

    private ContactUsPage contactUsPage;
    private AccountCreatedPage accountCreatedPage;

    private AccountDeletedPage accountDeletedPage;
    private HeaderAfterLoggedIn headerAfterLoggedIn;
    private Header header;
    private  HomePage homePage;
    private  LoginPage loginPage;
    private  SignupPage signupPage;
    public Pages() {

        this.productDetailPage = new ProductsDetailPage();
        this.productPage = new ProductPage();
        this.contactUsPage = new ContactUsPage();
        this.accountCreatedPage = new AccountCreatedPage();
        this.accountDeletedPage = new AccountDeletedPage();
        this.headerAfterLoggedIn = new HeaderAfterLoggedIn();
        this.header = new Header();
        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
        this.signupPage = new SignupPage();
    }
    private ProductPage productPage;

    public ProductPage getProductPage() {
        return productPage;
    }

    public ContactUsPage getContactUsPage() {
        return contactUsPage;
    }

    public AccountCreatedPage getAccountCreatedPage() {
        return accountCreatedPage;
    }

    public AccountDeletedPage getAccountDeletedPage() {
        return accountDeletedPage;
    }

    public HeaderAfterLoggedIn getHeaderAfterLoggedIn() {
        return headerAfterLoggedIn;
    }

    public Header getHeader() {
        return header;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public SignupPage getSignupPage() {
        return signupPage;
    }
}
