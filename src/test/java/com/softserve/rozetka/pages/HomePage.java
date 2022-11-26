package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnCatalogButton(By catalogButton){
        driver.findElement(catalogButton).click();
        return this;
    }
    public NotebooksAndComputersPage clickOnNotebooksAndComputersCategory(By notebooksAndComputersCategory){
        waitForElementToAppear(notebooksAndComputersCategory);
        driver.findElement(notebooksAndComputersCategory).click();
        return new NotebooksAndComputersPage(driver);
    }
    public LoginPage clickOnLoginButton(By loginBtn){
        waitForElementToAppear(loginBtn);
        driver.findElement(loginBtn).click();
        return new LoginPage(driver);
    }
}
