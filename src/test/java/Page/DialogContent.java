package Page;

import Utility.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button//button")
    public WebElement addButton;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement addInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement addCode;

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDiaologBtn;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExistText;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    public WebElement nameInput2;

    @FindBy(xpath = "(//mat-select)[3]")
    public WebElement selectStage;

    @FindBy(xpath = "//span[text()=' Student Registration ']")
    public WebElement containsStage;

    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    public WebElement description;

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement newFielsCode;

    @FindBy(xpath = "(//ms-text-field/input)[3]") // new position eklerken gereken nameInput
    public WebElement nameInput3;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement newPositionShortName;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    public WebElement newLocationName;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    public WebElement newLocationShortName;

    @FindBy(xpath = "//ms-integer-field//input")
    public WebElement newLocationCapacity;

    @FindBy(xpath = "//ms-save-button")
    public WebElement blankSaveButton;

    @FindBy(xpath = "(//ms-text-field//input)[3]")
    public WebElement newBankAccountIban;

    @FindBy(xpath = "(//mat-select//div)[9]")
    public WebElement newBankAccountCurrency;

    @FindBy(xpath = "//span[text()=' EUR ']")
    public WebElement currencySelectEuro;

    @FindBy(xpath = "(//ms-text-field//input)[4]")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    public WebElement order;

    @FindBy(xpath = "//div[@class='mat-select-value ng-tns-c88-153']")
    public WebElement nextGrade;

    @FindBy(xpath = "(//ms-text-field//input)[3]")
    public WebElement newDiscountDescription;

    @FindBy(xpath = "(//ms-text-field//input)[4]")
    public WebElement integrationCde;

    @FindBy(xpath = "//ms-integer-field//input")
    public WebElement priority;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    public WebElement descriptionInput;


    public WebElement getWebElement(String strButton) {

        switch (strButton){

            case "addButton":return addButton;
            case "editButton":return editButton;
            case "deleteButton":return deleteButton;
            case "nameInput":return nameInput;
            case "searchButton":return searchButton;
            case "saveButton":return saveButton;
            case "nameInput2":return nameInput2;
            case "selectStage":return selectStage;
            case "containsStage":return containsStage;
            case "description":return description;
            case "newFielsCode":return newFielsCode;
            case "newPositionShortName":return newPositionShortName;
            case "successMessage":return successMessage;
            case "newLocationShortName":return newLocationShortName;
            case "newLocationCapacity":return newLocationCapacity;
            case "deleteDiaologBtn":return deleteDiaologBtn;
            case "newLocationName":return  newLocationName;
            case "blankSaveButton":return blankSaveButton;
            case "nameInput3":return nameInput3;
            case "alreadyExistText":return alreadyExistText;
            case "newBankAccountIban":return newBankAccountIban;
            case "newBankAccountCurrency":return newBankAccountCurrency;
            case "integrationCode":return integrationCode;
            case "order":return order;
            case "nextGrade":return nextGrade;
            case "newDiscountDescription":return newDiscountDescription;
            case "integrationCde":return integrationCde;
            case "priority":return priority;
            case "shortNameInput":return shortNameInput;
            case "addInput":return addInput;
            case "addCode":return addCode;
            case "currencySelectEuro":return currencySelectEuro;
            case "descriptionInput":return descriptionInput;

        }
        return null;
    }

    public void deleteItem(String searchText){
        sendKeysFunction(nameInput,searchText);
        clickFunction(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

        clickFunction(deleteButton);
        clickFunction(deleteDiaologBtn);
    }






}
