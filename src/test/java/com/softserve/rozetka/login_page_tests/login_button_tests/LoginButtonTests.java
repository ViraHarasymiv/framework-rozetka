package com.softserve.rozetka.login_page_tests.login_button_tests;

import com.softserve.rozetka.locators.login_modal_locators.LoginModalLocators;
import com.softserve.rozetka.locators.login_modal_locators.RegistrationModalLocators;
import com.softserve.rozetka.locators.login_modal_locators.RemindPasswordModalLocators;
import com.softserve.rozetka.pages.home_page.HomePage;
import com.softserve.rozetka.pages.login_component.LoginModal;
import com.softserve.rozetka.runners.BaseRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginButtonTests extends BaseRunner{
    private static final String HIDE_ATTRIBUTE_HIDESHOW_PASSWORD  = "#icon-eye-blind";
    private static final String SHOW_ATTRIBUTE_HIDESHOW_PASSWORD  = "#icon-eye";

    @BeforeMethod
    public void beforeEveryTestGoToNotebooksPage(){
        setDriver();
        new HomePage(driver)
            .getHeaderComponent()
            .clickOnLoginButton();
    }

    @Test(priority = 1)
    public void checkOpenPasswordRecoveryFormAfterClickingOnRemindPasswordButton() {
        new LoginModal(driver)
                .clickOnRemindPasswordButton();
        Assert.assertEquals(driver.findElement(RemindPasswordModalLocators.TEMPORARY_PASSWORD_BUTTON.getPath()).getText(), "Отримати тимчасовий пароль");
        Assert.assertEquals(driver.findElement(RemindPasswordModalLocators.REMEMBERED_YOUR_PASSWORD_BUTTON.getPath()).getText(), "Я згадав свій пароль");
    }

    @Test(priority = 2)
    public void checkOpenSignInModalAfterClickingOnSignInButton() {
        new LoginModal(driver)
                .clickOnSignInButton();
        Assert.assertEquals(driver.findElement(RegistrationModalLocators.NAME_FIELD.getPath()).getText(), "Ім'я");
        Assert.assertEquals(driver.findElement(RegistrationModalLocators.SURNAME_FIELD.getPath()).getText(), "Прізвище");
        Assert.assertEquals(driver.findElement(RegistrationModalLocators.PHONE_FIELD.getPath()).getText(), "Номер телефону");
        Assert.assertEquals(driver.findElement(RegistrationModalLocators.EMAIL_FIELD.getPath()).getText(), "Ел. пошта");
        Assert.assertEquals(driver.findElement(RegistrationModalLocators.PASSWORD_FIELD.getPath()).getText(), "Придумайте пароль");
    }

    @Test(priority = 3)
    public void checkHideShowPasswordButtonShowsPasswordOnEvenNumberClicks(){
        new LoginModal(driver)
                .enterInvalidPassword()
                .clickOnHideShowPasswordButton()
                .clickOnHideShowPasswordButton();
        Assert.assertEquals(driver.findElement(LoginModalLocators.HIDE_SHOW_PASSWORD_BUTTON_HREF.getPath()).getAttribute("href"), HIDE_ATTRIBUTE_HIDESHOW_PASSWORD);
        Assert.assertEquals(driver.findElement(LoginModalLocators.PASSWORD_FIELD.getPath()).getAttribute("type"), "password");
    }

    @Test(priority = 4)
    public void checkHideShowPasswordButtonShowsPasswordOnOddNumberClicks(){
        new LoginModal(driver)
                .enterInvalidPassword()
                .clickOnHideShowPasswordButton();
        Assert.assertEquals(driver.findElement(LoginModalLocators.HIDE_SHOW_PASSWORD_BUTTON_HREF.getPath()).getAttribute("href"), SHOW_ATTRIBUTE_HIDESHOW_PASSWORD);
        Assert.assertEquals(driver.findElement(LoginModalLocators.PASSWORD_FIELD.getPath()).getAttribute("type"), "text");
    }
}
