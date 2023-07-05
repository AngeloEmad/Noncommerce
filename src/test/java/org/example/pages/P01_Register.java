package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.StepDefs.Hooks.driver;

public class P01_Register {
    public WebElement registertab(){


        return driver.findElement(By.className("ico-register"));
    }

    public P01_Register(){
        PageFactory.initElements(driver,this);

    }


    @FindBy(id = "gender-male")
    public WebElement gender;

    @FindBy(id = "FirstName")
    public WebElement firstname;
    @FindBy(id = "LastName")
    public WebElement lastname;
    @FindBy(css = "select[name=\"DateOfBirthDay\"]")
    public WebElement day;
    @FindBy(css = "select[name=\"DateOfBirthMonth\"]")
    public WebElement month;
    @FindBy(css = "select[name=\"DateOfBirthYear\"]")
    public WebElement year;


    @FindBy(id = "Email")
    public WebElement email;


    @FindBy(id = "Password")
    public WebElement password;


    @FindBy(id = "ConfirmPassword")
    public WebElement confirmpassword;

    @FindBy(id = "register-button")
    public WebElement registerbtn;


    @FindBy(className = "result")
    public WebElement registerMSG;





}
