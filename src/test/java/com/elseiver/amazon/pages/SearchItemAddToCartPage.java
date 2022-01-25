package com.elseiver.amazon.pages;

import com.elseiver.amazon.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItemAddToCartPage {

    public SearchItemAddToCartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement clickButton;

    @FindBy(xpath = "//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div")
    public WebElement firstAppearedHat;

    @FindBy(xpath = "//select[@name='quantity']")
    public WebElement qtySelector;

    @FindBy(xpath = "//input[@name='submit.add-to-cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
    public WebElement addedMessage;


}
