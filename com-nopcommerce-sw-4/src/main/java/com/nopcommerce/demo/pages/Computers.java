package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {
    By pageHeader = By.xpath("//h1[text()='Computers']");
    By desktopLink = By.xpath("//h2[@class='title']//a[text()=' Desktops ']");

    // verify page header for computers
    public String getPageHeader( ){
        return getTextFromElement(pageHeader);
    }

    //click on desktop
    public void clickOnDesktop(){
        clickOnElement(desktopLink);
    }


}
