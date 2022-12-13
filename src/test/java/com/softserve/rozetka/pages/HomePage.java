package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By loginBtn = HomePageElements.getLoginToAccountButton();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickOnLoginButton(){
        waitForElementToAppear(loginBtn);
        driver.findElement(loginBtn).click();
        return new LoginPage(driver);
    }
}

