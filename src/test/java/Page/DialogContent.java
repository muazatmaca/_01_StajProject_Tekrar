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

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDiaologBtn;

    // user story 1 ve 2
    // position categorries te ve attestation da ekle yaptıktan sonra çıkan name dialogun locater i
    @FindBy(xpath = "(//ms-text-field//input)[2]")
    public WebElement nameInput2;

    // save butonunu ortak locater dan alınız

    /////////////////////////////////////////////////
    // user story 3
    // ilk name inputunu (nameInput2) den alabilirsiniz
    @FindBy(xpath = "")
    public WebElement selectStage;

    // stage in içindeki elemanlardan birisini seçiniz
    // seçim yaptıktan sonra esc tuşuna basmanız gerekiyor methodları kontrol edin
    @FindBy(xpath = "")
    public WebElement containsStage;

    @FindBy(xpath = "")
    public WebElement description;

    // save butonu ortak locater dan alınız

    ///////////////////////////////////////////////////

    // user story 4
    // name inputunu (nameInput2) den alabilirsiniz

    @FindBy(xpath = "")
    public WebElement newFielsCode;

    // sonrasında bir secenek var ama kendisi seçmiş ona herhangi bir işlem yapmıyorum
    // save locater i ortaklardan alınız.

    /////////////////////////////////////////////

    // user story 5
    // name inputunu (nameInput2) den alabilirsiniz
    @FindBy(xpath = "")
    public WebElement newPositionShortName;

    // save butonuna basınız

    //////////////////////////////////////////////
    // user story 6
    // name inputunu (nameInput2) den alabilirsiniz

    @FindBy(xpath = "")
    public WebElement newSubjectCategoryCode;

    // save butonuna basınız

    ///////////////////////////////////////////

    // user story 7
    // // name inputunu (nameInput2) den alabilirsiniz

    @FindBy(xpath = "")
    public WebElement newLocationShortName;

    @FindBy(xpath = "")
    public WebElement newLocationCapacity;

    // save butonuna basınız
    ///////////////////////////////////

    // diğer name locaterleri ile farklı
    @FindBy(xpath = "")
    public WebElement newSchoolDepartmanName;

    @FindBy(xpath = "")
    public WebElement newSchoolDepartmanCode;

    // save butonuna basınız

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
            case "newSubjectCategoryCode":return newSubjectCategoryCode;
            case "newLocationShortName":return newLocationShortName;
            case "newLocationCapacity":return newLocationCapacity;
            case "newSchoolDepartmanName":return newSchoolDepartmanName;
            case "newSchoolDepartmanCode":return newSchoolDepartmanCode;
            case "deleteDiaologBtn":return deleteDiaologBtn;

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
