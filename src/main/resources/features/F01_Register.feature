@smoke
Feature: Signup - This feature will allow guest users to create new valid accounts

  Scenario: user could register with valid data
    Given : user go to register page
    And  : user select gender type
    And : user enter first name and last name
    And : user enter date of birth
    And user enter valid email
    And : user fills password and confirm password fields
    And : user clicks on register button
    Then : success message is displayed