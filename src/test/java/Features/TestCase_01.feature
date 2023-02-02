@RegisterUser_TestCase_01
Feature: TestCase_01

  Scenario Outline: Register User
    Given the user lands home page
    Then verify that Home_Page is visible successfully
    When the user clicks signup_login button on Home_Page
    Then verify login page message "New User Signup!" is visible
    When the user enters name "<name>" and email "<email>" on Login_Page
    And the user clicks signup button on Login_Page
    Then verify signup page message "ENTER ACCOUNT INFORMATION" is visible
    When the user fill details "<gender>" "<password>" "<birthDay>" "<newsLetter>""<specialOffer>" "<firstName>" "<lastName>" "<company>" "<address>" "<address2>" "<country>" "<state>""<city>""<zipCode>""<mobilePhone>" on Signup_Page
    And click create button on Signup_Page
    Then verify account created message "ACCOUNT CREATED!" is visible
    When the user clicks continue button on AccountCreated_Page
    Then verify the logged in username "<name>"
    When the user clicks delete account button on Home_Page
    Then verify account deleted message "ACCOUNT DELETED!" is visible and click continue button on AccountDeleted_Page
    Examples:
      | name  | email       | gender | password | birthDay   | newsLetter | specialOffer | firstName | lastName | company | address   | address2 | country       | state | city  | zipCode | mobilePhone |
      | kamil | kamil@kamil | mr     | kamil123 | 12.12.2012 | yes        | yes          | kamil     | kamil    | null    | asdasdasd | null     | United states | TX    | Adana | 010101  | 1234567890  |
    