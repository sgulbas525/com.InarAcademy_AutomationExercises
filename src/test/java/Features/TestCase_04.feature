@LogoutUser_TestCase_04
Feature: TestCase_04

  Scenario Outline: Logout User
    Given the user lands home page
    Then verify that Home_Page is visible successfully
    When the user clicks signup_login button on Home_Page
    Then verify "Login to your account" is visible
    When the user enters email "<email>" address and password "<password>" on Login_Page
    And the user clicks login button on Login_Page
    Then verify the logged in username "<name>"
    When the user clicks logout button on Home_Page
    Then verify "Login to your account" is visible
    Examples:
      | email       | password | name  |
      | admin@admin | admin    | admin |