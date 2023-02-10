package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.base.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import com.parabank.parasoft.test.pages.UpdateProfilePage;
import com.thedeanda.lorem.LoremIpsum;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdateProfileTest extends BaseTest {
    CustomerLoginPage customerLoginPage;
    OverviewPage overviewPage;
    UpdateProfilePage updateProfilePage;

    public UpdateProfileTest() {
        super();
    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
        overviewPage = new CustomerLoginPage()
                .login(getUsername(), getPassword());
    }

    @Test
    public void updateProfileShouldSucceed() {
        updateProfilePage = overviewPage
                .clickUpdateContactInfoLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateAbbr())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .clickUpdateProfileBtn();

        Assert.assertTrue(updateProfilePage.updateProfileSuccessfullyText());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
