Feature: Login Steps

  Scenario: Valid Login
    Given the user is on the homepage
    When the user clicks on Signup/Login
    And the user inputs a valid "username"
    And the user inputs a valid "password
    And the user click on the Login button
    Then