@smoke
  Feature: User could select any main category or sub-category successfully

    Scenario: User could select any category successfully
      Given user select random category
      Then the selected category has the same title after user click