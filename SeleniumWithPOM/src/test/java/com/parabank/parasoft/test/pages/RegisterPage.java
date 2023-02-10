package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseTest {

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

    @FindBy(id = "customer.ssn")
    WebElement sSnEl;

    @FindBy(id = "customer.username")
    WebElement userNameEl;

    @FindBy(id = "customer.password")
    WebElement passwordEl;

    @FindBy(id = "repeatedPassword")
    WebElement confirmPasswordEl;

    @FindBy(css = "input.button[value='Register']")
    WebElement registerBtn;

    @FindBy(css = "#rightPanel p")
    WebElement registerSuccessfullyTextEl;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }


    public RegisterPage fillFirstName(String firstName) {
        firstNameEl.isDisplayed();
        firstNameEl.clear();
        firstNameEl.sendKeys(firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastName) {
        lastNameEl.isDisplayed();
        lastNameEl.clear();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public RegisterPage fillAddress(String address) {
        addressEl.isDisplayed();
        addressEl.clear();
        addressEl.sendKeys(address);
        return this;
    }

    public RegisterPage fillCity(String city) {
        cityEl.isDisplayed();
        cityEl.clear();
        cityEl.sendKeys(city);
        return this;
    }

    public RegisterPage fillState(String state) {
        stateEl.isDisplayed();
        stateEl.clear();
        stateEl.sendKeys(state);
        return this;
    }

    public RegisterPage fillZipCode(String zipCode) {
        zipCodeEl.isDisplayed();
        zipCodeEl.clear();
        zipCodeEl.sendKeys(zipCode);
        return this;
    }

    public RegisterPage fillPhoneNumber(String phoneNumber) {
        phoneNumberEl.isDisplayed();
        phoneNumberEl.clear();
        phoneNumberEl.sendKeys(phoneNumber);
        return this;
    }

    public RegisterPage fillSsN(String sSn) {
        sSnEl.isDisplayed();
        sSnEl.clear();
        sSnEl.sendKeys(sSn);
        return this;
    }

    public RegisterPage fillUserName(String userName) {
        userNameEl.isDisplayed();
        userNameEl.clear();
        userNameEl.sendKeys(userName);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        passwordEl.isDisplayed();
        passwordEl.clear();
        passwordEl.sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword) {
        confirmPasswordEl.isDisplayed();
        confirmPasswordEl.clear();
        confirmPasswordEl.sendKeys(confirmPassword);
        return this;
    }

    public RegisterPage clickRegisterBtn() {
        registerBtn.isDisplayed();
        registerBtn.click();
        return this;
    }

    public boolean hasRegisterSuccessfullyTextEl() {
        return registerSuccessfullyTextEl.isDisplayed();
    }


}
