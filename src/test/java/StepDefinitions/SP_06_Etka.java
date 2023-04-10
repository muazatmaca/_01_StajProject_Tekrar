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

    @Then("Click add button")
    public void clickAddButton(DataTable dt){
        List<String> dcButtons = dt.asList(String.class);
        for (String dcButton : dcButtons) {

            WebElement element = dc.getWebElement(dcButton);

            dc.clickFunction(element);
        }

    }

    @And("Sending the keys for adding new position")
    public void sendingTheKeysForAddingNewPosition(DataTable dt) {
        List< List<String> > items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }

    }

    @And("Click the save button")
    public void clickTheSaveButton(DataTable dt){
        List<String> dcButtons = dt.asList(String.class);
        for (String dcButton : dcButtons) {

            WebElement element = dc.getWebElement(dcButton);

            dc.clickFunction(element);
        }
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");

    }

    @Then("Click the edit button")
    public void clickTheEditButton(DataTable dt) {
        List<String> dcButtons = dt.asList(String.class);
        for (String dcButton : dcButtons) {

            WebElement element = dc.getWebElement(dcButton);

            dc.clickFunction(element);
        }
    }

    @Then("Sending the keys for editing the position")
    public void sendingTheKeysForEditingThePosition(DataTable dt) {
        List< List<String> > items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @And("Click the save button after editing")
    public void clickTheSaveButtonAfterEditing(DataTable dt){
        List<String> dcButtons = dt.asList(String.class);
        for (String dcButton : dcButtons) {

            WebElement element = dc.getWebElement(dcButton);

            dc.clickFunction(element);
        }
    }

    @Then("Click on the delete button and delete the position")
    public void clickOnTheDeleteButtonAndDeleteThePosition(DataTable dt) {
        List<String> dcButtons = dt.asList(String.class);
        for (String dcButton : dcButtons) {

            WebElement element = dc.getWebElement(dcButton);

            dc.clickFunction(element);
        }
    }

    }
