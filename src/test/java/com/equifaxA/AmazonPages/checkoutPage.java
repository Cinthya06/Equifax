package com.equifaxA.AmazonPages;

import com.equifaxA.Utilities.UI.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
    public checkoutPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//a[@id='hlb-ptc-btn-native']")
    public WebElement subTtotal;

    @FindBy(xpath = "//span[@class='a-color-price hlb-price a-inline-block a-text-bold'][1]")
    public WebElement getSubTtotal;

}
