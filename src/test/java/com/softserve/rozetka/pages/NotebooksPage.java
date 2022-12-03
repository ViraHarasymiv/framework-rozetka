package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.NotebooksPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class NotebooksPage extends BasePage implements ICanCloseBunner {
    private By sortField = NotebooksPageElements.getSortField();
    private By fromLowerToHigherOption = NotebooksPageElements.getFromLowerToHigherOption();
    private By  brandField = NotebooksPageElements.getBrandField();
    private By dellCheckBox = NotebooksPageElements.getDellCheckBox();
    private By anyBrandCheckBox = NotebooksPageElements.getAnyBrandCheckBox();

    private static final String FROM_LOWER_TO_HIGHER_OPTION  = "Від дешевих до дорогих";
    private static final String FROM_HIGHER_TO_LOWER_OPTION = "Від дорогих до дешевих";
    private static final String BRAND = "Dell";
    private static final String INVALID_BRAND = "&";

    public NotebooksPage(WebDriver driver) {
        super(driver);
    }

    public PriceIncreasedItemsPage selectLowerToHigherOption(){
      waitForElementToAppear(sortField);
      Select select = new Select(driver.findElement(sortField));
      waitForElementToAppear(fromLowerToHigherOption);
      select.selectByVisibleText(FROM_LOWER_TO_HIGHER_OPTION);
        return new PriceIncreasedItemsPage(driver);
    }
    public PriceDecreasedItemsPage selectHigherToLoweOption(){
        waitForElementToAppear(sortField);
        Select select = new Select(driver.findElement(sortField));
        select.selectByVisibleText(FROM_HIGHER_TO_LOWER_OPTION);
        return new PriceDecreasedItemsPage(driver);
    }

    public NotebooksPage enterBrand(){
        waitForElementToAppear(brandField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(brandField)).sendKeys(BRAND).perform();
        return this;
    }
    public NotebooksPage enterInvalidBrand(){
        waitForElementToAppear(brandField);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(brandField)).sendKeys(INVALID_BRAND).perform();
        return this;
    }

    public BrandsPage clickOnBrandsCheckBox(){
        driver.findElement(dellCheckBox).click();
        return new BrandsPage(driver);
    }
    public List<WebElement> getBrandCheckBoxes() {
        List<WebElement> checkBoxes = driver.findElements(anyBrandCheckBox);
        waitForElementsToDisappear(checkBoxes);
      return driver.findElements(anyBrandCheckBox);
        }

    @Override
    public BasePage closeBunner() {
        if (driver.findElements(bunner).size() !=0 ){
            driver.findElement(bunnerClose).click();
        }
        return this;
    }
}
