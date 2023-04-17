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
      | nameInput2         | muazatmaca |
      | newBankAccountIban | 65473      |
    And Click on the element in Dialog Content
      | newBankAccountCurrency |
      | selectEuro             |
    And User sending the keys in Dialog Content
      | integrationCode | 22 |
    And Click on the element in Dialog Content
      | saveButton |

