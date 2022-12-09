package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.LoginPageElements;
import com.softserve.rozetka.locators.RegistrationPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage implements ICloseLoginForm {
    private static final String INVALID_EMAIL  = "testdqwerty123";
    private static final String INVALID_PASSWORD  = "qwerty123";
    public static final String UNREGISTERED_EMAIL  = "testqwerty123@gmail.com";
    private static final String PASSWORD_FOR_UNREGISTERED_EMAIL  = "1";
    private By emailAndPhoneField = LoginPageElements.getEmailAndPhoneField();
    private By passwordField = LoginPageElements.getPasswordField();
    private By loginButton = LoginPageElements.getLoginButton();
    private By signInButton = LoginPageElements.getSignInButton();
    private By remindPasswordButton = LoginPageElements.getRemindPasswordButton();
    private By hideShowPasswordButton = LoginPageElements.getHideShowPasswordButton();
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage enterInvalidEmail(){
        waitForElementToAppear(emailAndPhoneField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(emailAndPhoneField)).sendKeys(INVALID_EMAIL).perform();
        return this;
    }
    public LoginPage clickOnPasswordField(){
        waitForElementToAppear(passwordField);
        driver.findElement(passwordField).click();
        return this;
    }
    public LoginPage enterInvalidPassword(){
        waitForElementToAppear(passwordField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(passwordField)).sendKeys(INVALID_PASSWORD).perform();
        return this;
    }
    public LoginPage clickOnLoginButton(){
        waitForElementToAppear(loginButton);
        driver.findElement(loginButton).click();
        return this;
    }
    public LoginPage clickOnSignInButton(){
        waitForElementToAppear(signInButton);
        driver.findElement(signInButton).click();
        return this;
    }
    public LoginPage clickOnRemindPasswordButton(){
        waitForElementToAppear(remindPasswordButton);
        driver.findElement(remindPasswordButton).click();
        return this;
    }
    public LoginPage clickOnHideShowPasswordButton(){
        waitForElementToAppear(hideShowPasswordButton);
        driver.findElement(hideShowPasswordButton).click();
        return this;
    }
    @Override
    public LoginPage closeLoginForm() {
        driver.findElement(closeLoginFormButton).click();
        return this;
    }
}
