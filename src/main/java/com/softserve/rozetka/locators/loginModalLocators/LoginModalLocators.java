package com.softserve.rozetka.locators.loginModalLocators;

import org.openqa.selenium.By;

public enum LoginModalLocators {
    EMAIL_AND_PHONE_FIELD(By.xpath("//*[@id=\"auth_email\"]")),
    PASSWORD_FIELD(By.xpath("//*[@id=\"auth_pass\"]")),
    INVALID_EMAIL_OR_PHONE_FIELD(By.xpath("//p[contains(@class, 'error-message ng-star-inserted')]")),
    TYPE_OF_EMAIL_OR_PHONE_FIELD(By.xpath("//div[contains(@class, 'form__row validation_type_error')]")),
    SIGN_IN_BUTTON(By.xpath("//button[contains(@class, 'auth-modal__register-link button button--link ng-star-inserted')]")),
    REMIND_PASSWORD_BUTTON(By.xpath("//a[contains(@class, 'link-dotted auth-modal__restore-link ng-star-inserted')]")),
    HIDE_SHOW_PASSWORD_BUTTON(By.xpath("//button[contains(@class, 'button_type_link form__toggle-password')]")),
    HIDE_SHOW_PASSWORD_BUTTON_HREF(By.cssSelector((".button_type_link.form__toggle-password [href]")));

    private final By path;
    LoginModalLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }

}
