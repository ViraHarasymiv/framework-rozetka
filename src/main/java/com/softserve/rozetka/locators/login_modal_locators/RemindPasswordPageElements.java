package com.softserve.rozetka.locators.login_modal_locators;

import org.openqa.selenium.By;

public class RemindPasswordPageElements {
    private static By emailAndPhoneField = By.xpath("//*[@id=\"auth_email\"]");
    private static By temporaryPasswordButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/button");
    private static By rememberedYourPasswordButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[4]/a");
    private static By closeFormButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[1]/button");
    public static By getEmailAndPhoneField(){return emailAndPhoneField;}
    public static By getTemporaryPasswordButton(){return temporaryPasswordButton;}
    public static By getRememberedYourPasswordButton(){return rememberedYourPasswordButton;}
    public static By getCloseFormButton(){return closeFormButton;}
}
