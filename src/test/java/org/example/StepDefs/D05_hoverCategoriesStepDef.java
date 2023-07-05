package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

import java.time.Duration;
import java.util.List;

import static org.example.StepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homepage home = new P03_homepage();
    int count = home.categorybar.size();
    int min = 0;
    int max = count-1;   // you are selecting random value from 0 to 2 that's why  max = count-1
    int selectedCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);

    SoftAssert soft = new SoftAssert();
    @Given("user select random category")
    public void userselectrandomcategory()throws InterruptedException{
        Actions action = new Actions(driver);




        System.out.println(count);

        System.out.println(selectedCategory);
        action.moveToElement(home.categorybar.get(selectedCategory)).perform();
        String selectedcategorytext = home.categorybar.get(selectedCategory).getText();
        Thread.sleep(2000);



    }

    @Then("the selected category has the same title after user click")
    public void theSelectedCategoryHasTheSameTitleAfterUserClick() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        if (home.category.isEmpty()){

            int subcount = home.category.size();
            int selectedSub = (int) Math.floor(Math.random() * (max - min + 1) + min);

            String expecttitle = home.category.get(selectedSub).getText();

            home.category.get(selectedSub).click();

            String actualtitle = home.pagetitle.getText();
            soft.assertEquals(actualtitle.toLowerCase().trim(),expecttitle.toLowerCase().trim());
            soft.assertAll();

        }

        else
        {

            home.categorybar.get(selectedCategory).click();
            String actualtext = home.pagetitle.getText();
            String expecttext = home.categorybar.get(selectedCategory).getText();
            soft.assertEquals(actualtext.toLowerCase().trim(),expecttext.toLowerCase().trim());
            soft.assertAll();


        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }
}
