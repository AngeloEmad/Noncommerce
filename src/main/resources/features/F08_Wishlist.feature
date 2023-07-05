@smoke
Feature: User could add product to wishlist

  Background: user add product to wishlist
    Given add product to wishlist

  Scenario: user add product to wishlist and check success message
    Then success message is displayed with green background

  Scenario: user add product to wishlist and check Qty value
    Then user click on wishlist tab and get Qty value