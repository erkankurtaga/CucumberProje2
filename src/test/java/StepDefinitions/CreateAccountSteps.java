package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CreateAccountSteps {

    DialogContent dc = new DialogContent();
    @Given("Navigate to luma")
    public void navigateToLuma() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Click register link")
    public void clickRegisterLink() {
        dc.findAndClick("createaccount");
    }

    @Then("User should be registered successfully")
    public void userShouldBeRegisteredSuccessfully() {
        dc.findAndContainsText("successMessage","Thank you for registering");
    }

    @And("Enter valid user information to register form and click create account button")
    public void enterValidUserInformationToRegisterFormAndClickCreateAccountButton(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }

        dc.findAndClick("saveaccount");
    }
}
