package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class D08_WishlistStepDef {
    P03_homepage home = new P03_homepage();

    @Given("add product to wishlist")
    public void addproducttowishlist(){
        home.addwish.get(2).click();


    }
    SoftAssert soft = new SoftAssert();

    @Then("success message is displayed with green background")
    public void successMessageIsDisplayedWithGreenBackground() {

        String actualMSG = home.wishlistbar.getText();
        String expectedMSG = "The product has been added to your wishlist";
        Boolean result = actualMSG.contains(expectedMSG);
        soft.assertTrue(result);

        System.out.println(home.wishlistbar.getCssValue("background-color"));

        String actualcolor = home.wishlistbar.getCssValue("background-color");
        String actualColorHex = Color.fromString(actualcolor).asHex();
        soft.assertEquals(actualColorHex,"#4bb07a");



        soft.assertAll();
        
    }

    @Then("user click on wishlist tab and get Qty value")
    public void userClickOnWishlistTabAndGetQtyValue() throws InterruptedException{

        Thread.sleep(5000);

        home.wishlisttab.click();



        String actualQty =home.Qty.getAttribute("value");

        int intactualQty = Integer.parseInt(actualQty);
        soft.assertTrue(intactualQty>0);


       soft.assertAll();
    }
}
