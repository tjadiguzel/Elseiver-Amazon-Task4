package com.elseiver.amazon.step_definitions;

import com.elseiver.amazon.pages.SearchItemAddToCartPage;
import com.elseiver.amazon.utulities.ConfigurationReader;
import com.elseiver.amazon.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SearchItemAddToCart_Step_Def {

    SearchItemAddToCartPage searchItemAddToCartPage = new SearchItemAddToCartPage();

    @Given("I open the amazon website")
    public void i_open_the_amazon_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I search for {string}")
    public void i_search_for(String hat) {
        searchItemAddToCartPage.searchBox.sendKeys(ConfigurationReader.getProperty("searchItemName"));

    }

    @When("I click search button")
    public void i_click_search_button() {
        searchItemAddToCartPage.clickButton.click();

    }

    @Then("I click the first hat appearing")
    public void i_click_the_first_hat_appearing() {

        searchItemAddToCartPage.firstAppearedHat.click();

    }



    @Then("I click add to cart button")
    public void i_click_add_to_cart_button() {
        searchItemAddToCartPage.addToCartButton.click();

    }


    @Then("I should verify item added cart")
    public void i_should_verify_item_added_cart() {

        String expectedMessage = "Added to Cart";
        String actualMessage = searchItemAddToCartPage.addedMessage.getText();
        Assert.assertEquals("Actual message does not match the expected message",actualMessage,expectedMessage);

    }




}
