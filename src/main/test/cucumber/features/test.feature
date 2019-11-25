@TestScenario1
Feature: Registration

  Scenario: Check registration without filling in one required field
    Given User is on main page
    When User clicks Sign In button
    And User enters email and clicks Create account button
    And User fills in account fields
    When User clicks Register button
    Then User sees error message: "There is 1 error"
    And close the browser