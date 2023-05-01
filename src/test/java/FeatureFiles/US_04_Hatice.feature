Feature: Setup parameters Field Functionality

  Background:
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | setupButton |
      | parameters  |
      | fields      |

  Scenario: Adding The Fields Under Setup Parameters
    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | addInput | bedir65 |
      | addCode  | 4222  |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Entering The Same Information To Fields

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | addInput | bedir65 |
      | addCode  | 4222  |

    And Click on the element in Dialog Content
      | saveButton |

    Then Already exist message should be displayed

  Scenario:Editing The Fields

    And User sending the keys in Dialog Content
      | nameInput | bedir65 |

    And Click on the element in Dialog Content
      | editButton |

    And User sending the keys in Dialog Content
      | addInput | Bedir481 |
      | addCode  | 23484490  |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed


  Scenario: Deleting The Saved Fields By Searching
    And User sending the keys in Dialog Content
      | nameInput | Bedir481 |

    And Click on the element in Dialog Content
      | searchButton     |

    And Click on the element in Dialog Content
      | deleteButton     |
    And Click on the element in Dialog Content
      | deleteDiaologBtn |

    Then Success message should be displayed









