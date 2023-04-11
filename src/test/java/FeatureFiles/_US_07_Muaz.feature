Feature: Login Functionality

  Background: : Login with valid username and password

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create New Locations

    And Click on the element in LeftNav
      | firstSetup  |
      | schoolSetup |
      | locations   |

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | newLocationName      | muaatmacaa |
      | newLocationShortName | at1233     |
      | newLocationCapacity  | 10         |

    And Click on the element in Dialog Content
      | blankSaveButton |
      | saveButton      |

    Scenario: Delete new locations

      And User delete item from Dialog Content



