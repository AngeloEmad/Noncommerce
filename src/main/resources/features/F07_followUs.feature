@smoke
  Feature: user could open follow link
    Scenario: user could open facebook link
      Given user opens facebook link
      Then "https://www.facebook.com/nopCommerce" is opened in new tab

    Scenario: user could open twitter link
      Given user opens twitter link
      Then Twitter is opened in new tab

    Scenario: user could open rss link
      Given user opens rss link
      Then rss is opened in new tab

    Scenario: user could open youtube link
      Given user opens youtube link
      Then youtube is opened in new tab