package Pages;

import Utilities.GWD;
import Utilities.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Create an Account")
    private WebElement createAccountLink;

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "email_address")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "password-confirmation")
    private WebElement passConfirmInput;

    @FindBy(xpath = "//button[@title='Create an Account']")
    private WebElement createAccountBtn;

    @FindBy(xpath = "//div[contains(@data-bind,'html')]")
    private WebElement successMessage;

    @FindBy(linkText = "Sign In")
    private WebElement signinLink;

    @FindBy(name = "login[username]")
    private WebElement loginusername;

    @FindBy(name = "login[password]")
    private WebElement loginpassword;

    @FindBy(id = "send2")
    private WebElement signinBtn;

    @FindBy(css = "span[class='logged-in']")
    private WebElement welcomeMessage;

    @FindBy(css = "span[class='customer-name'] button")
    private WebElement menuIcon;

    @FindBy(xpath = "//li//a[contains(text(),'My Account')]")
    private WebElement myAccountMenu;

    @FindBy(xpath = "//a//span[contains(text(),'Manage Addresses')]")
    private WebElement manageAddressLink;

    @FindBy(id = "telephone")
    private WebElement phoneInput;

    @FindBy(id = "street_1")
    private WebElement street1Input;

    @FindBy(id = "street_2")
    private WebElement street2Input;

    @FindBy(id = "street_3")
    private WebElement street3Input;

    @FindBy(id = "zip")
    private WebElement zipInput;

    @FindBy(id = "country")
    private WebElement countrySelect;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(xpath = "//button[@title='Save Address']")
    private WebElement saveAddressBtn;

    @FindBy(xpath = "//button[@title='Add New Address']")
    private WebElement addAddressBtn;

    @FindBy(css = "li[class='product-item']")
    private List<WebElement> products;

    @FindBy(id = "product-addtocart-button")
    private WebElement addtocart;

    @FindBy(xpath = "//span[@class='swatch-attribute-label' and text()='Size']")
    private List<WebElement> sizeLabel;

    @FindBy(xpath = "//div[@class = 'swatch-option text']")
    private List<WebElement> productsizes;

    @FindBy(xpath = "//span[@class='swatch-attribute-label' and text()='Color']")
    private List<WebElement> colorLabel;

    @FindBy(xpath = "//div[@class='swatch-option color']")
    private List<WebElement> productcolors;

    @FindBy(xpath = "//div [@data-block='minicart']//a")
    private WebElement minicart;

    @FindBy(id = "top-cart-btn-checkout")
    private WebElement checkout;

    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']//button") //"//button[@data-role='opc-continue']")
    private WebElement nextBtn;

    @FindBy(xpath = "//button[@title='Place Order']")
    private WebElement placeOrder;

    @FindBy(xpath = "//span[@data-ui-id='page-title-wrapper']")
    private WebElement pageTitleWrapper;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        switch (strElement) {
            case "firstname":
                myElement = firstNameInput;
                break;
            case "lastname":
                myElement = lastNameInput;
                break;
            case "email":
                myElement = emailInput;
                break;
            case "password":
                myElement = passwordInput;
                break;
            case "passconfirm":
                myElement = passConfirmInput;
                break;
            case "signin-email":
                myElement = loginusername;
                break;
            case "signin-pass":
                myElement = loginpassword;
                break;
            case "phone":
                myElement = phoneInput;
                break;
            case "address1":
                myElement = street1Input;
                break;
            case "address2":
                myElement = street2Input;
                break;
            case "address3":
                myElement = street3Input;
                break;
            case "city":
                myElement = cityInput;
                break;
            case "zipcode":
                myElement = zipInput;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndSelect(String strElement, String value) {  // 2.aşama
        switch (strElement) {
            case "country-select":
                myElement = countrySelect;
                break;
        }

        selectTextFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        switch (strElement) {
            case "createaccount":
                myElement = createAccountLink;
                break;
            case "saveaccount":
                myElement = createAccountBtn;
                break;
            case "signinLink":
                myElement = signinLink;
                break;
            case "signinBtn":
                myElement = signinBtn;
                break;
            case "menuIcon":
                myElement = menuIcon;
                break;
            case "myAccount":
                myElement = myAccountMenu;
                break;
            case "manageAddress":
                myElement = manageAddressLink;
                break;
            case "saveAddress":
                myElement = saveAddressBtn;
                break;
            case "addAddress":
                myElement = addAddressBtn;
                break;
            case "product":
                if (products.size() > 0) {
                    int gen1 = 0;
                    if (products.size() > 1)
                        Tools.RandomGenerator(products.size());
                    myElement = products.get(gen1);
                }
                break;
            case "product-size":
                if (sizeLabel.size() > 0) {
                    if (productsizes.size() > 0) {
                        int gen2 = 0;

                        if (productsizes.size() > 1)
                            gen2 = Tools.RandomGenerator(productsizes.size());

                        myElement = productsizes.get(gen2);
                    }
                }
                break;
            case "product-color":
                if (colorLabel.size() > 0) {
                    if (productcolors.size() > 0) {
                        int gen3 = 0;

                        if (productcolors.size() > 1)
                            gen3 = Tools.RandomGenerator(productcolors.size());

                        myElement = productcolors.get(gen3);
                    }
                }
                break;
            case "addtocart":
                myElement = addtocart;
                break;
            case "minicart":
                myElement = minicart;
                break;
            case "checkout":
                myElement = checkout;
                break;
            case "next":
                myElement = nextBtn;
                break;
            case "place-order":
                myElement = placeOrder;
                break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        switch (strElement) {
            case "successMessage":
                myElement = successMessage;
                break;
            case "welcomeMessage":
                myElement = welcomeMessage;
                break;
            case "pageTitleWrapper":
                myElement = pageTitleWrapper;
                break;
        }

        verifyContainsText(myElement, text);
    }

}
