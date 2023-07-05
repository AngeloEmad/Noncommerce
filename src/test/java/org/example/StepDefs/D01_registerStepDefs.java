package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDefs {
    P01_Register register = new P01_Register();
    @Given(": user go to register page")
    public void userGoToRegisterPage() {

        register.registertab().click();


    }



    @And(": user select gender type")
    public void userSelectGenderType() {


        register.gender.click();
    }

    @And(": user enter first name and last name")
    public void userEnterFirstNameAndLastName() {

        register.firstname.sendKeys("automation");
        register.lastname.sendKeys("tester");

    }

    @And(": user enter date of birth")
    public void userEnterDateOfBirth() {
        Select daylist = new Select(register.day);
        daylist.selectByIndex(26);

        Select monthlist = new Select(register.month);
        monthlist.selectByIndex(7);

        Select yearlist = new Select(register.year);
        yearlist.selectByValue("1993");

    }

    @And("user enter valid email")
    public void userEnterValidEmail() {
        register.email.sendKeys("test@example.com");
    }

    @And(": user fills password and confirm password fields")
    public void userFillsPasswordAndConfirmPasswordFields() {
        register.password.sendKeys("p@ssw0rd");
        register.confirmpassword.sendKeys("p@ssw0rd");
    }

    @And(": user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registerbtn.click();
    }

    @Then(": success message is displayed")
    public void successMessageIsDisplayed() {

        SoftAssert soft = new SoftAssert();
        boolean acctualMSG = register.registerMSG.isDisplayed();

        soft.assertTrue(acctualMSG);

        String acctualColor = register.registerMSG.getCssValue("color");
        soft.assertEquals(acctualColor,"rgba(76, 177, 124, 1)");
        soft.assertAll();



    }
}
