package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemindPasswordPage extends BasePage{

    public RemindPasswordPage(WebDriver driver) {
        super(driver);
    }
    public RemindPasswordPage clickOnEmailOrPhoneField(By emailAndPhoneField){
        waitForElementToAppear(emailAndPhoneField);
        driver.findElement(emailAndPhoneField).click();
        return this;
    }
    public RemindPasswordPage clickOnTemporaryPasswordButton(By temporaryPasswordButton){
        waitForElementToAppear(temporaryPasswordButton);
        driver.findElement(temporaryPasswordButton).click();
        return this;
    }
    public RemindPasswordPage clickOnRememberedYourPasswordButton(By rememberedYourPasswordButton){
        waitForElementToAppear(rememberedYourPasswordButton);
        driver.findElement(rememberedYourPasswordButton).click();
        return this;
    }
}
