Feature: Setup parameters Field Functionality

  Background:
    Given Nagivate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: User should be able to Add-Edit-Delete Fields Under Setup Parameters
    And Click on the element in LeftNav
      |setupButton|
      |parameters|
      |fields|


