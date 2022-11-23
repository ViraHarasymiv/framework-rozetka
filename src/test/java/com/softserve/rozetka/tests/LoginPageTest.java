package com.softserve.rozetka.tests;

import com.softserve.rozetka.locators.*;
import com.softserve.rozetka.pages.HomePage;
import com.softserve.rozetka.pages.LoginPage;
import com.softserve.rozetka.pages.NotebooksPage;
import com.softserve.rozetka.pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.Color;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.softserve.rozetka.pages.LoginPage.UNREGISTERED_EMAIL;

public class LoginPageTest extends BaseRunner {
    private static final String INVALID_EMAIL_OR_PHONE_MESSAGE  = "Введено невірну адресу ел. пошти або номер телефону";
    private static final String TYPE_OF_EMAIL_PHONE_FIELD  = "form__row validation_type_error";
    private static final String[] BORDER_COLOR_EMAIL_FIELD  = new String[]{"248", "65", "71", "1"};
    @BeforeClass
    public void setPreconditions() {
        setDriver();
        new HomePage(driver)
                .clickOnLoginButton(HomePageElements.getLoginToAccountButton());
    }
    @Test(priority = 1)
    public void checkErrorInvalidEmail() {
        new LoginPage(driver)
                .enterInvalidEmail(LoginPageElements.getEmailAndPhoneField())
                .clickOnPasswordField(LoginPageElements.getPasswordField());
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
                .clickOnSignInButton(LoginPageElements.getSignInButton());
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getNameField()).getText(), "Ім'я");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getSurnameField()).getText(), "Прізвище");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getPhoneField()).getText(), "Номер телефону");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getEmailField()).getText(), "Ел. пошта");
        Assert.assertEquals(driver.findElement(RegistrationPageElements.getPasswordField()).getText(), "Придумайте пароль");
    }
}