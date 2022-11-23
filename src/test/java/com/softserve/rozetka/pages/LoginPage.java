package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.LoginPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage {
    private static final String INVALID_EMAIL  = "testdqwerty123";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage enterInvalidEmail(By emailAndPhoneField){
        waitForElementToAppear(emailAndPhoneField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(emailAndPhoneField)).sendKeys(INVALID_EMAIL).perform();
        return this;
    }
    public LoginPage clickOnPasswordField(By passwordField){
        waitForElementToAppear(passwordField);
        driver.findElement(passwordField).click();
        return this;
    }
}
