Feature: Add,Edit,Delete Functionality

  Background: Before Scenario
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Grade Levels
    When Click on the element in LeftNav
      | firstSetup  |
      | parameters  |
      | gradeLevels |

    Then Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput      | etka888 |
      | shortNameInput | ıoew  |
      | order          | 1       |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Function
    When Click on the element in LeftNav
      | firstSetup  |
      | parameters  |
      | gradeLevels |

    Then Click on the element in Dialog Content
      | editButton |

    Then User sending the keys in Dialog Content
      | nameInput      | ortayu12 |
      | shortNameInput | uırtw1   |
      | order          | 15         |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Function
    When Click on the element in LeftNav
      | firstSetup  |
      | parameters  |
      | gradeLevels |

    Then Delete the user from the list
      | deleteButton     |
      | deleteDiaologBtn |

    Then Success message should be displayed
