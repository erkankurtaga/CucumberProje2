package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class PurchaseProductSteps {

    DialogContent dc = new DialogContent();
    @And("User should select a product add to cart")
    public void userShouldSelectAProductAddToCart() {
        dc.findAndClick("product");
        dc.findAndClick("product-size");
        dc.findAndClick("product-color");
        dc.findAndClick("addtocart");
    }

    @And("User should navigate cart to proceed to checkout")
    public void userShouldNavigateCartToProceedToCheckout() {
        dc.findAndClick("minicart");
        dc.findAndClick("checkout");

        dc.waitUntilUrlToBe("https://magento.softwaretestingboard.com/checkout/#shipping");
        dc.findAndClick("next");

        dc.findAndClick("place-order");
    }

    @And("User should be purchase the product successfully")
    public void userShouldBePurchaseTheProductSuccessfully() {
        dc.findAndContainsText("pageTitleWrapper","Thank you for your purchase!");
    }
}
