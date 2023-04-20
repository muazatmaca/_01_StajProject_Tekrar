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
      | newDiscountDescription | ceylan |
      | integrationCde         | 176    |
      | priority               | 5      |

    And Click on the element in Dialog Content
      | blankSaveButton |
      | saveButton      |

    And Success message should be displayed

  Scenario: Adding same discount with name
    And Click on the element in Dialog Content
      | addButton |
    And User sending the keys in Dialog Content
      | newDiscountDescription | ceylan |
      | integrationCde         | 176    |
      | priority               | 5      |

    And Click on the element in Dialog Content
      | blankSaveButton |
      | saveButton      |

    And Already exist message should be displayed

  Scenario: Edit discount
    And User sending the keys in Dialog Content
      | descriptionInput | ceylan |
    And Click on the element in Dialog Content
      | searchButton |
      | editButton   |
    And User sending the keys in Dialog Content
      | newDiscountDescription | ebruceylan |
    And Click on the element in Dialog Content
      | saveButton |
    And Success message should be displayed

  Scenario: Delete discount
    And User sending the keys in Dialog Content
      | newDiscountDescription | ebruceylan |
    And Click on the element in Dialog Content
      | deleteButton     |
      | deleteDiaologBtn |
    And Success message should be displayed





