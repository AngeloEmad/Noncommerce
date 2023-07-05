package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.Hooks.driver;

public class D04_searchStepDef {
    P03_homepage homepage = new P03_homepage();

    @When("User enter product name {string} to search")
    public void userEnterProductNameToSearch(String arg0) {

        homepage.searchBox.sendKeys(arg0);

    }
    @And("User click on search button")
    public void userClickOnSearchButton() {
        homepage.searchbtn.click();
    }

    @Then("User find the product relative products {string}")
    public void userFindTheProductRelativeProducts(String arg0) {
        driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        String acctualURL = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/search?q=";
        boolean result = acctualURL.contains(expectedURL);
        soft.assertTrue(result);
        soft.assertAll();
        //count items

        //int number_of_items = homepage.bookitem.size();
        //System.out.println(number_of_items);

        int x = homepage.bookitem.size();
        for (int i=0;i<x;i++){
            String items_text = homepage.bookitem.get(i).getText();
            System.out.println(i);
            System.out.println(items_text);
            boolean result1 = items_text.toLowerCase().contains(arg0);

            Assert.assertTrue(result1);

        }


    }

    @When("User enter product sku {string} to search")
    public void userEnterProductSkuToSearch(String arg0) {
        homepage.searchBox.sendKeys(arg0);

    }

    @And("User clicks on search button")
    public void userClicksOnSearchButton() {
        homepage.searchbtn.click();

    }

    @And("user clicks on the product in {string} result")
    public void userClicksOnTheProductInResult(String arg0) {

        int x = homepage.resulticon.size();

        for (int i=0;i<x;i++)
        {

            String items_text = homepage.resulticon.get(i).getText();
            System.out.println(i);
            System.out.println(items_text);
            boolean result1 = items_text.toLowerCase().contains(arg0);
            homepage.resulticon.get(i).click();

        }
    }

    @Then("User find the product that he looking for {string}")
    public void userFindTheProductThatHeLookingFor(String arg0) {

        String acctualsku = homepage.sku.getText().toLowerCase();
        Boolean result = acctualsku.contains(arg0.toLowerCase());
        Assert.assertTrue(result);

    }


}
