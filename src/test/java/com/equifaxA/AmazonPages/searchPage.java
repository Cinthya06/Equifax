package com.equifaxA.AmazonPages;

import com.equifaxA.Utilities.UI.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class searchPage {
    public searchPage(){
        PageFactory.initElements(Driver.get(),this);

    }
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBar;
    @FindBy(xpath = " //span[@class=\"a-size-medium a-color-base a-text-normal\"]")
    public List<WebElement> listOfQaBooks;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchBtn;


}
