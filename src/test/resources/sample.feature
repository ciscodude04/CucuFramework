Feature: Here i am

  Scenario: Browser Test
    Given I navigate to "https://www.yahoo.com"
    When I enter valid credentials
    Then I am taken to messages page

  Scenario: Land on Josh Page
    Given I click on "Coding Experience"
    Then I land on coding page

    Scenario: Play Josh Game
      Given I land on "My Projects"
      When I enter the data
      Then I either win or lose