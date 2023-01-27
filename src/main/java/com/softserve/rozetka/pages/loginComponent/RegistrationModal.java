package com.softserve.rozetka.pages.loginComponent;
import com.softserve.rozetka.locators.loginModalLocators.RegistrationModalLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationModal extends BasePage {
    private WebElement nameField;
    private WebElement surnameField;
    private WebElement phoneField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement closeFormButton;

    public RegistrationModal(WebDriver driver) {
        super(driver);
    }

    public WebElement getNameField() {
        if(nameField == null){
            waitForPresenceOfElement(RegistrationModalLocators.NAME_FIELD.getPath());
            nameField = this.driver.findElement(RegistrationModalLocators.NAME_FIELD.getPath());
        }
        return nameField;
    }
    public WebElement getSurnameField() {
        if(surnameField == null){
            waitForPresenceOfElement(RegistrationModalLocators.SURNAME_FIELD.getPath());
            surnameField = this.driver.findElement(RegistrationModalLocators.SURNAME_FIELD.getPath());
        }
        return surnameField;
    }
    public WebElement getPhoneField() {
        if(phoneField == null){
            waitForPresenceOfElement(RegistrationModalLocators.PHONE_FIELD.getPath());
            phoneField = this.driver.findElement(RegistrationModalLocators.PHONE_FIELD.getPath());
        }
        return phoneField;
    }
    public WebElement getEmailField() {
        if(emailField == null){
            waitForPresenceOfElement(RegistrationModalLocators.EMAIL_FIELD.getPath());
            emailField = this.driver.findElement(RegistrationModalLocators.EMAIL_FIELD.getPath());
        }
        return emailField;
    }
    public WebElement getPasswordField() {
        if(passwordField == null){
            waitForPresenceOfElement(RegistrationModalLocators.PASSWORD_FIELD.getPath());
            passwordField = this.driver.findElement(RegistrationModalLocators.PASSWORD_FIELD.getPath());
        }
        return passwordField;
    }
    public WebElement getCloseFormButton() {
        if(closeFormButton == null){
            waitForPresenceOfElement(RegistrationModalLocators.CLOSE_FORM_BUTTON.getPath());
            closeFormButton = this.driver.findElement(RegistrationModalLocators.CLOSE_FORM_BUTTON.getPath());
        }
        return closeFormButton;
    }

    @Step("Click on the \"Ім'я\" field in the registration modal")
    public RegistrationModal clickOnNameField(){
        waitForElementToAppear(getNameField());
        getNameField().click();
        return this;
    }

    @Step("Click on the \"Прізвище\" field in the registration modal")
    public RegistrationModal clickOnSurnameField(){
        waitForElementToAppear(getSurnameField());
        getSurnameField().click();
        return this;
    }

    @Step("Click on the \"Номер телефону\" field in the registration modal")
    public RegistrationModal clickOnPhoneField(){
        waitForElementToAppear(getPhoneField());
        getPhoneField().click();
        return this;
    }

    @Step("Click on the \"Ел. пошта\" field in the registration modal")
    public RegistrationModal clickOnEmailField(){
        waitForElementToAppear(getEmailField());
        getEmailField().click();
        return this;
    }

    @Step("Click on the \"Придумайте пароль\" field in the registration modal")
    public RegistrationModal clickOnPasswordField(){
        waitForElementToAppear(getPasswordField());
        getPasswordField().click();
        return this;
    }

    @Step("Click on the close form button in the registration modal")
    public RegistrationModal clickOnCloseFormButton(){
        waitForElementToAppear(getCloseFormButton());
        getCloseFormButton().click();
        return this;
    }
}