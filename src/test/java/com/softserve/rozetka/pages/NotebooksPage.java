package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.NoSuchElementException;

public class NotebooksPage extends BasePage{
    private static final String FROM_LOWER_TO_HIGHER_OPTION  = "Від дешевих до дорогих";
    private static final String FROM_HIGHER_TO_LOWER_OPTION = "Від дорогих до дешевих";
    private static final String BRAND = "Dell";
    private static final String INVALID_BRAND = "&";

    public NotebooksPage(WebDriver driver) {
        super(driver);
    }

    public PriceIncreasedItemsPage selectLowerToHigherOption(By sortField, By fromLowerToHigherOption){
      waitForElementToAppear(sortField);
      Select select = new Select(driver.findElement(sortField));
      waitForElementToAppear(fromLowerToHigherOption);
      select.selectByVisibleText(FROM_LOWER_TO_HIGHER_OPTION);
        return new PriceIncreasedItemsPage(driver);
    }
    public PriceDecreasedItemsPage selectHigherToLoweOption(By sortField){
        waitForElementToAppear(sortField);
        Select select = new Select(driver.findElement(sortField));
        select.selectByVisibleText(FROM_HIGHER_TO_LOWER_OPTION);
        return new PriceDecreasedItemsPage(driver);
    }

    public NotebooksPage enterBrand(By brandField){
        waitForElementToAppear(brandField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(brandField)).sendKeys(BRAND).perform();
        return this;
    }
    public NotebooksPage enterInvalidBrand(By brandField){
        waitForElementToAppear(brandField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(brandField)).sendKeys(INVALID_BRAND).perform();
        return this;
    }

    public BrandsPage clickOnBrandsCheckBox(By dellCheckBox){
        driver.findElement(dellCheckBox).click();
        return new BrandsPage(driver);
    }
    public List<WebElement> getBrandCheckBoxes(By anyBrandCheckBox) {
        List<WebElement> checkBoxes = driver.findElements(anyBrandCheckBox);
        waitForElementsToDisappear(checkBoxes);
      return driver.findElements(anyBrandCheckBox);
        }
    }
