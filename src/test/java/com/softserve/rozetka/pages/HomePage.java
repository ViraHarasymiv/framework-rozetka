package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean clickOnLogo(By logo){
        return driver.findElement(logo).isDisplayed();
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
}
