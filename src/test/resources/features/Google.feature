Feature:
  A demo Google feature

  Background:
    Given User open the Browser

  Scenario: Pass scenario
    When User navigate to "https://www.google.com" page
    Then Verify that User is on correct Google Search page

  Scenario: Fail scenario
    When User navigate to "https://gmail.com" page
    Then Verify that User is on correct Google Search page