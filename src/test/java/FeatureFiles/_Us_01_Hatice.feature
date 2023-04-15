Feature: Human Resources Functionality

  Background:
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | humanResources       |
      | humanResourscesSetup |
      | positionCategories   |

  Scenario:  Adding The Position Categories

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput2 | Hatice18 |

    And Click on the element in Dialog Content
      | saveButton |
    Then Success message should be displayed

  Scenario: Entering The Same Information To Position Categories
    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput2 | Hatice18 |

    And Click on the element in Dialog Content
      | saveButton |

    Then Already exist message should be displayed


  Scenario:Editing The Position Categories

    And Click on the element in Dialog Content
      | editButton |

    And User sending the keys in Dialog Content
      | nameInput2 | Hatice123 |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Deleting The Saved  Position Category

    And Click on the element in Dialog Content
      | deleteButton     |
      | deleteDiaologBtn |

    Then Success message should be displayed













