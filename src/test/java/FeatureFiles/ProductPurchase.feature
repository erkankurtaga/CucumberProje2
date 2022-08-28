Feature: Product Purchase Functionality
  Background:
    Given Navigate to luma
    When Click signin link
    And Enter valid user information to login form and click signin button
    Then User should be signin successfully

  Scenario: Select a product and purchase
    And User should select a product add to cart
    And User should navigate cart to proceed to checkout
    And User should be purchase the product successfully