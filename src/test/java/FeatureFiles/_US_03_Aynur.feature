Feature: Attestations Functionality

  Background:
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario:  User should be able to Add Attestations

    And Click on the element in LeftNav
      |humanResources|
      |humanResourscesSetup|
      |attestations|

    And Click on the element in Dialog Content
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput2 | Aynr |

    And Click on the element in Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: User should be able to edit Attestations
    And Click on the element in LeftNav
      |humanResources|
      |humanResourscesSetup|
      |attestations|

    And Click on the element in Dialog Content
      | editButton |

    And User sending the keys in Dialog Content
      | nameInput2      | aynurrr|

    And Click on the element in Dialog Content
      | saveButton |
    Then Success message should be displayed

  Scenario: User should be able to delete Attestations
    And Click on the element in LeftNav
      |humanResources|
      |humanResourscesSetup|
      |attestations|

    And Click on the element in Dialog Content
      | deleteButton     |
      | deleteDiaologBtn |

    Then Success message should be displayed
