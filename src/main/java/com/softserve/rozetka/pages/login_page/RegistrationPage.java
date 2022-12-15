package com.softserve.rozetka.pages.login_page;

import com.softserve.rozetka.locators.login_modal_locators.RegistrationPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage implements ICloseLoginForm {

    private By nameField = RegistrationPageElements.getNameField();
    private By surnameField = RegistrationPageElements.getSurnameField();
    private By phoneField = RegistrationPageElements.getPhoneField();
    private By emailField = RegistrationPageElements.getEmailField();
    private By passwordField = RegistrationPageElements.getPasswordField();
    private By closeFormButton = RegistrationPageElements.getCloseFormButton();

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage clickOnNameField(){
        waitForElementToAppear(nameField);
        driver.findElement(nameField).click();
        return this;
    }
    public RegistrationPage clickOnSurnameField(){
        waitForElementToAppear(surnameField);
        driver.findElement(surnameField).click();
        return this;
    }
    public RegistrationPage clickOnPhoneField(){
        waitForElementToAppear(phoneField);
        driver.findElement(phoneField).click();
        return this;
    }
    public RegistrationPage clickOnEmailField(){
        waitForElementToAppear(emailField);
        driver.findElement(emailField).click();
        return this;
    }
    public RegistrationPage clickOnPasswordField(){
        waitForElementToAppear(passwordField);
        driver.findElement(passwordField).click();
        return this;
    }
    public RegistrationPage clickOnCloseFormButton(){
        waitForElementToAppear(closeFormButton);
        driver.findElement(closeFormButton).click();
        return this;
    }
    @Override
    public RegistrationPage closeLoginForm() {
        driver.findElement(closeLoginFormButton).click();
        return this;
    }
}
