package StepDefinitions;

import Page.DialogContent;
import io.cucumber.java.en.Then;

public class US_07_Steps_Muaz {
    DialogContent dc=new DialogContent();
    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExistText,"already exist");

    }
}
