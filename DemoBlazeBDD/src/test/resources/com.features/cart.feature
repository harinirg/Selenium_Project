Feature: Cart functionality in DemoBlaze application

Background:
  Given user launches the application
  And user clicks on login link
  When user enters valid username
  And user enters valid password
  And user clicks on login button
  Then user should see the welcome message

@AddToCart
Scenario: Add product to cart
  When user selects a product
  And user clicks on Add to Cart button
  Then product should be added to cart

@ViewCart
Scenario: View added product in cart
  Given user has added a product to cart
  When user navigates to cart page
  Then product should be displayed in cart

@DeleteFromCart
Scenario: Remove product from cart
  Given user has product in cart
  When user deletes the product from cart
  Then product should be removed from cart