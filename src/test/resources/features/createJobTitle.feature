Feature: Create Job Title

  Background: User is logged in
    Given Already on the website login
    When User input valid username
    And User input valid password
    And User click login button
    Then User can landing on home page

  Scenario: Create job title
    When User click dashboard admin
    And Click MyInfo dashboard
