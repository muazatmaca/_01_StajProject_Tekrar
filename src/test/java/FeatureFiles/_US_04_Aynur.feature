


Feature: Document Types Functionality

  Background:
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario:  User should be able to Add Document Types

    And Click on the element in LeftNav
      |setupButton|
      |parameters|
      |DocumenTypes|

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput2 | Aynur1 |

    And Click on the element in Dialog Content
      | selectStage |
      | containsStage|

    And Click escape

    And User sending the keys in Dialog Content
      | description |  aaaa |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: User should be able to edit Document Types

    And Click on the element in LeftNav
      |setupButton|
      |parameters |
      |DocumenTypes|

    And Click on the element in Dialog Content
      | editButton |

    And User sending the keys in Dialog Content
      | nameInput2 | aynur2|

    And Click on the element in Dialog Content
      | saveButton |
    Then Success message should be displayed

  Scenario: User should be able to delete Document Types

    And Click on the element in LeftNav
      |setupButton|
      |parameters|
      |DocumenTypes|

    And Click on the element in Dialog Content
      | deleteButton     |
      | deleteDiaologBtn |

    Then Success message should be displayed

