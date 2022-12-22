package com.softserve.rozetka.login_page_tests.login_validation_tests;

import com.softserve.rozetka.locators.login_modal_locators.LoginModalLocators;
import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.softserve.rozetka.pages.login_component.LoginModal;

@Feature("Login fields validation")
public class LoginValidationTests extends BaseRunner {
    private static final String INVALID_EMAIL_OR_PHONE_MESSAGE  = "Введено невірну адресу ел. пошти або номер телефону";
    private static final String TYPE_OF_EMAIL_PHONE_FIELD  = "form__row validation_type_error";
    private static final String[] BORDER_COLOR_EMAIL_FIELD  = new String[]{"248", "65", "71", "1"};

    @BeforeMethod
    public void beforeEveryTestGoToNotebooksPage(){
        setDriver();
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginIcon();
    }

    @Test(priority = 1)
    @Description("Check error \"Введено невірну адресу ел. пошти або номер телефону\" in the login form when entering an email without a domain name")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/10")
    @Issue("10")
    public void checkErrorInvalidEmail() {
        new LoginModal(driver)
                .enterInvalidEmail()
                .clickOnPasswordField();
        Assert.assertEquals(driver.findElement(LoginModalLocators.INVALID_EMAIL_OR_PHONE_FIELD.getPath()).getText(), INVALID_EMAIL_OR_PHONE_MESSAGE);
        Assert.assertEquals(driver.findElement(LoginModalLocators.TYPE_OF_EMAIL_OR_PHONE_FIELD.getPath()).getAttribute("class"), TYPE_OF_EMAIL_PHONE_FIELD);
        String[] rgb = driver.findElement(LoginModalLocators.INVALID_EMAIL_OR_PHONE_FIELD.getPath()).getCssValue("border-bottom-color").replaceAll("(rgba)|(rgb)|(\\()|(\\s)|(\\))","").split(",");
        for(int i = 0; i < rgb.length ;i++){
            Assert.assertEquals(rgb[i], BORDER_COLOR_EMAIL_FIELD[i]);
        }
    }
}
