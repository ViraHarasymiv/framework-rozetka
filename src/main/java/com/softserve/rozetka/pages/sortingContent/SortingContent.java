package com.softserve.rozetka.pages.sortingContent;

import com.softserve.rozetka.locators.sortingContentLocators.SortingContentLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import com.softserve.rozetka.pages.decreasedByPriceProductsPage.DecreasedByPriceProductsPage;
import com.softserve.rozetka.pages.increasedByPriceProductsPage.IncreasedByPriceProductsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SortingContent extends BasePage {
    private WebElement sortField;
    private WebElement bigItemsView;

    private static final String FROM_LOWER_TO_HIGHER_OPTION  = "Від дешевих до дорогих";
    private static final String FROM_HIGHER_TO_LOWER_OPTION = "Від дорогих до дешевих";

    public SortingContent(WebDriver driver) {
        super(driver);
    }

    public By getSortFieldPath(){
        return SortingContentLocators.SORT_FIELD.getPath();
    }
    public WebElement getSortField(){
        if(sortField == null){
            waitForPresenceOfElement(getSortFieldPath());
            sortField = driver.findElement(getSortFieldPath());
        }
        return sortField;
    }
    public WebElement getBigItemsView(){
        if(bigItemsView == null){
            waitForPresenceOfElement(SortingContentLocators.BIG_ITEMS_VIEW.getPath());
            bigItemsView = driver.findElement(SortingContentLocators.BIG_ITEMS_VIEW.getPath());
        }
        return bigItemsView;
    }

    @Step("Select the 'Від дешевих до дорогих' option")
    public IncreasedByPriceProductsPage selectLowerToHigherOption(){
        waitForElementToAppear(getSortField());
        Select select = new Select(getSortField());
        select.selectByVisibleText(FROM_LOWER_TO_HIGHER_OPTION);
        return new IncreasedByPriceProductsPage(driver);
    }

    @Step("Select the 'Від дорогих до дешевих' option")
    public DecreasedByPriceProductsPage selectHigherToLowerOption(){
        waitForElementToAppear(getSortField());
        Select select = new Select(getSortField());
        select.selectByVisibleText(FROM_HIGHER_TO_LOWER_OPTION);
        return new DecreasedByPriceProductsPage(driver);
    }
}