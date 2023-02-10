package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.base.BaseTest;
import com.parabank.parasoft.test.utill.General;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BaseTest {
    @FindBy(css = "a[href*='logout']")
    WebElement logoutLink;

    @FindBy(css = "a[href*='openaccount']")
    WebElement openNewAccountLinkEl;

    @FindBy(css = "a[href*='updateprofile']")
    WebElement updateContactInfoLinkEl;

    public OverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLink() {
        return logoutLink.isDisplayed();
    }

    public OpenAccountPage clickOpenNewAccountLink() {
        openNewAccountLinkEl.isDisplayed();
        openNewAccountLinkEl.click();
        return new OpenAccountPage();
    }

    public UpdateProfilePage clickUpdateContactInfoLink() {
        General.domStable();
        updateContactInfoLinkEl.isDisplayed();
        updateContactInfoLinkEl.click();
        return new UpdateProfilePage();
    }
}
