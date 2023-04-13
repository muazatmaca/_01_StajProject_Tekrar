Feature: Human Resources Functionality

  Background:
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    Scenario:  User should be able to Add-Edit-Delete Position Categories Under Human Resources Setup

      And Click on the element in LeftNav
      |humanResources|
      |humanResourscesSetup|
      |positionCategories|
      And Click on the element in Dialog Content
        | addButton |

      And User sending the keys in Dialog Content
        | nameInput2 | Hatice2 |

      And Click on the element in Dialog Content
        | saveButton |

      Then Success message should be displayed

      And User delete item from Dialog Content
        | Hatice2 |
