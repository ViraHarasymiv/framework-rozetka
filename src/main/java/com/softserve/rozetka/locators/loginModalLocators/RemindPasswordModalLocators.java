package com.softserve.rozetka.locators.loginModalLocators;

import org.openqa.selenium.By;

public enum RemindPasswordModalLocators {
    EMAIL_AND_PHONE_FIELD(By.xpath("//*[@id=\"auth_email\"]")),
    GET_TEMPORARY_PASSWORD_BUTTON(By.xpath("//button[contains(@class, 'button button--large button--green auth-modal__get-pass')]")),
    I_REMEMBERED_MY_PASSWORD_BUTTON(By.xpath("//a[contains(@class, 'auth-modal__remember-link ng-star-inserted')]")),
    CLOSE_FORM_BUTTON(By.xpath("//button[contains(@class, 'modal__close')]"));
    private final By path;
    RemindPasswordModalLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }
}
