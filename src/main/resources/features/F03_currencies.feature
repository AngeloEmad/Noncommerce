@smoke
Feature: Currency - This feature will allow guest users to choose euro currency

  Scenario: User choose euro currency
    Given user choose euro currency
    Then verify Euro Symbol is shown on the 4 products displayed in Home page