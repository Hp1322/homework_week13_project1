package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitalLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By gifCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");
    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");
    By registerText = By.xpath("//a[contains(text(),'Register')]");
    By logOut = By.linkText("Log out");


    //click on Login link
    public void clickOnLoginLink(){
        clickOnElement(loginLink); //fetch from utility class
    }
    //click on Register link
    public void clickOnRegisterLink(){
        clickOnElement(registerLink); // fetch from utility class
    }
    //click on Top Menu
    public void selectMenu(String menu){
        if(menu.equalsIgnoreCase("Computers"))clickOnElement(computerLink);
        if(menu.equalsIgnoreCase("Electronics"))clickOnElement(electronicsLink);
        if(menu.equalsIgnoreCase("Apparel"))clickOnElement(apparelLink);
        if(menu.equalsIgnoreCase("Digital downloads"))clickOnElement(digitalLink);
        if(menu.equalsIgnoreCase("Books"))clickOnElement(booksLink);
        if(menu.equalsIgnoreCase("Jewelry"))clickOnElement(jewelryLink);
        if(menu.equalsIgnoreCase("Gift Cards"))clickOnElement(gifCardsLink);
    }
    public void mouseHoverElectronics(){
        mouseHoverToElement(electronics);
    }
    public void mouseHoverAndClickOnCellPhones(){
        mouseHoverToElementAndClick(cellPhones);
    }

    public void clickOnRegister(){
        clickOnElement(registerLink);
    }
    public String getRegisterText(){
        return getTextFromElement(registerText);
    }

    public void clickOnLogOut(){
        clickOnElement(logOut);
    }
    public String getLogOutText(){
        return getTextFromElement(logOut);
    }



}
