package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.NotebooksAndComputersPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotebooksAndComputersPage extends BasePage implements ICanCloseBunner {
    private By notebooksCategory = NotebooksAndComputersPageElements.getNotebooksCategory();

    public NotebooksAndComputersPage(WebDriver driver) {
        super(driver);
    }

    public NotebooksPage clickOnNotebooksCategory(){
        waitForElementToAppear(notebooksCategory);
        driver.findElement(notebooksCategory).click();
        return new NotebooksPage(driver);
    }

    @Override
    public NotebooksAndComputersPage closeBunner() {
        if (!driver.findElements(bunner).isEmpty()){
            driver.findElement(bunnerClose).click();
        }
        return this;
    }
}
