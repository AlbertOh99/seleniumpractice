Feature: Register Steps
  Scenario: The user would like to create an account
    Given the user is on the correct homepage
    When the user clicks on the Signup Login button
    Then the user should be on the login page
    When the user inputs their Name
    And the user inputs their Email Address
    And the user clicks on the Signup button
    Then the user should be on the Signup page
    When the user inputs their password
    And inputs their First Name
    And inputs their Last Name
    And inputs their full address
    And inputs their Mobile Number
    Then the user should be on the account created page.
    When the user clicks on the Continue button on the created account page
    Then the user should be the home page with a Delete Account button visible
    When the user clicks on Delete Account
    Then the should should be on the Delete Account page
    When the user clicks on the Continue button on the delete account page
    Then the should should be on the home page