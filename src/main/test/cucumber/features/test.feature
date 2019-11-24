@TestScenario1
Feature: Registration

  Scenario: Check registration without filling in one required field
    Given open browser
    And open main page and click Sign In button
    And I enter email and click Create account button
    And fill in account fields
    When I click Register button
    Then I see error message: "There is 1 error"
    And close the browser
