package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import static org.example.StepDefs.Hooks.driver;

public class D07_followUsStepDef {

    P03_homepage home = new P03_homepage();
    @Given("user opens facebook link")
    public void useropensfacebooklink(){
     home.facebook.click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        driver.switchTo().window(tabs.get(1));
        String actualURL = driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualURL,"https://www.facebook.com/nopCommerce");
        soft.assertAll();

    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        home.twitter.click();
        
    }

    @Then("Twitter is opened in new tab")
    public void twitterIsOpenedInNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        driver.switchTo().window(tabs.get(1));
        String actualURL = driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualURL,"https://twitter.com/i/flow/login?redirect_after_login=%2FnopCommerce");
        soft.assertAll();

    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
        home.rss.click();
    }

    @Then("rss is opened in new tab")
    public void rssIsOpenedInNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        driver.switchTo().window(tabs.get(1));
        String actualURL = driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualURL,"https://demo.nopcommerce.com/new-online-store-is-open");
        soft.assertAll();
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
        home.youtube.click();
    }

    @Then("youtube is opened in new tab")
    public void youtubeIsOpenedInNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
        driver.switchTo().window(tabs.get(1));
        String actualURL = driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualURL,"https://www.youtube.com/user/nopCommerce");
        soft.assertAll();
    }
}
