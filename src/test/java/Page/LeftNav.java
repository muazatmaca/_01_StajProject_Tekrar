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

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement humanResourscesSetup;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    public WebElement positionCategories;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    public WebElement attestations;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement firstSetup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement DocumenTypes;

    @FindBy(xpath = "//span[text()='Fields']" )
    public WebElement fields;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positions;

    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement educationSetup;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    public WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement locations;

    @FindBy(xpath = "(//span[text()='Departments'])[1]")
    public WebElement departments;

    // user story 8
    // steup ve school setup locaterları yularıdan bulunuz
    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement departmanents;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Discounts']")
    public WebElement disCounts;

    @FindBy(xpath = "//span[text()='Nationalities']")
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
            case "departments":return departments;
        }
        return null;
    }
}
