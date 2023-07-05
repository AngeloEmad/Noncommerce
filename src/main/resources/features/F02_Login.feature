@smoke
Feature: users could use login functionality to use their accounts

  Background: shared steps for login
    Given : user go to login page


  Scenario: user could login with valid email and password
    And : user enter valid user name and password
    And :  User press on login button
    Then : User login to the system successfully


  Scenario: user could login with invalid email and password
    And : user enter invalid user name and password
    And :  User press on login button
    Then : User could not login to the system successfully