package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.RegistrationPageElements;
import com.softserve.rozetka.locators.RemindPasswordPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemindPasswordPage extends BasePage implements ICloseLoginForm{

    private By emailAndPhoneField = RemindPasswordPageElements.getEmailAndPhoneField();
    private By temporaryPasswordButton = RemindPasswordPageElements.getTemporaryPasswordButton();
    private By rememberedYourPasswordButton = RemindPasswordPageElements.getRememberedYourPasswordButton();
    private By closeFormButton = RemindPasswordPageElements.getCloseFormButton();

    public RemindPasswordPage(WebDriver driver) {
        super(driver);
    }

    public RemindPasswordPage clickOnEmailOrPhoneField(){
        waitForElementToAppear(emailAndPhoneField);
        driver.findElement(emailAndPhoneField).click();
        return this;
    }
    public RemindPasswordPage clickOnTemporaryPasswordButton(){
        waitForElementToAppear(temporaryPasswordButton);
        driver.findElement(temporaryPasswordButton).click();
        return this;
    }
    public RemindPasswordPage clickOnRememberedYourPasswordButton(){
        waitForElementToAppear(rememberedYourPasswordButton);
        driver.findElement(rememberedYourPasswordButton).click();
        return this;
    }
    public RemindPasswordPage clickOnCloseFormButton(){
        waitForElementToAppear(closeFormButton);
        driver.findElement(closeFormButton).click();
        return this;
    }
    @Override
    public RemindPasswordPage closeLoginForm() {
        driver.findElement(closeLoginFormButton).click();
        return this;
    }
}
