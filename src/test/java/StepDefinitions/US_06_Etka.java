package StepDefinitions;

import Page.DialogContent;
import Page.LeftNav;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class US_06_Etka {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");

    }


}
