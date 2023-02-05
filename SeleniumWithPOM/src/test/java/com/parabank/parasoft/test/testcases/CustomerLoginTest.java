package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.base.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerLoginTest extends BaseTest {
    CustomerLoginPage customerLoginPage;
    OverviewPage overviewPage;

    @BeforeClass
    public void initialization() {
        setUpBrowser();
    }

    public CustomerLoginTest() {
        super();
    }


    @Test(priority = 1)
    public void loginShouldSucceed() {
        customerLoginPage = new CustomerLoginPage();

        overviewPage = customerLoginPage
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();

        Assert.assertTrue(overviewPage.isLogoutLink());
    }

    @Test(enabled = false)
    public void loginShouldSucceed2() {
        customerLoginPage = new CustomerLoginPage();
        overviewPage = customerLoginPage
                .login(getUsername(), getPassword());

        Assert.assertTrue(overviewPage.isLogoutLink());
    }

    @Test(priority = 0)
    public void loginShouldFailOnlyUsername() {
        customerLoginPage = new CustomerLoginPage()
                .login(getUsername());

        Assert.assertTrue(customerLoginPage.hasError());

    }

    @Test(priority = 1)
    public void loginShouldFailOnlyPassword() {
        customerLoginPage = new CustomerLoginPage()
                .login(getPassword());

        Assert.assertTrue(customerLoginPage.hasError());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
