package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.StepDefs.Hooks.driver;

public class P03_homepage {
    public P03_homepage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div[class=\"product-grid home-page-product-grid\"]")
    public List<WebElement> price;
    @FindBy(id = "customerCurrency")
    public WebElement currency;

    @FindBy(id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(className = "search-box-button")
    public WebElement searchbtn;

    @FindBy(css = "div[class=\"picture\"]")
    public List<WebElement> resulticon;

    @FindBy(css = "div[class=\"sku\"]")
    public WebElement sku;


    @FindBy(className = "product-item")
    public List<WebElement> bookitem;

    @FindBy(css = "ul[class=\"top-menu notmobile\"]>li")
    public List<WebElement> categorybar;


    @FindBy(css = "ul[class=\"top-menu notmobile\"]>li>ul>li")
    public List<WebElement> category;

    @FindBy(css = "div[class=\"page-title\"]")
    public WebElement pagetitle;

    @FindBy(css = "a[class=\"nivo-control\"]")
    public WebElement Galaxybtn;


    @FindBy(css = "a[class=\"nivo-control active\"]")
    public WebElement Iphone;

    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement facebook;

    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twitter;
    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public WebElement rss;

    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement youtube;
    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement wishlistbar;

    @FindBy(css = "button[class=\"button-2 add-to-wishlist-button\"]")
    public List<WebElement> addwish;

    @FindBy(id = "bar-notification")
    public WebElement wishbar;

    @FindBy(css = "span[class=\"wishlist-label\"]")
    public WebElement wishlisttab;
    @FindBy(css = "input[class=\"qty-input\"]")
    public WebElement Qty;

}
