package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.Elements;
import com.softserve.rozetka.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean clickOnLogo(By logo){
        return driver.findElement(logo).isDisplayed();
    }
}
