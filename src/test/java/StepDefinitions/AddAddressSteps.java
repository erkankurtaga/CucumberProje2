package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class AddAddressSteps {
    DialogContent dc = new DialogContent();

    @And("User should be navigate to My Account page")
    public void userShouldBeNavigateToMyAccountPage() {
        dc.findAndClick("menuIcon");
        dc.findAndClick("myAccount");
    }

    @And("User should be click to Manage Address link")
    public void userShouldBeClickToManageAddressLink() {
        dc.findAndClick("manageAddress");
        dc.findAndClick("addAddress");
    }

    @And("User should be enter address information")
    public void userShouldBeEnterAddressInformation(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++) {
            if (listElement.get(i).get(0).contains("-select"))
                dc.findAndSelect(listElement.get(i).get(0), listElement.get(i).get(1));
            else
                dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }

        dc.findAndClick("saveAddress");
    }

    @And("User should be save the adress successfully")
    public void userShouldBeSaveTheAdressSuccessfully() {
        dc.findAndContainsText("successMessage","You saved the address");
    }
}
