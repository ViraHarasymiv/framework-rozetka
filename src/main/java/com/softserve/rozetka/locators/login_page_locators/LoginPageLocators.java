package com.softserve.rozetka.locators.login_page_locators;

import org.openqa.selenium.By;

public enum LoginPageLocators {

    //Доробити Локатори
    EMAIL_OR_PHONE_FIELD(By.xpath("//*[@id=\"auth_email\"]")),
    PASSWORD_FIELD(By.xpath("//*[@id=\"auth_pass\"]"));
    LOGIN_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
    INVALID_EMAIL_OR_PHONE_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p"));
    TYPE_OF_EMAIL_OR_PHONE_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]"));
    SIGNIN_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[2]"));
    REMIND_PASSWORD_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/a"));
    HIDE_SHOW_PASSWORD_BUTTON(By.cssSelector("body > app-root > rz-single-modal-window > div.modal__holder.modal__holder_show_animation.modal__holder--medium > div.modal__content > rz-user-identification > rz-auth > div > form > fieldset > div:nth-child(2) > div > div > button > svg > use"));

    private final By path;

    LoginPageLocators(By path) {
        this.path = path;
    }

}
