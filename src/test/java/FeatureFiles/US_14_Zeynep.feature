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
      | addInput | 3zeynepGe |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed