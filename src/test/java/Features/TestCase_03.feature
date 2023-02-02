@LoginUserWithIncorrectEmailAndPassword_TestCase_03
Feature: TestCase_03

  Scenario Outline: Login User with incorrect email and password
    Given the user lands home page
    Then verify that Home_Page is visible successfully
    When the user clicks signup_login button on Home_Page
    Then verify "Login to your account" is visible
    When the user enters email "<email>" address and password "<password>" on Login_Page
    And the user clicks login button on Login_Page
    Then verify "Your email or password is incorrect!" invalid credentials error message is visible
    Examples:
      | email        | password |
      | admin@admin1 | admin    |
      | admin@admin  | admin1   |
      | admin1@admin | admin1   |

