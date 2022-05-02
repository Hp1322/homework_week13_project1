package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Computers computers = new Computers();
    Electronics electronics = new Electronics();
    Apparel apparel = new Apparel();
    Digital digital = new Digital();
    Books books = new Books();
    Jewelry jewelry = new Jewelry();
    GiftCards giftCards = new GiftCards();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        homePage.selectMenu("Computers");
        Assert.assertEquals(computers.getPageHeader(), "Computers", "Not navigate to page");

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.selectMenu("Electronics");
        Assert.assertEquals(electronics.getPageHeader(), "Electronics", "Not navigate to page");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homePage.selectMenu("Apparel");
        Assert.assertEquals(apparel.getPageHeader(), "Apparel", "Not navigate to page");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.selectMenu("Digital downloads");
        Assert.assertEquals(digital.getPageHeader(), "Digital downloads", "Not navigate to page");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.selectMenu("Books");
        Assert.assertEquals(books.getPageHeader(), "Books", "Not navigate to page");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageHeader(), "Gift Cards", "Not navigate to page");
    }

}
