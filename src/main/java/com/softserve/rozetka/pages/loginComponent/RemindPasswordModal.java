package com.softserve.rozetka.pages.loginComponent;

import com.softserve.rozetka.locators.loginModalLocators.RemindPasswordModalLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemindPasswordModal extends BasePage {
    private WebElement emailAndPhoneField;
    private WebElement temporaryPasswordButton;
    private WebElement rememberedYourPasswordButton;
    private WebElement closeFormButton;

    public RemindPasswordModal(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailAndPhoneField() {
        if(emailAndPhoneField == null){
            waitForPresenceOfElement(RemindPasswordModalLocators.EMAIL_AND_PHONE_FIELD.getPath());
            emailAndPhoneField = this.driver.findElement(RemindPasswordModalLocators.EMAIL_AND_PHONE_FIELD.getPath());
        }
        return emailAndPhoneField;
    }
    public WebElement getTemporaryPasswordButton() {
        if(temporaryPasswordButton == null){
            waitForPresenceOfElement(RemindPasswordModalLocators.GET_TEMPORARY_PASSWORD_BUTTON.getPath());
            temporaryPasswordButton = this.driver.findElement(RemindPasswordModalLocators.GET_TEMPORARY_PASSWORD_BUTTON.getPath());
        }
        return temporaryPasswordButton;
    }
    public WebElement getRememberedYourPasswordButton() {
        if(rememberedYourPasswordButton == null){
            waitForPresenceOfElement(RemindPasswordModalLocators.I_REMEMBERED_MY_PASSWORD_BUTTON.getPath());
            rememberedYourPasswordButton = this.driver.findElement(RemindPasswordModalLocators.I_REMEMBERED_MY_PASSWORD_BUTTON.getPath());
        }
        return rememberedYourPasswordButton;
    }
    public WebElement getCloseFormButton() {
        if(closeFormButton == null){
            waitForPresenceOfElement(RemindPasswordModalLocators.CLOSE_FORM_BUTTON.getPath());
            closeFormButton = this.driver.findElement(RemindPasswordModalLocators.CLOSE_FORM_BUTTON.getPath());
        }
        return closeFormButton;
    }

    @Step("Click on the \"Ел. пошта або телефон\" field in the registration modal")
    public RemindPasswordModal clickOnEmailAndPhoneField(){
        waitForElementToAppear(getEmailAndPhoneField());
        getEmailAndPhoneField().click();
        return this;
    }

    @Step("Click on the \"Отримати тимчасовий пароль\" field in the registration modal")
    public RemindPasswordModal clickOnGetTemporaryPasswordButton(){
        waitForElementToAppear(getTemporaryPasswordButton());
        getTemporaryPasswordButton().click();
        return this;
    }

    @Step("Click on the \"Я згадав свій пароль\" field in the registration modal")
    public RemindPasswordModal clickOnRememberedYourPasswordButton(){
        waitForElementToAppear(getRememberedYourPasswordButton());
        getRememberedYourPasswordButton().click();
        return this;
    }

    @Step("Click on the close form button in the registration modal")
    public RemindPasswordModal clickOnCloseFormButton(){
        waitForElementToAppear(getCloseFormButton());
        getCloseFormButton().click();
        return this;
    }
}