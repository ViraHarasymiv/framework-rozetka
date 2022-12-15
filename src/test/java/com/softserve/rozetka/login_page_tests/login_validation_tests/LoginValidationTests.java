package com.softserve.rozetka.login_page_tests.login_validation_tests;

import com.softserve.rozetka.locators.login_modal_locators.LoginPageElements;
import com.softserve.rozetka.locators.login_modal_locators.RegistrationPageElements;
import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.login_page.LoginPage;
import com.softserve.rozetka.runners.BaseRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginValidationTests extends BaseRunner {
    private static final String INVALID_EMAIL_OR_PHONE_MESSAGE  = "Введено невірну адресу ел. пошти або номер телефону";
    private static final String TYPE_OF_EMAIL_PHONE_FIELD  = "form__row validation_type_error";
    private static final String[] BORDER_COLOR_EMAIL_FIELD  = new String[]{"248", "65", "71", "1"};

    @BeforeMethod
    public void beforeMethod(){
        setDriver();
    }

    @Test(priority = 1)
    public void checkErrorInvalidEmail() {
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginButton()
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
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginButton()
                .clickOnSignInButton();
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getNameField()).getText(), "Ім'я");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getSurnameField()).getText(), "Прізвище");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getPhoneField()).getText(), "Номер телефону");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getEmailField()).getText(), "Ел. пошта");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getPasswordField()).getText(), "Придумайте пароль");
        new LoginPage(driver)
                .closeLoginForm();
    }
}
