package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.LoginPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage {
    private static final String INVALID_EMAIL  = "testdqwerty123";
    private static final String INVALID_PASSWORD  = "qwerty123";
    public static final String UNREGISTERED_EMAIL  = "testqwerty123@gmail.com";
    private static final String PASSWORD_FOR_UNREGISTERED_EMAIL  = "1";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage enterInvalidEmail(By emailAndPhoneField){
        waitForElementToAppear(emailAndPhoneField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(emailAndPhoneField)).sendKeys(INVALID_EMAIL).perform();
        return this;
    }
    public LoginPage clickOnPasswordField(By passwordField){
        waitForElementToAppear(passwordField);
        driver.findElement(passwordField).click();
        return this;
    }
    public LoginPage enterInvalidPassword(By passwordField){
        waitForElementToAppear(passwordField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(passwordField)).sendKeys(INVALID_PASSWORD).perform();
        return this;
    }
    public LoginPage clickOnLoginButton(By loginButton){
        waitForElementToAppear(loginButton);
        driver.findElement(loginButton).click();
        return this;
    }
    public LoginPage clickOnSignInButton(By signInButton){
        waitForElementToAppear(signInButton);
        driver.findElement(signInButton).click();
        return this;
    }
    public LoginPage clickOnRemindPasswordButton(By remindPasswordButton){
        waitForElementToAppear(remindPasswordButton);
        driver.findElement(remindPasswordButton).click();
        return this;
    }
    public LoginPage clickOnHideShowPasswordButton(By hideShowPasswordButton){
        waitForElementToAppear(hideShowPasswordButton);
        driver.findElement(hideShowPasswordButton).click();
        return this;
    }
}
