Feature: Add,Edit,Delete Departments Functionality

  Background: : Before Scenario

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | firstSetup  |
      | schoolSetup |
      | departments |

  Scenario: Add Departments Categories

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | addInput | 3zeynepGe |
      | addCode  | 322111     |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Departments Categories

    And Click on the element in Dialog Content
      | editButton |

    And User sending the keys in Dialog Content
      | addInput | 1zeynepGe1 |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete last Departments

    And Click on the element in Dialog Content
      | deleteButton     |
      | deleteDiaologBtn |

    Then Success message should be displayed

