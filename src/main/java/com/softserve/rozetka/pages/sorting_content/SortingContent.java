package com.softserve.rozetka.pages.sorting_content;

import com.softserve.rozetka.locators.sorting_content_locators.SortingContentLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.decreased_by_price_notebooks_page.DecreasedByPriceNotebooksPage;
import com.softserve.rozetka.pages.increased_by_price_notebooks_page.IncreasedByPriceNotebooksPage;
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
    public IncreasedByPriceNotebooksPage selectLowerToHigherOption(){
        waitForElementToAppear(getSortField());
        Select select = new Select(getSortField());
        select.selectByVisibleText(FROM_LOWER_TO_HIGHER_OPTION);
        return new IncreasedByPriceNotebooksPage(driver);
    }

    @Step("Select the 'Від дорогих до дешевих' option")
    public DecreasedByPriceNotebooksPage selectHigherToLowerOption(){
        waitForElementToAppear(getSortField());
        waitForElementToAppear(getSortField());
        Select select = new Select(getSortField());
        select.selectByVisibleText(FROM_HIGHER_TO_LOWER_OPTION);
        return new DecreasedByPriceNotebooksPage(driver);
    }
}