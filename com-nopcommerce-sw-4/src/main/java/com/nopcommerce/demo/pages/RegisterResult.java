package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterResult extends Utility {
    By registrationText = By.xpath("//div[text()='Your registration completed']");
    By continueButton = By.xpath("//a[text()='Continue']");

    public String getRegistrationText(){
        return getTextFromElement(registrationText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
