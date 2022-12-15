package com.softserve.rozetka.locators.login_modal_locators;

import org.openqa.selenium.By;

public enum LoginModalLocators {
    EMAIL_AND_PHONE_FIELD(By.xpath("//*[@id=\"auth_email\"]")),
    PASSWORD_FIELD(By.xpath("//*[@id=\"auth_pass\"]")),
    INVALID_EMAIL_OR_PHONE_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p")),
    TYPE_OF_EMAIL_OR_PHONE_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]")),
    SIGN_IN_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[2]")),
    REMIND_PASSWORD_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/a")),
    HIDE_SHOW_PASSWORD_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[2]/div/div/button")),
    HIDE_SHOW_PASSWORD_BUTTON_HREF(By.cssSelector("body > app-root > rz-single-modal-window > div.modal__holder.modal__holder_show_animation.modal__holder--medium > div.modal__content > rz-user-identification > rz-auth > div > form > fieldset > div:nth-child(2) > div > div > button > svg > use"));

    private final By path;
    LoginModalLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }

}
