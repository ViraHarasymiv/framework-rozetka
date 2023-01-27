package com.softserve.rozetka.pages.loginComponent;

import com.softserve.rozetka.locators.loginModalLocators.LoginModalLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginModal extends BasePage {
    private static final String INVALID_EMAIL  = "testdqwerty123";
    private static final String INVALID_PASSWORD  = "qwerty123";
    public static final String UNREGISTERED_EMAIL  = "testqwerty123@gmail.com";
    private static final String PASSWORD_FOR_UNREGISTERED_EMAIL  = "1";
    private WebElement emailAndPhoneField;
    private WebElement passwordField;
    private WebElement invalidEmailOrPhoneField;
    private WebElement typeOfEmailOrPhoneField;
    private WebElement signInButton;
    private WebElement remindPasswordButton;
    private WebElement hideShowPasswordButton;
    private WebElement hideShowPasswordButtonHref;

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailAndPhoneField() {
        if(emailAndPhoneField == null){
            waitForPresenceOfElement(LoginModalLocators.EMAIL_AND_PHONE_FIELD.getPath());
            emailAndPhoneField = this.driver.findElement(LoginModalLocators.EMAIL_AND_PHONE_FIELD.getPath());
        }
        return emailAndPhoneField;
    }

    public WebElement getPasswordField() {
        if(passwordField == null){
            waitForPresenceOfElement(LoginModalLocators.PASSWORD_FIELD.getPath());
            passwordField = this.driver.findElement(LoginModalLocators.PASSWORD_FIELD.getPath());
        }
        return passwordField;
    }

    public WebElement getInvalidEmailOrPhoneField() {
        if(invalidEmailOrPhoneField == null){
            waitForPresenceOfElement(LoginModalLocators.INVALID_EMAIL_OR_PHONE_FIELD.getPath());
            invalidEmailOrPhoneField = this.driver.findElement(LoginModalLocators.INVALID_EMAIL_OR_PHONE_FIELD.getPath());
        }
        return invalidEmailOrPhoneField;
    }

    public WebElement getTypeOfEmailOrPhoneField() {
        if(typeOfEmailOrPhoneField == null){
            waitForPresenceOfElement(LoginModalLocators.TYPE_OF_EMAIL_OR_PHONE_FIELD.getPath());
            typeOfEmailOrPhoneField = this.driver.findElement(LoginModalLocators.TYPE_OF_EMAIL_OR_PHONE_FIELD.getPath());
        }
        return typeOfEmailOrPhoneField;
    }

    public WebElement getSignInButton() {
        if(signInButton == null){
            waitForPresenceOfElement(LoginModalLocators.SIGN_IN_BUTTON.getPath());
            signInButton = this.driver.findElement(LoginModalLocators.SIGN_IN_BUTTON.getPath());
        }
        return signInButton;
    }

    public WebElement getRemindPasswordButton() {
        if(remindPasswordButton == null){
            waitForPresenceOfElement(LoginModalLocators.REMIND_PASSWORD_BUTTON.getPath());
            remindPasswordButton = this.driver.findElement(LoginModalLocators.REMIND_PASSWORD_BUTTON.getPath());
        }
        return remindPasswordButton;
    }

    public WebElement getHideShowPasswordCheckBox() {
        if(hideShowPasswordButton == null){
            waitForPresenceOfElement(LoginModalLocators.HIDE_SHOW_PASSWORD_BUTTON.getPath());
            hideShowPasswordButton = this.driver.findElement(LoginModalLocators.HIDE_SHOW_PASSWORD_BUTTON.getPath());
        }
        return hideShowPasswordButton;
    }

    public WebElement getHideShowPasswordButtonHref() {
        if(hideShowPasswordButtonHref == null){
            waitForPresenceOfElement(LoginModalLocators.HIDE_SHOW_PASSWORD_BUTTON_HREF.getPath());
            hideShowPasswordButtonHref = this.driver.findElement(LoginModalLocators.HIDE_SHOW_PASSWORD_BUTTON_HREF.getPath());
        }
        return hideShowPasswordButtonHref;
    }

    @Step("Enter the value of e-mail without domain in the \"Ел. пошта або телефон\" input field ")
    public LoginModal enterInvalidEmail(){
        waitForElementToAppear(getEmailAndPhoneField());
        Actions actions = new Actions(driver);
        actions.click(getEmailAndPhoneField()).sendKeys(INVALID_EMAIL).perform();
        return this;
    }

    @Step("Click on the \"Пароль\" field in the login modal")
    public LoginModal clickOnPasswordField(){
        waitForElementToAppear(getPasswordField());
        (getPasswordField()).click();
        return this;
    }

    @Step("Enter the invalid value in the \"Пароль\" input field ")
    public LoginModal enterInvalidPassword(){
        waitForElementToAppear(getPasswordField());
        Actions actions = new Actions(driver);
        actions.click(getPasswordField()).sendKeys(INVALID_PASSWORD).perform();
        return this;
    }

    @Step("Click on the \"Зареєструватися\" button in the login modal")
    public LoginModal clickOnSignInButton(){
        waitForElementToAppear(getSignInButton());
        getSignInButton().click();
        return this;
    }

    @Step("Click on the \"Нагадати пароль\" button in the login modal")
    public LoginModal clickOnRemindPasswordButton(){
        waitForElementToAppear(getRemindPasswordButton());
        getRemindPasswordButton().click();
        return this;
    }

    @Step("Click on the Hide/Show password check box in the login modal")
    public LoginModal clickOnHideShowPasswordCheckBox(){
        waitForElementToAppear(getHideShowPasswordCheckBox());
        getHideShowPasswordCheckBox().click();
        return this;
    }
}