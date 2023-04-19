package StepDefinitions;

import Page.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_10_Steps_Etka {
    DialogContent dc=new DialogContent();
    @Then("Delete the user from the list")
    public void deleteTheUserFromTheList(DataTable items) {
        List<String> strButtons=items.asList(String.class);

        for (String strButton: strButtons){
            WebElement element=dc.getWebElement(strButton);
            dc.clickFunction(element);
        }
    }
}
