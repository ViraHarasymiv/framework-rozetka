/*package com.softserve.rozetka.login_page_tests.login_button_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.runners.BaseRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginButtonTests extends BaseRunner{
    private static final String HIDE_ATTRIBUTE_HIDESHOW_PASSWORD  = "#icon-eye-blind";
    private static final String SHOW_ATTRIBUTE_HIDESHOW_PASSWORD  = "#icon-eye";

    @BeforeMethod
    public void beforeMethod(){
        setDriver();
    }

    @Test(priority = 1)
    public void checkOpenPasswordRecoveryFormAfterClickingOnRemindPasswordButton() {
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginButton()
                .clickOnRemindPasswordButton();
        Assert.assertEquals(driver.findElement(RemindPasswordPageElements.getTemporaryPasswordButton()).getText(), "Отримати тимчасовий пароль");
        Assert.assertEquals(driver.findElement(RemindPasswordPageElements.getRememberedYourPasswordButton()).getText(), "Я згадав свій пароль");
    }

    @Test(priority = 2)
    public void checkHideShowPasswordButtonShowsPasswordOnEvenNumberClicks(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginButton()
                .enterInvalidPassword()
                .clickOnHideShowPasswordButton()
                .clickOnHideShowPasswordButton();
        Assert.assertEquals(driver.findElement(LoginPageElements.getHideShowPasswordButtonHref()).getAttribute("href"), HIDE_ATTRIBUTE_HIDESHOW_PASSWORD);
        Assert.assertEquals(driver.findElement(LoginPageElements.getPasswordField()).getAttribute("type"), "password");
    }

    @Test(priority = 3)
    public void checkHideShowPasswordButtonShowsPasswordOnOddNumberClicks(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginButton()
                .enterInvalidPassword()
                .clickOnHideShowPasswordButton();
        Assert.assertEquals(driver.findElement(LoginPageElements.getHideShowPasswordButtonHref()).getAttribute("href"), SHOW_ATTRIBUTE_HIDESHOW_PASSWORD);
        Assert.assertEquals(driver.findElement(LoginPageElements.getPasswordField()).getAttribute("type"), "text");
    }
}*/
