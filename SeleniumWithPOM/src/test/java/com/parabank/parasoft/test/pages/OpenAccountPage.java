package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.base.BaseTest;
import com.parabank.parasoft.test.utill.General;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends BaseTest {

    @FindBy(css = "input.button")
    WebElement openNewAccountBtnEl;

    @FindBy(css = "#newAccountId")
    WebElement newAccountIdEl;

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public OpenAccountPage clickOpenNewAccountBtn() {
        General.domStable();
        openNewAccountBtnEl.isDisplayed();
        openNewAccountBtnEl.click();
        return this;
    }

    public boolean hasNewAccountId(){
        return newAccountIdEl.isDisplayed();
    }
}
