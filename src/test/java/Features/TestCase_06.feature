@ContactUsForm_TestCase_06
Feature: TestCase_06

  Scenario Outline: Contact Us Form
    Given the user lands home page
    Then verify that Home_Page is visible successfully
    When the user clicks contact us button on Home_Page
    Then verify "GET IN TOUCH" get in touch message is visible
    When the user enters name "<name>", email "<email>", subject"<subject>" and message "<message>" on ContactUs_Page
    And the user uploads the file on ContactUs_Page
    And the user clicks submit button on ContactUs_Page
    And the user clicks OK button
    Then verify "Success! Your details have been submitted successfully." succes message is visible on ContactUs_Page
    When the user clicks home button on ContactUs_Page
    Then verify that Home_Page is visible successfully
    Examples:
      | name  | email       | subject     | message              |
      | admin | admin@admin | TestCase_06 | Bruh!! We made it... |