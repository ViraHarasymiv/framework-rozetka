package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.locators.notebooks_page_locators.SortingContentLocators;
import com.softserve.rozetka.pages.BasePO;
import com.softserve.rozetka.pages.decreased_by_price_notebooks_page.DecreasedByPriceNotebooksPage;
import com.softserve.rozetka.pages.increased_by_price_notebooks_page.IncreasedByPriceNotebooksPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortingContent extends BasePO {
    private WebElement sortField;
    private WebElement bigItemsView;

    private static final String FROM_LOWER_TO_HIGHER_OPTION  = "Від дешевих до дорогих";
    private static final String FROM_HIGHER_TO_LOWER_OPTION = "Від дорогих до дешевих";

    public SortingContent(WebDriver driver) {
        super(driver);
    }

    public WebElement getSortField(){
        if(sortField == null){
            waitForPresenceOfElement(SortingContentLocators.SORT_FIELD.getPath());
            sortField = driver.findElement(SortingContentLocators.SORT_FIELD.getPath());
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

    public IncreasedByPriceNotebooksPage selectLowerToHigherOption(){
        waitForElementToAppear(getSortField());
        Select select = new Select(getSortField());
        select.selectByVisibleText(FROM_LOWER_TO_HIGHER_OPTION);
        return new IncreasedByPriceNotebooksPage(driver);
    }

    public DecreasedByPriceNotebooksPage selectHigherToLowerOption(){
        waitForElementToAppear(getSortField());
        Select select = new Select(getSortField());
        select.selectByVisibleText(FROM_HIGHER_TO_LOWER_OPTION);
        return new DecreasedByPriceNotebooksPage(driver);
    }
}
