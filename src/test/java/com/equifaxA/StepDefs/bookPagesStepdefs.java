package com.equifaxA.StepDefs;

import com.equifaxA.AmazonPages.searchPage;
import com.equifaxA.AmazonPages.qaBookPage;
import com.equifaxA.AmazonPages.checkoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class bookPagesStepdefs {


        @When("user search for book {string} and clicks on first result")
        public void user_search_for_book_and_clicks_on_first_result(String string) {
            searchPage search=new searchPage();
            search.searchBar.sendKeys("qa testing for beginners");
            search.searchBtn.click();
            search.listOfQaBooks.get(0).click();
        }

    @Then("user verifies price")
    public void user_verifies_price() throws InterruptedException {
      qaBookPage qaPage=new qaBookPage();

      String expectedPrice="$47.49";
      String actualPrice=qaPage.boxPrice.getText();
        System.out.println("Actual Price is ="+actualPrice);
        System.out.println("Expected Price is ="+expectedPrice);
        Assert.assertEquals(expectedPrice,actualPrice);

    }
    @Then("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        qaBookPage qaPage=new qaBookPage();
        qaPage.addToCartBtn.click();


    }
    @Then("before clicks on proceed user verify price")
    public void before_clicks_on_proceed_user_verify_price() {
            checkoutPage checkoutTotal=new checkoutPage();
      String expectedPrice="$47.49";
      String actualPrice=checkoutTotal.getSubTtotal.getText();
        Assert.assertEquals(expectedPrice,actualPrice);

    }


    @Then("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
        checkoutPage checkOut=new checkoutPage();
        checkOut.subTtotal.click();
    }






}
