package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotebooksAndComputersPage extends BasePage{

    public NotebooksAndComputersPage(WebDriver driver) {
        super(driver);
    }
    public NotebooksPage clickOnNotebooksCategory(By notebooksCategory){
        waitForElementToAppear(notebooksCategory);
        driver.findElement(notebooksCategory).click();
        return new NotebooksPage(driver);
    }
}
