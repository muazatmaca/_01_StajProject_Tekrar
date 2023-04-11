package Page;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupButton;

    // user story 1 ve user story 2 locater lar
    @FindBy(xpath = "")
    public WebElement humonResources;

    // humon resource un altındaki setup
    @FindBy(xpath = "")
    public WebElement humonResourscesSetup;

    @FindBy(xpath = "")
    public WebElement positionCategories;

    @FindBy(xpath = "")
    public WebElement attestations;

    // user story 3 ve 4
    // left nav daki dashboard un altındaki setup
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement firstSetup;

    @FindBy(xpath = "")
    public WebElement parameters;

    @FindBy(xpath = "")
    public WebElement DocumenTypes;

    @FindBy(xpath = "")
    public WebElement fields;

    // user story 5
    // diğer locaterlar ortak yukarı tarafı inceleyiniz
    @FindBy(xpath = "")
    public WebElement positions;

    // user Story 6
    @FindBy(xpath = "")
    public WebElement education;

    // farklı setuplar olduğu için farklı adlandırdım
    @FindBy(xpath = "")
    public WebElement educationSetup;

    @FindBy(xpath = "")
    public WebElement subjectCategories;

    // user story 7
    // setup ı ortak locaterdan alınız

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement locations;

    public WebElement getWebElement(String strButton){

        switch (strButton){

            case "setupButton":return setupButton;
            case "humonResources":return humonResources;
            case "humonResourscesSetup":return humonResourscesSetup;
            case "positionCategories":return positionCategories;
            case "attestations":return attestations;
            case "firstSetup":return firstSetup;
            case "parameters":return parameters;
            case "DocumenTypes":return DocumenTypes;
            case "fields":return fields;
            case "positions":return positions;
            case "education":return education;
            case "educationSetup":return educationSetup;
            case "subjectCategories":return subjectCategories;
            case "schoolSetup":return schoolSetup;
            case "locations":return locations;

        }

        return null;
    }


}
