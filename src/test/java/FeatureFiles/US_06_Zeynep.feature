Feature: Add,Edit,Delete Subject Functionality

  Background: : Before Scenario

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | education         |
      | educationSetup    |
      | subjectCategories |

  Scenario: Add Subject Categories

    Then Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | addInput | 4ZeynepGe |
      | addCode  | 4ZG1111   |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Subject Categories

    And User sending the keys in Dialog Content
      | nameInput | 4ZeynepGe |

    Then Click on the element in Dialog Content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog Content
      | addInput | ZeynepGedik |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Subject Categories

    And User sending the keys in Dialog Content
      | nameInput | ZeynepGedik |

    Then Click on the element in Dialog Content
      | searchButton     |
      | deleteButton     |
      | deleteDiaologBtn |

    Then Success message should be displayed