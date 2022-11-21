package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NotebooksPage extends BasePage{
    private static final String FROM_LOWER_TO_HIGHER_OPTION  = "Від дешевих до дорогих";
    private static final String FROM_HIGHER_TO_LOWER_OPTION = "Від дорогих до дешевих";

    public NotebooksPage(WebDriver driver) {
        super(driver);
    }
    public NotebooksPage selectLowerToHigherOption(By sortField){
        Select select = new Select(driver.findElement(sortField));
        select.selectByVisibleText(FROM_LOWER_TO_HIGHER_OPTION);
        return this;
    }
    public NotebooksPage selectHigherToLoweOption(By sortField){
        Select select = new Select(driver.findElement(sortField));
        select.selectByVisibleText(FROM_HIGHER_TO_LOWER_OPTION);
        return this;
    }

    public PriceIncreasedItemsPage clickOnLowerToHigherOption(By fromLowerToHigherOption){
        waitForElementToAppear(fromLowerToHigherOption);
        driver.findElement(fromLowerToHigherOption).click();
        return new PriceIncreasedItemsPage(driver);
    }
    public PriceDecreasedItemsPage clickOnHigherToLowerOption(By fromHigherToLowerOption){
        waitForElementsToAppear(fromHigherToLowerOption);
        driver.findElement(fromHigherToLowerOption).click();
        return new PriceDecreasedItemsPage(driver);
    }
}
