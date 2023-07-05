package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homepage homepage = new P03_homepage();
    @Given("user choose euro currency")
    public void userchooseeurocurrency(){
        Select eurocurrency = new Select(homepage.currency);
        eurocurrency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }


    @Then("verify Euro Symbol is shown on the {int} products displayed in Home page")
    public void verifyEuroSymbolIsShownOnTheProductsDisplayedInHomePage(int arg0) {
        int x = homepage.price.size();
        for (int i=0 ;i<x ;i++ ){
            String price = homepage.price.get(i).getText();
            System.out.println(i);
            System.out.println(price);
            Assert.assertTrue(price.contains("€"));

        }
    }
}
