package StepDefinitions;

import Page.DialogContent;
import io.cucumber.java.en.Then;

public class _US_07_Steps {
    DialogContent dc=new DialogContent();
    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExistText,"already exist");

    }
}
