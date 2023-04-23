Feature: Add,Edit,Delete Functionality

  Background: Before Scenario
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Positions
    When Click on the element in LeftNav
      | humanResources       |
      | humanResourcesSetup |
      | positions            |

    Then Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput3           | Etk123 |
      | newPositionShortName | e1t2k3 |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Function
    When Click on the element in LeftNav
      | humanResources       |
      | humanResourcesSetup |
      | positions            |

    Then Click on the element in Dialog Content
      | editButton |

    Then User sending the keys in Dialog Content
      | nameInput3           | Etk123   |
      | newPositionShortName | e1t2k345 |
    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Function
    When Click on the element in LeftNav
      | humanResources       |
      | humanResourcesSetup |
      | positions            |

    Then User delete item from Dialog Content
      | Etk123 |

    Then Success message should be displayed
