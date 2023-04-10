Feature: Add,Edit,Delete Functionality

  Background: Before Scenario
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Positions
    When Click on the element in LeftNav
      | humonResources       |
      | humonResourscesSetup |
      | positions            |

    Then Click add button
      | addButton |

    And Sending the keys for adding new position
      | nameInput3           | Etk123 |
      | newPositionShortName | e1t2k3 |

    And Click the save button
      | saveButton |

    Then Success message should be displayed

    Then Click the edit button
      | editButton |

    Then Sending the keys for editing the position
      | nameInput3           | Etka1234 |
      | newPositionShortName | e1t2k3a4 |

    And Click the save button
      | saveButton |

    Then Success message should be displayed

    Then Click on the delete button and delete the position
      | deleteButton       |
      | deleteDiaologBtn |

    Then Success message should be displayed
