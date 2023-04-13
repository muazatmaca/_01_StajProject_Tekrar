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

    // user story 1
    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    // humon resource un altındaki setup
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement humanResourscesSetup;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1")
    public WebElement positionCategories;

    @FindBy(xpath = "")
    public WebElement attestations;

    // user story 2 ve 3
    // left nav daki dashboard un altındaki setup
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement firstSetup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "")
    public WebElement DocumenTypes;

    // user story 4
    // diğer locaterlar ortak yukarı tarafı inceleyiniz
    @FindBy(xpath = "xpath = \"//span[text()='Fields']" )
    public WebElement fields;

    // user Story 5
    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positions;

    //user story 6
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

    // user story 8
    // steup ve school setup locaterları yularıdan bulunuz

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement departmanents;

    // user story 9
    // steup ve parametres locaterları yularıdan bulunuz

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement bankAccounts;

    // user story 10
    // setup ve parametres locaterlarını yukarıdan bulunuz

    @FindBy(xpath = "")
    public WebElement gradeLevels;

    // user story 11
    // setup ve parameters locaterları yukarıdan al

    @FindBy(xpath = "//span[text()='Discounts']")
    public WebElement disCounts;

    // user story 12
    // setup ve parameters locaterları yukarıdan al

    @FindBy(xpath = "")
    public WebElement nationalities;





    public WebElement getWebElement(String strButton){

        switch (strButton){

            case "setupButton":return setupButton;
            case "humanResources":return humanResources;
            case "humanResourscesSetup":return humanResourscesSetup;
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
            case "bankAccounts":return bankAccounts;
            case "gradeLevels":return gradeLevels;
            case "disCounts":return disCounts;
            case "departmanents":return departmanents;
            case "nationalities":return nationalities;

        }

        return null;
    }


}
