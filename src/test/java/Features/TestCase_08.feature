@VerifyAllProductsAndProductDetailPage_TestCase_08
  Feature: TestCase_08
    Scenario: Verify All Products and product detail page
      Given the user lands home page
      Then verify that Home_Page is visible successfully
      When the user clicks on product button on Home_Page
      Then verify Product_Page is visible successfully
      And verify the product list is visible on Product_Page
      When the user clicks view product of first product on Product_Page
      Then verify that detail is visible on ProductDetail_Page
