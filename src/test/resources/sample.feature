Feature: This is a test feature

  Scenario: Test1 - Browser Test
    Given I am on home page
    And I click on "My Projectss"
    And I enter answers
    When I click on submit button
    Then I get results

  Scenario: Test1: Ana Page link should not exist
    Given I am on home page
    When I see the menu
    Then "Click Me Ana" link should not be present