package com.softserve.rozetka.locators.login_modal_locators;

import org.openqa.selenium.By;

public enum RemindPasswordModalLocators {
    EMAIL_AND_PHONE_FIELD(By.xpath("//*[@id=\"auth_email\"]")),
    TEMPORARY_PASSWORD_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/button")),
    REMEMBERED_YOUR_PASSWORD_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[4]/a")),
    CLOSE_FORM_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[1]/button"));
    private final By path;
    RemindPasswordModalLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }
}
