$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AmazonSearch.feature");
formatter.feature({
  "name": "Searching for a book",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Searching for a book in amazon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazonSearch"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on amazon Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepdefs.user_is_on_amazon_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for book \"qa testing for beginners\" and clicks on first result",
  "keyword": "When "
});
formatter.match({
  "location": "bookPagesStepdefs.user_search_for_book_and_clicks_on_first_result(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies price",
  "keyword": "Then "
});
formatter.match({
  "location": "bookPagesStepdefs.user_verifies_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "bookPagesStepdefs.user_clicks_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "before clicks on proceed user verify price",
  "keyword": "And "
});
formatter.match({
  "location": "bookPagesStepdefs.before_clicks_on_proceed_user_verify_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeds to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "bookPagesStepdefs.user_proceeds_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});