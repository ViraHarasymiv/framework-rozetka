package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class RemindPasswordPageElements {
    private static By emailAndPhoneField = By.xpath("//*[@id=\"auth_email\"]");
    private static By temporaryPasswordButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/button");
    private static By rememberedYourPasswordButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[4]/a");
    public static By getEmailAndPhoneField(){return emailAndPhoneField;}
    public static By getTemporaryPasswordButton(){return temporaryPasswordButton;}
    public static By getRememberedYourPasswordButton(){return rememberedYourPasswordButton;}
}
