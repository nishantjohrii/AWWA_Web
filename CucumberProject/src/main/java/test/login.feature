Feature: Login to Facebook page with valid Username and password

  Scenario: In order to verify login to Facebook
    Given user navigate to Facebook site
    When user validates the homepage title
    Then user enter the valid username
    And user enter the valid password
    Then user should be logged in successfully

  Scenario: In order to verify login to Facebook as Invalid User
    Given user navigate to Facebook site
    When user validates the homepage title
    Then user enter the invalid username
    And user enter the invalid password
    Then user should not be logged in successfully
