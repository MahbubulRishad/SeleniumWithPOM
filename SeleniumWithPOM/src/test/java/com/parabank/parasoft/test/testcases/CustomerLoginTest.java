package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.base.BaseTest;
import org.testng.annotations.BeforeClass;

public class CustomerLoginTest extends BaseTest {
    @BeforeClass
    public void initialization() {
        setUpBrowser();
    }

    public CustomerLoginTest() {
        super();
    }
}
