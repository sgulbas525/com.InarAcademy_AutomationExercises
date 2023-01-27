@LoginUserWithCorrectEmailAndPassword_TestCase_02
Feature: TestCase_02

  Scenario Outline: Login User with correct email and password
    Given the user lands home page
    When the user clicks signup_login button on Home_Page
    Then verify "Login to your account" is visible
    When the user enters email "<email>" address and password "<password>" on Login_Page
    And the user clicks login button on Login_Page
    Then verify the logged in username "<name>" is visible
    When the user clicks delete account button on Home_Page
    Then verify account deleted message "ACCOUNT DELETED!" is visible and click continue button on AccountDeleted_Page
    Examples:
      | email       | password | name  |
      | admin@admin | admin    | admin |