package StepDefinitions;

import Page.DialogContent;
import io.cucumber.java.en.Then;

public class _02_Haticesteps {
    DialogContent dc=new DialogContent();

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
dc.verifyContainsTextFunction(dc.successMsg,"success");
    }
}
