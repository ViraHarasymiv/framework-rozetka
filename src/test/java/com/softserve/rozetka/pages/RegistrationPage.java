package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage clickOnNameField(By nameField){
        waitForElementToAppear(nameField);
        driver.findElement(nameField).click();
        return this;
    }
    public RegistrationPage clickOnSurnameField(By surnameField){
        waitForElementToAppear(surnameField);
        driver.findElement(surnameField).click();
        return this;
    }
    public RegistrationPage clickOnPhoneField(By phoneField){
        waitForElementToAppear(phoneField);
        driver.findElement(phoneField).click();
        return this;
    }
    public RegistrationPage clickOnEmailField(By emailField){
        waitForElementToAppear(emailField);
        driver.findElement(emailField).click();
        return this;
    }
    public RegistrationPage clickOnPasswordField(By passwordField){
        waitForElementToAppear(passwordField);
        driver.findElement(passwordField).click();
        return this;
    }
}
