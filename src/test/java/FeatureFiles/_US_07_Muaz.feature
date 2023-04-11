Feature: Login Functionality

  Background: : Login with valid username and password

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | firstSetup  |
      | schoolSetup |
      | locations   |

  Scenario: Create New Locations

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | newLocationName      | maatmacaa |
      | newLocationShortName | at1233    |
      | newLocationCapacity  | 10        |

    And Click on the element in Dialog Content
      | blankSaveButton |
      | saveButton      |

    Then Success message should be displayed

  Scenario: Same locations checkout

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | newLocationName      | maatmacaa |
      | newLocationShortName | at1233    |
      | newLocationCapacity  | 10        |

    And Click on the element in Dialog Content
      | blankSaveButton |
      | saveButton      |

    Then Already exist message should be displayed

  Scenario: Editing the resulting location

    And Click on the element in Dialog Content
      | editButton |
    And User sending the keys in Dialog Content
      | newLocationName      | mzatm1234 |
      | newLocationShortName | atm543    |
    And Click on the element in Dialog Content
      | saveButton |
    Then Success message should be displayed

  Scenario: Delete last locations

    And Click on the element in Dialog Content
      | deleteButton     |
      | deleteDiaologBtn |

    Then Success message should be displayed









