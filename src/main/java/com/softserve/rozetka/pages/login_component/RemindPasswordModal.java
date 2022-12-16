package com.softserve.rozetka.pages.login_component;

import com.softserve.rozetka.locators.login_modal_locators.RemindPasswordModalLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
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
            waitForPresenceOfElement(RemindPasswordModalLocators.TEMPORARY_PASSWORD_BUTTON.getPath());
            temporaryPasswordButton = this.driver.findElement(RemindPasswordModalLocators.TEMPORARY_PASSWORD_BUTTON.getPath());
        }
        return temporaryPasswordButton;
    }
    public WebElement getRememberedYourPasswordButton() {
        if(rememberedYourPasswordButton == null){
            waitForPresenceOfElement(RemindPasswordModalLocators.REMEMBERED_YOUR_PASSWORD_BUTTON.getPath());
            rememberedYourPasswordButton = this.driver.findElement(RemindPasswordModalLocators.REMEMBERED_YOUR_PASSWORD_BUTTON.getPath());
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
    public RemindPasswordModal clickOnEmailAndPhoneField(){
        waitForElementToAppear(getEmailAndPhoneField());
        getEmailAndPhoneField().click();
        return this;
    }
    public RemindPasswordModal clickOnTemporaryPasswordButton(){
        waitForElementToAppear(getTemporaryPasswordButton());
        getTemporaryPasswordButton().click();
        return this;
    }
    public RemindPasswordModal clickOnRememberedYourPasswordButton(){
        waitForElementToAppear(getRememberedYourPasswordButton());
        getRememberedYourPasswordButton().click();
        return this;
    }
    public RemindPasswordModal clickOnCloseFormButton(){
        waitForElementToAppear(getCloseFormButton());
        getCloseFormButton().click();
        return this;
    }

}
