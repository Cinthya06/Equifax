Feature: Searching for a book
  @amazonSearch
  Scenario: Searching for a book in amazon
   Given user is on amazon Page
   When user search for book "qa testing for beginners" and clicks on first result
    Then user verifies price
   And user clicks on add to cart
   And before clicks on proceed user verify price
   Then user proceeds to checkout
