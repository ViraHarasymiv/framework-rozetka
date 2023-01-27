package com.softserve.rozetka.locators.loginModalLocators;

import org.openqa.selenium.By;

public enum RegistrationModalLocators {
    NAME_FIELD(By.xpath("//label[contains(@for, 'registerUserName')]")),
    SURNAME_FIELD(By.xpath("//label[contains(@for, 'registerUserSurname')]")),
    PHONE_FIELD(By.xpath("//label[contains(@for, 'registerUserPhone')]")),
    EMAIL_FIELD(By.xpath("//label[contains(@for, 'registerUserEmail')]")),
    PASSWORD_FIELD(By.xpath("//label[contains(@for, 'registerUserPassword')]")),
    CLOSE_FORM_BUTTON(By.xpath("//button[contains(@class, 'modal__close')]"));
    private final By path;
    RegistrationModalLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }
}
