package com.softserve.rozetka.locators.login_modal_locators;

import org.openqa.selenium.By;

public enum RegistrationModalLocators {
    NAME_FIELD(By.xpath("//*[@id=\"registerUserName\"]")),
    SURNAME_FIELD(By.xpath("//*[@id=\"registerUserSurname\"]")),
    PHONE_FIELD(By.xpath("//*[@id=\"registerUserPhone\"]")),
    EMAIL_FIELD(By.xpath("//*[@id=\"registerUserEmail\"]")),
    PASSWORD_FIELD(By.xpath("//*[@id=\"registerUserEmail\"]")),
    CLOSE_FORM_BUTTON(By.xpath("//*[@id=\"registerUserPassword\"]"));
    private final By path;
    RegistrationModalLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }
}
