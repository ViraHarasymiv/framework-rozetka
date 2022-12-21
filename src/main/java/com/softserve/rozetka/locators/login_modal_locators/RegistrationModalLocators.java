package com.softserve.rozetka.locators.login_modal_locators;

import org.openqa.selenium.By;

public enum RegistrationModalLocators {
    NAME_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[1]/label")),
    SURNAME_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[2]/label")),
    PHONE_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[3]/label")),
    EMAIL_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[4]/label")),
    PASSWORD_FIELD(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[5]/label")),
    CLOSE_FORM_BUTTON(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[6]/label"));
    private final By path;
    RegistrationModalLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }
}
