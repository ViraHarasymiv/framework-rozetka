package com.softserve.rozetka.tests;

import com.softserve.rozetka.locators.*;
import com.softserve.rozetka.pages.HomePage;
import com.softserve.rozetka.pages.LoginPage;
import com.softserve.rozetka.runners.BaseRunner;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends BaseRunner {
    private static final String INVALID_EMAIL_OR_PHONE_MESSAGE  = "Введено невірну адресу ел. пошти або номер телефону";
    private static final String TYPE_OF_EMAIL_PHONE_FIELD  = "form__row validation_type_error";
    private static final String[] BORDER_COLOR_EMAIL_FIELD  = new String[]{"248", "65", "71", "1"};
    private static final String HIDE_ATTRIBUTE_HIDESHOW_PASSWORD  = "#icon-eye-blind";
    private static final String SHOW_ATTRIBUTE_HIDESHOW_PASSWORD  = "#icon-eye";
    @BeforeClass
    public void setPreconditions() {
        setDriver();
        new HomePage(driver)
                .clickOnLoginButton();
    }
    @Test(priority = 1)
    public void checkErrorInvalidEmail() {
        new LoginPage(driver)
                .enterInvalidEmail()
                .clickOnPasswordField();
        Assert.assertEquals(driver.findElement(LoginPageElements.getErrorInvalidEmailOrPhoneField()).getText(), INVALID_EMAIL_OR_PHONE_MESSAGE);
        Assert.assertEquals(driver.findElement(LoginPageElements.getTypeOfEmailOrPhoneField()).getAttribute("class"), TYPE_OF_EMAIL_PHONE_FIELD);
        String[] rgb = driver.findElement(LoginPageElements.getErrorInvalidEmailOrPhoneField()).getCssValue("border-bottom-color").replaceAll("(rgba)|(rgb)|(\\()|(\\s)|(\\))","").split(",");
        for(int i = 0; i < rgb.length ;i++){
            Assert.assertEquals(rgb[i], BORDER_COLOR_EMAIL_FIELD[i]);
        }
    }
    @Test(priority = 2)
    public void checkErrorUnregisteredEmail() {
        new LoginPage(driver)
                .clickOnSignInButton();
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getNameField()).getText(), "Ім'я");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getSurnameField()).getText(), "Прізвище");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getPhoneField()).getText(), "Номер телефону");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getEmailField()).getText(), "Ел. пошта");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getPasswordField()).getText(), "Придумайте пароль");
        new LoginPage(driver)
                .closeLoginForm();
    }
    @Test(priority = 3)
    public void checkOpenPasswordRecoveryFormAfterClickingOnRemindPasswordButton() {
        new HomePage(driver)
                .clickOnLoginButton();
        new LoginPage(driver)
                .clickOnRemindPasswordButton();
        Assert.assertEquals(driver.findElement(RemindPasswordPageElements.getTemporaryPasswordButton()).getText(), "Отримати тимчасовий пароль");
        Assert.assertEquals(driver.findElement(RemindPasswordPageElements.getRememberedYourPasswordButton()).getText(), "Я згадав свій пароль");
        new LoginPage(driver)
                .closeLoginForm();
    }
    @Test(priority = 4)
    public void checkHideShowPasswordButtonShowsPasswordOnEvenNumberClicks(){
        new HomePage(driver)
                .clickOnLoginButton();
        new LoginPage(driver)
                .enterInvalidPassword()
                .clickOnHideShowPasswordButton()
                .clickOnHideShowPasswordButton();
        Assert.assertEquals(driver.findElement(LoginPageElements.getHideShowPasswordButtonHref()).getAttribute("href"), HIDE_ATTRIBUTE_HIDESHOW_PASSWORD);
        Assert.assertEquals(driver.findElement(LoginPageElements.getPasswordField()).getAttribute("type"), "password");
    }
    @Test(priority = 5)
    public void checkHideShowPasswordButtonShowsPasswordOnOddNumberClicks(){
        new LoginPage(driver)
                .enterInvalidPassword()
                .clickOnHideShowPasswordButton();
        Assert.assertEquals(driver.findElement(LoginPageElements.getHideShowPasswordButtonHref()).getAttribute("href"), SHOW_ATTRIBUTE_HIDESHOW_PASSWORD);
        Assert.assertEquals(driver.findElement(LoginPageElements.getPasswordField()).getAttribute("type"), "text");
    }
   @AfterClass
    public void closeWindow(){
        afterSuite();
    }
}