package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.base.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.RegisterPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    CustomerLoginPage customerLoginPage;
    RegisterPage registerPage;

    public RegisterTest() {
        super();
    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
    }

    @Test
    public void userRegistrationShouldSucceed() {
        String firstName = LoremIpsum.getInstance().getFirstName();
        registerPage = new CustomerLoginPage()
                .clickRegisterLink()
                .fillFirstName(firstName)
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateAbbr())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillSsN("1122")
                .fillUserName(firstName)
                .fillPassword(firstName)
                .fillConfirmPassword(firstName)
                .clickRegisterBtn();

        Assert.assertTrue(registerPage.hasRegisterSuccessfullyTextEl());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
