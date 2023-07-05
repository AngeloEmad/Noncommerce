@smoke
Feature: User could search of products
  Scenario Outline:User could search using product name
    When User enter product name "<search>" to search
    And User click on search button
    Then User find the product relative products "<search>"
    Examples:
      | search |
      | book |
      | laptop |
      | nike |

  Scenario Outline:User could search using product sku
    When User enter product sku "<search>" to search
    And User clicks on search button
    And user clicks on the product in "<search>" result
    Then User find the product that he looking for "<search>"
    Examples:
      | search |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |