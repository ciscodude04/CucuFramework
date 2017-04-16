Feature: Here i am

  Scenario: Browser Test
    Given I am on home page
    And I click on "My Projects"
    And I enter answers
    When I click on submit button
    Then I get results

    Scenario: Ana Page should not exists
      Given I am on home page
      And I click on "Click Me Ana"
      Then I am taken to "Birthday" page

      Scenario: Ana Page link should not exist
        Given I am on home page
        Then "Click Me Ana" link should not be present