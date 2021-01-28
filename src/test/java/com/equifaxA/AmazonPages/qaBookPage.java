package com.equifaxA.AmazonPages;

import com.equifaxA.Utilities.UI.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qaBookPage {
    public qaBookPage(){
        PageFactory.initElements(Driver.get(),this);

    }
    @FindBy(xpath = "//span[@class='a-size-base mediaTab_subtitle'][1]")
    public WebElement boxPrice;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartBtn;


}
