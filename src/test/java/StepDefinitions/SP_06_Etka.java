package StepDefinitions;

import Page.DialogContent;
import Page.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SP_06_Etka {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");

    }


}
