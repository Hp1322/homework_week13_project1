package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.Login;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    Login login = new Login();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLoginLink();
        Assert.assertEquals(login.getWelcomeText(), "Welcome, Please Sign In!", "Not Naviagte to page");

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        login.sendEmail("ha@ymail.com");
        login.sendPass("123456");
        login.clickOnLoginButton();
        Assert.assertEquals(homePage.getLogOutText(), "Log out", "Not Naviagte to page");
        homePage.clickOnLogOut();
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnLoginLink();
        login.sendEmail("haji@ymail.com");
        login.sendPass("123456");
        login.clickOnLoginButton();
        Assert.assertEquals(login.getErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\n"+"No customer account found", "Not Naviagte to page");
    }

}
