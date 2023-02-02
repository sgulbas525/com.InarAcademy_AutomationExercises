@RegisterUserWithExistingEmail_TestCase_05
Feature: TestCase_05

  Scenario Outline: Register User with existing email
    Given the user lands home page
    Then verify that Home_Page is visible successfully
    When the user clicks signup_login button on Home_Page
    Then verify login page message "New User Signup!" is visible
    When the user enters name "<name>" and email "<email>" on Login_Page
    And  the user clicks signup button on Login_Page
    Then verify "Email Address already exist!" email already exist error message is visible
    Examples:
      | name   | email       |
      | serhat | admin@admin |