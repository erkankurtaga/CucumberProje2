package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class SignInSteps {
    DialogContent dc = new DialogContent();
    @When("Click signin link")
    public void clickSigninLink() {
        dc.findAndClick("signinLink");
    }

    @And("Enter valid user information to login form and click signin button")
    public void enterValidUserInformationToLoginFormAndClickSigninButton() {
        dc.findAndSend("signin-email","erkan.group6a@techno.study");
        dc.findAndSend("signin-pass","A1B2C3D4e5");
        dc.findAndClick("signinBtn");
    }

    @Then("User should be signin successfully")
    public void userShouldBeSigninSuccessfully() {
        dc.findAndContainsText("welcomeMessage","Welcome, erkan group6a!");
    }
}
