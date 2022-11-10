Feature: Login

  Scenario: As a user I want to login successfully
    Given a user navigates to the login page
    When I provide valid login details
    Then I should successfully be able to login