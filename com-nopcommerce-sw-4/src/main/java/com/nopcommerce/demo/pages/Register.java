package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.sql.Timestamp;

public class Register extends Utility {
    By registerText = By.xpath("//h1[text()='Register']");
    By fName = By.xpath("//input[@id='FirstName']");
    By lName = By.xpath("//input[@id='LastName']");
    By emailFill = By.xpath("//input[@id='Email']");
    By passFill = By.xpath("//input[@id='Password']");
    By confirmPassFill = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By genderButton = By.id("gender-male");


    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    public void sendFname(String fnn){
        sendTextToElement(fName,fnn);
    }
    public void sendLname(String lnn){
        sendTextToElement(lName,lnn);
    }


    public void sendEmailFill(String text){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       String emailAddress = text+timestamp.getTime()/10000+"@domain.com";
       sendTextToElement(emailFill,emailAddress);
    }
    public void sendPassFill(String pass){
        sendTextToElement(passFill,pass);
    }
    public void sendConfirmPassFill(String repass){
        sendTextToElement(confirmPassFill,repass);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public void clickOnGenderButton(){
        clickOnElement(genderButton);
    }




}
