package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class LoginPageElements {
    private static By emailAndPhoneField = By.xpath("//*[@id=\"auth_email\"]");
    private static By passwordField = By.xpath("//*[@id=\"auth_pass\"]");
    private static By loginButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]");
    private static By errorEmailOrPhone = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p");
    private static By typeOfEmailOrPhoneField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]");
    public static By getEmailAndPhoneField(){return emailAndPhoneField;}
    public static By getPasswordField(){return LoginPageElements.passwordField;}
    public static By getErrorInvalidEmailOrPhone(){return LoginPageElements.errorEmailOrPhone;}
    public static By getLoginButton(){return loginButton;}
    public static By getTypeOfEmailOrPhoneField(){return typeOfEmailOrPhoneField;}
}
