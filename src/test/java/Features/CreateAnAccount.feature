@CreateAnAccount
Feature: Create an account for tests

  Scenario Outline:
    Given the user lands home page
    When the user clicks signup_login button on Home_Page
    Then verify login page message "New User Signup!" is visible
    When the user enters name "<name>" and email "<email>"
    And the user clicks signup button on Login_Page
    Then verify signup page message "ENTER ACCOUNT INFORMATION" is visible
    When the user fill details "<gender>" "<password>" "<birthDay>" "<newsLetter>""<specialOffer>" "<firstName>" "<lastName>" "<company>" "<address>" "<address2>" "<country>" "<state>""<city>""<zipCode>""<mobilePhone>"
    And click create button on Signup_Page
    Then verify account created message "ACCOUNT CREATED!" is visible
    When the user clicks continue button on AccountCreated_Page
    Then verify the logged in username "<name>"

    Examples:
      | name  | email       | gender | password | birthDay   | newsLetter | specialOffer | firstName | lastName | company | address | address2 | country       | state | city  | zipCode | mobilePhone |
      | admin | admin@admin | mr     | admin    | 12.12.2012 | no         | no           | admin     | admin    | null    | admin   | null     | United states | TX    | Adana | 010101  | 1234567890  |