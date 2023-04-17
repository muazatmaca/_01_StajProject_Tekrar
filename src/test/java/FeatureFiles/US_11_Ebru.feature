Feature: Login Functionality

  Background: : Login with valid username and password

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | firstSetup |
      | parameters |
      | disCounts  |

  Scenario: Create a new Discount
    And Click on the element in Dialog Content
      | addButton |
    And User sending the keys in Dialog Content
      | newDiscountDescription | atmaca |
      | integrationCde         | 176    |
      | priority               | 5      |

    And Click on the element in Dialog Content
      | blankSaveButton |
      | saveButton      |


