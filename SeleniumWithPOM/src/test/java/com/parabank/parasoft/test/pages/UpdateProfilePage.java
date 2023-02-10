package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.base.BaseTest;
import com.parabank.parasoft.test.utill.General;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UpdateProfilePage extends BaseTest {

    @FindBy(id = "customer.firstName")
    WebElement firstNameEl;

    @FindBy(id = "customer.lastName")
    WebElement lastNameEl;

    @FindBy(id = "customer.address.street")
    WebElement addressEl;

    @FindBy(id = "customer.address.city")
    WebElement cityEl;

    @FindBy(id = "customer.address.state")
    WebElement stateEl;

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCodeEl;

    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumberEl;

    @FindBy(css = "input.button")
    WebElement updateProfileBtnEl;

//    @FindBy(id = "customer.phoneNumber")
//    List<WebElement> phoneNumberEl;

    @FindBy(css = "#rightPanel p")
    WebElement updateProfileSuccessfullyTextEl;


    public UpdateProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public UpdateProfilePage fillFirstName(String firstName) {
        firstNameEl.isDisplayed();
        firstNameEl.clear();
        firstNameEl.sendKeys(firstName);
        return this;
    }

    public UpdateProfilePage fillLastName(String lastName) {
        lastNameEl.isDisplayed();
        lastNameEl.clear();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public UpdateProfilePage fillAddress(String address) {
        addressEl.isDisplayed();
        addressEl.clear();
        addressEl.sendKeys(address);
        return this;
    }

    public UpdateProfilePage fillCity(String city) {
        cityEl.isDisplayed();
        cityEl.clear();
        cityEl.sendKeys(city);
        return this;
    }

    public UpdateProfilePage fillState(String state) {
        stateEl.isDisplayed();
        stateEl.clear();
        stateEl.sendKeys(state);
        return this;
    }

    public UpdateProfilePage fillZipCode(String zipCode) {
        zipCodeEl.isDisplayed();
        zipCodeEl.clear();
        zipCodeEl.sendKeys(zipCode);
        return this;
    }

    public UpdateProfilePage fillPhoneNumber(String number) {
        phoneNumberEl.isDisplayed();
        phoneNumberEl.clear();
        phoneNumberEl.sendKeys(number);
        return this;
    }

    public UpdateProfilePage clickUpdateProfileBtn() {
        updateProfileBtnEl.isDisplayed();
        updateProfileBtnEl.click();
        return this;
    }

//    public boolean hasPhoneNumber() {
//        return phoneNumberEl.size() == 0;
//    }

    public boolean updateProfileSuccessfullyText() {
        General.domStable();
        return updateProfileSuccessfullyTextEl.isDisplayed();
    }
}
