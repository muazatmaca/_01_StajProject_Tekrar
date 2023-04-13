Feature: Add,Edit,Delete Functionality

  Background: Before Scenario
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Nationalities
    When Click on the element in LeftNav
      | setupButton   |
      | parameters    |
      | nationalities |

    Then Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput2           | french |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Function
    When Click on the element in LeftNav
      | setupButton   |
      | parameters    |
      | nationalities |

    Then Click on the element in Dialog Content
      | editButton |

    Then User sending the keys in Dialog Content
      | nameInput2          | french   |
    And Click on the element in Dialog Content
      | saveButton |

    Then Already exist message should be displayed

  Scenario: Delete Function
    When Click on the element in LeftNav
      | setupButton   |
      | parameters    |
      | nationalities |

    Then User delete item from Dialog Content
      | french |

    Then Success message should be displayed
