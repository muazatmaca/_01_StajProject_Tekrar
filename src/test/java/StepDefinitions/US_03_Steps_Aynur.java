package StepDefinitions;

import Utility.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US_03_Steps_Aynur {


    @And("Click escape")
    public void clickEscape() {
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }
}
