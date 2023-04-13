package StepDefinitions;

import Page.DialogContent;
import Page.LeftNav;
import io.cucumber.java.en.Then;

public class US_06_Etka {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");

    }


}
