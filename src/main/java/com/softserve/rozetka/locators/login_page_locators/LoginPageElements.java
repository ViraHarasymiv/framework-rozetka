package com.softserve.rozetka.locators.login_page_locators;

import org.openqa.selenium.By;

public class LoginPageElements {
    private static By emailAndPhoneField = By.xpath("//*[@id=\"auth_email\"]");
    private static By passwordField = By.xpath("//*[@id=\"auth_pass\"]");
    private static By loginButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]");
    private static By invalidEmailOrPhoneField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]/p");
    private static By typeOfEmailOrPhoneField = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[1]");
    private static By signInButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[2]");
    private static By remindPasswordButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/a");
    private static By hideShowPasswordButton = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[2]/div/div/button");
    private static By hideShowPasswordButtonHref = By.cssSelector("body > app-root > rz-single-modal-window > div.modal__holder.modal__holder_show_animation.modal__holder--medium > div.modal__content > rz-user-identification > rz-auth > div > form > fieldset > div:nth-child(2) > div > div > button > svg > use");
    public static By getRemindPasswordButton(){return remindPasswordButton;}
    public static By getHideShowPasswordButtonHref(){return hideShowPasswordButtonHref;}
    public static By getEmailAndPhoneField(){return emailAndPhoneField;}
    public static By getPasswordField(){return LoginPageElements.passwordField;}
    public static By getErrorInvalidEmailOrPhoneField(){return LoginPageElements.invalidEmailOrPhoneField;}
    public static By getLoginButton(){return loginButton;}
    public static By getTypeOfEmailOrPhoneField(){return typeOfEmailOrPhoneField;}
    public static By getSignInButton(){return signInButton;}
    public static By getHideShowPasswordButton(){return hideShowPasswordButton;}
}
