Feature: Login Steps

  Scenario: Valid Login
    Given the user is on the correct homepage
    When the user clicks on the Signup Login button
    Then the user should be on the login page
    And the user inputs a "John@Tom" email
    And the user inputs a "123" password
    And the user click on the Login button
    Then Logged in as username is visible
    When the user clicks the logout button

  Scenario: Invalid Login
    Given the user is on the correct homepage
    When the user clicks on the Signup Login button
    Then the user should be on the login page
    And the user inputs a "John@Wrong" email
    And the user inputs a "Wrongbadpassword" password
    And the user click on the Login button
    Then Error Your email or password is incorrect! is visible