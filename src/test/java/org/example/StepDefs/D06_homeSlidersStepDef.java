package org.example.StepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {
    P03_homepage homepage = new P03_homepage();

    SoftAssert soft = new SoftAssert();
    @Given("user click on home slider Galaxy")
    public void clickonfirstslider(){
        homepage.Galaxybtn.click();

    }


    @Then("Galaxy page is opened successfully")
    public void galaxyPageIsOpenedSuccessfully() {
        String acctualURL = driver.getCurrentUrl();
        String expectedURL ="https://demo.nopcommerce.com/nokia-lumia-1020\n";
        soft.assertEquals(acctualURL,expectedURL);
        soft.assertAll();
    }

    @Given("user click on home slider Iphone")
    public void userClickOnHomeSliderIphone() {
        homepage.Iphone.click();
    }

    @Then("Iphone page is opened successfully")
    public void iphonePageIsOpenedSuccessfully() {
        String acctualURL = driver.getCurrentUrl();
        String expectedURL ="https://demo.nopcommerce.com/iphone-6";
        soft.assertEquals(acctualURL,expectedURL);
        soft.assertAll();
    }
}
