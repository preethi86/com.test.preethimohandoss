@Search-T-Shirtt
Feature: Acceptance testing to validate Ordering T-Shirt.


@OrderT-Shirt
Scenario: Verify Order T-Shirt

    Given I am on the Home Page "http://automationpractice.com" of a E-Commerce Website
    When I clicked Add to cart button of Faded Short Sleeve T-shirts
	Then I get a pop-up saying "Product successfully added to your shopping cart"
    When I click on "Proceed to checkout" button
    Then I see the product Faded Short Sleeve T-shirts on shopping cart summary
    When I click on "Proceed to checkout" button
    And I Choose ny delivery address
    And I agree Terms of service
    And I click on "Proceed to checkout" button
    And I choose Payment type asbank wire payment
    And I click on confirm my order
    Then I should see "Your order on My Store is complete."
  


    