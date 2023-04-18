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

    // ortak locater lar
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

    // arkadaslar genel Locater ADD button (inputName ve inputCode)icin
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
////input[@id='ms-text-field-6']
    // user story 1 ve 2
    // position categorries te ve attestation da ekle yaptıktan sonra çıkan name dialogun locater i
    @FindBy(xpath = "(//ms-text-field//input)[2]")
    public WebElement nameInput2;

    // save butonunu ortak locater dan alınız

    /////////////////////////////////////////////////
    // user story 3
    // ilk name inputunu (nameInput2) den alabilirsiniz
    @FindBy(xpath = "(//mat-select)[3]")
    public WebElement selectStage;

    // stage in içindeki elemanlardan birisini seçiniz
    // seçim yaptıktan sonra esc tuşuna basmanız gerekiyor methodları kontrol edin
    @FindBy(xpath = "//span[text()=' Student Registration ']")
    public WebElement containsStage;

    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    public WebElement description;

    // save butonu ortak locater dan alınız

    ///////////////////////////////////////////////////

    // user story 4
    // name inputunu (nameInput2) den alabilirsiniz

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement newFielsCode;

    // sonrasında bir secenek var ama kendisi seçmiş ona herhangi bir işlem yapmıyorum
    // save locater i ortaklardan alınız.

    /////////////////////////////////////////////

    // user story 5
    // name inputunu (nameInput2) den alabilirsiniz
    @FindBy(xpath = "(//ms-text-field/input)[3]") // new position eklerken gereken nameInput
    public WebElement nameInput3;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement newPositionShortName;

    // save butonuna basınız

    //////////////////////////////////////////////
    // user story 6

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    ///////////////////////////////////////////

    // user story 7
    // // name inputunu (nameInput2) den alabilirsiniz

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    public WebElement newLocationName;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    public WebElement newLocationShortName;

    @FindBy(xpath = "//ms-integer-field//input")
    public WebElement newLocationCapacity;

    @FindBy(xpath = "//ms-save-button")
    public WebElement blankSaveButton;

    // save butonuna basınız
    ////////////////////////////////

    // user story 8
    // diğer name locaterleri ile farklı
    @FindBy(xpath = "")
    public WebElement newSchoolDepartmanName;

    @FindBy(xpath = "")
    public WebElement newSchoolDepartmanCode;

    // save butonuna basınız


    // user story 9
    // nameınput yukarıdaki locaterdan buluyorsunuz

    @FindBy(xpath = "")
    public WebElement newBankAccountIban;

    @FindBy(xpath = "")
    public WebElement newBankAccountCurrency;

    @FindBy(xpath = "")
    public WebElement integrationCode;

    // save buttona basınız

    // user stroy 10
    // nameInput locaterı yukarıda
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    public WebElement order;

    @FindBy(xpath = "//div[@class='mat-select-value ng-tns-c88-153']")
    public WebElement nextGrade;

    // save buttonuna basınız

    // user story 11

    @FindBy(xpath = "//input [@id='ms-text-field-2']")
    public WebElement newDiscountDescription;

    @FindBy(xpath = "//input[@id='ms-text-field-3']")
    public WebElement integrationCde;

    @FindBy(xpath = "//input[@id='ms-integer-field-0']")
    public WebElement priority;

    // save tuşuna basınız

    // user stroy 12

    // nameınput loacaterını yukarıdan bulunuz




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
            case "newSchoolDepartmanName":return newSchoolDepartmanName;
            case "newSchoolDepartmanCode":return newSchoolDepartmanCode;
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
