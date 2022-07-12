Feature: Login Orange HRM

  @SuccessLogin
  Scenario: Success Login Orange HRM
    Given Already on the website login
    When User input valid username
    And User input valid password
    And User click login button
    Then User can landing on home page
