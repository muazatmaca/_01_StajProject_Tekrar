Feature: Add,Edit,Delete Nationalities Functionality

  Background: : Before Scenario

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | firstSetup    |
      | parameters    |
      | nationalities |

  Scenario: Add Nationalities Categories

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | addInput | 3zeynep |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Nationalities Categories

    And User sending the keys in Dialog Content
      | nameInput | 3zeynep |

    And Click on the element in Dialog Content
      | searchButton |
      | editButton |

    And User sending the keys in Dialog Content
      | addInput | zeynepGdk1 |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete last Nationalities

    And User sending the keys in Dialog Content
      | nameInput | zeynepGdk1 |

    Then Click on the element in Dialog Content
      | searchButton     |
    Then Click on the element in Dialog Content
      | deleteButton     |
    Then Click on the element in Dialog Content
      | deleteDiaologBtn |

    Then Success message should be displayed