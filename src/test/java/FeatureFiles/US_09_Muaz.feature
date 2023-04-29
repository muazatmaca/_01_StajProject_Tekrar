Feature: Login Functionality

  Background: : Login with valid username and password

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | firstSetup   |
      | parameters   |
      | bankAccounts |

  Scenario: Create new bank account
    And Click on the element in Dialog Content
      | addButton |
    And User sending the keys in Dialog Content
      | nameInput2         | muazatmacaaa |
      | newBankAccountIban | 65473        |
    And Click on the element in Dialog Content
      | newBankAccountCurrency |
      | currencySelectEuro     |
    And User sending the keys in Dialog Content
      | integrationCode | 22 |
    And Click on the element in Dialog Content
      | saveButton |
    And Success message should be displayed

  Scenario:Adding the same bank account name
    And Click on the element in Dialog Content
      | addButton |
    And User sending the keys in Dialog Content
      | nameInput2         | muazatmacaaa |
      | newBankAccountIban | 65473        |
    And Click on the element in Dialog Content
      | newBankAccountCurrency |
      | currencySelectEuro     |
    And User sending the keys in Dialog Content
      | integrationCode | 22 |
    And Click on the element in Dialog Content
      | saveButton |
    And Already exist message should be displayed


  Scenario:Edit new bank account
    And User sending the keys in Dialog Content
      | nameInput | muazatmacaaa |
    And Click on the element in Dialog Content
      | searchButton |
    And Click on the element in Dialog Content
      | editButton |
    And User sending the keys in Dialog Content
      | nameInput2 | atmacamuaz |
    And Click on the element in Dialog Content
      | saveButton |
    And Success message should be displayed

  Scenario:Delete new bank account
    And User sending the keys in Dialog Content
      | nameInput | atmacamuaz |
    And Click on the element in Dialog Content
      | deleteButton     |
      | deleteDiaologBtn |
    And Success message should be displayed




