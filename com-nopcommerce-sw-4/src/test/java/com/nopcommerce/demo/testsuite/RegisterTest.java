package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.Register;
import com.nopcommerce.demo.pages.RegisterResult;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    Register register = new Register();
    RegisterResult registerResult = new RegisterResult();


    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegister();
        Assert.assertEquals(register.getRegisterText(), "Register", "Not navigate to Page");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRegister();
        register.clickOnGenderButton();
        register.sendFname("Ram");
        register.sendLname("Bam");
        register.sendEmailFill("Kj");
        register.sendPassFill("123456");
        register.sendConfirmPassFill("123456");
        register.clickOnRegisterButton();
        Assert.assertEquals(registerResult.getRegistrationText(), "Your registration completed", "Not navigate to page");

    }
}
