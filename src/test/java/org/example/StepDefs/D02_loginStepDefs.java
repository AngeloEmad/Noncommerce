package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.Hooks.driver;

public class D02_loginStepDefs {
    P02_login login = new P02_login();
    @Given(": user go to login page")
    public void userGoToLoginPage() {
        login.logintab.click();
    }

    @When(":  User press on login button")
    public void userPressOnLoginButton() {
        login.loginbtn.click();
    }

    @And(": user enter valid user name and password")
    public void userEnterValidUserNameAndPassword() {
        login.email.sendKeys("test@example.com");
        login.password.sendKeys("p@ssw0rd");

    }

    @Then(": User login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        String acctualURL = driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/";
        soft.assertEquals(acctualURL,expectedURL);
        soft.assertAll();
    }

    @And(": user enter invalid user name and password")
    public void userEnterInvalidUserNameAndPassword() {
        login.email.sendKeys("wrong@example.com");
        login.password.sendKeys("p@ssw0rd");

    }

    SoftAssert soft = new SoftAssert();
    @Then(": User could not login to the system successfully")
    public void userCouldNotLoginToTheSystemSuccessfully() {


        String acctualMSG = login.unsuccessfulMSG.getText();
        String expectedMSG = "Login was unsuccessful";
        boolean result = acctualMSG.contains(expectedMSG);
        soft.assertTrue(result);

        String acctualcolor = login.unsuccessfulMSG.getCssValue("color");
        soft.assertEquals(acctualcolor,"rgba(228, 67, 75, 1)");






        soft.assertAll();
    }
}
