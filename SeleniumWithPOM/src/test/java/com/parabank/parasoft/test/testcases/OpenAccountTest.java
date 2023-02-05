package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.base.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OpenAccountPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenAccountTest extends BaseTest {

    CustomerLoginPage customerLoginPage;
    OverviewPage overviewPage;
    OpenAccountPage openAccountPage;

    public OpenAccountTest() {
        super();
    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
        overviewPage = new CustomerLoginPage()
                .login(getUsername(), getPassword());
    }

    @Test
    public void openAccountSuccessfully() {
//        customerLoginPage = new CustomerLoginPage();
//        overviewPage = customerLoginPage.login(getUsername(), getPassword());
        openAccountPage = overviewPage
                .clickOpenNewAccountLink()
                .clickOpenNewAccountBtn();

        Assert.assertTrue(openAccountPage.hasNewAccountId());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
