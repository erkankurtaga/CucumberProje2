package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText="Create an Account")
    private WebElement createAccountLink;

    @FindBy(id="firstname")
    private WebElement firstNameInput;

    @FindBy(id="lastname")
    private WebElement lastNameInput;

    @FindBy(id="email_address")
    private WebElement emailInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(id="password-confirmation")
    private WebElement passConfirmInput;

    @FindBy(xpath="//button[@title='Create an Account']")
    private WebElement createAccountBtn;

    @FindBy(xpath = "//div[contains(@data-bind,'html')]")
    private WebElement successMessage;

    @FindBy(linkText="Sign In")
    private WebElement signinLink;

    @FindBy(name = "login[username]")
    private WebElement loginusername;

    @FindBy(name = "login[password]")
    private WebElement loginpassword;

    @FindBy(id="send2")
    private WebElement signinBtn;

    @FindBy(css = "span[class='logged-in']")
    private WebElement welcomeMessage;

    @FindBy(css="span[class='customer-name'] button")
    private WebElement menuIcon;

    @FindBy(xpath="//li//a[contains(text(),'My Account')]")
    private WebElement myAccountMenu;

    @FindBy(xpath="//a//span[contains(text(),'Manage Addresses')]")
    private WebElement manageAddressLink;

    @FindBy(id="telephone")
    private WebElement phoneInput;

    @FindBy(id="street_1")
    private WebElement street1Input;

    @FindBy(id="street_2")
    private WebElement street2Input;

    @FindBy(id="street_3")
    private WebElement street3Input;

    @FindBy(id="zip")
    private WebElement zipInput;

    @FindBy(id="country")
    private WebElement countrySelect;

    @FindBy(id="city")
    private WebElement cityInput;

    @FindBy(xpath = "//button[@title='Save Address']")
    private WebElement saveAddressBtn;

    @FindBy(xpath = "//button[@title='Add New Address']")
    private WebElement addAddressBtn;
    WebElement myElement;

    public void findAndSend(String strElement,String value){  // 2.aşama
        switch (strElement)
        {
            case "firstname" : myElement = firstNameInput; break;
            case "lastname" : myElement = lastNameInput; break;
            case "email" : myElement = emailInput; break;
            case "password" : myElement = passwordInput; break;
            case "passconfirm" : myElement = passConfirmInput; break;
            case "signin-email" : myElement = loginusername; break;
            case "signin-pass" : myElement = loginpassword; break;
            case "phone" : myElement = phoneInput; break;
            case "address1" : myElement = street1Input; break;
            case "address2" : myElement = street2Input; break;
            case "address3" : myElement = street3Input; break;
            case "city" : myElement = cityInput; break;
            case "zipcode" : myElement = zipInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndSelect(String strElement,String value){  // 2.aşama
        switch (strElement)
        {
            case "country-select" : myElement = countrySelect; break;
        }

        selectTextFunction(myElement, value);
    }
    public void findAndClick(String strElement){  // 2.aşama
        switch (strElement)
        {
            case "createaccount" : myElement =createAccountLink; break;
            case "saveaccount" : myElement =createAccountBtn; break;
            case "signinLink" : myElement =signinLink; break;
            case "signinBtn" : myElement =signinBtn; break;
            case "menuIcon": myElement = menuIcon; break;
            case "myAccount": myElement = myAccountMenu; break;
            case "manageAddress": myElement = manageAddressLink; break;
            case "saveAddress": myElement = saveAddressBtn; break;
            case "addAddress": myElement = addAddressBtn; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        switch (strElement)
        {
            case "successMessage" : myElement = successMessage; break;
            case "welcomeMessage" : myElement = welcomeMessage; break;
        }

        verifyContainsText(myElement,text);
    }

}
