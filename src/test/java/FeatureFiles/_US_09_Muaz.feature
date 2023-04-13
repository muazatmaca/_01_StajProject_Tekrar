Feature: Login Functionality

  Background: : Login with valid username and password and enter Bank Accounts

    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Click on the element in LeftNav
      | firstSetup   |
      | parameters   |
      | bankAccounts |
