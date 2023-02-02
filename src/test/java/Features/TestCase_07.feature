@VerifyTestCasesPage_TestCase_07
Feature: TestCase_07

  Scenario: Verify Test Cases Page
    Given the user lands home page
    Then verify that Home_Page is visible successfully
    When the user clicks on test cases button on Home_Page
    Then verify that TestCases_Page is visible successfully