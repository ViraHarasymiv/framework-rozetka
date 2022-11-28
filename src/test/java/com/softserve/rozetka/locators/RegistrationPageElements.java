package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class RegistrationPageElements {
    private static By nameField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[1]");
    private static By surnameField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[2]");
    private static By phoneField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[3]");
    private static By emailField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[4]");
    private static By passwordField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-register/div/form/fieldset/div[5]");
    private static By closeFormButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[1]/button");
    public static By getNameField(){return nameField;}
    public static By getSurnameField(){return surnameField;}
    public static By getPhoneField(){return phoneField;}
    public static By getEmailField(){return emailField;}
    public static By getPasswordField(){return passwordField;}
    public static By getCloseFormButton(){return closeFormButton;}
}
