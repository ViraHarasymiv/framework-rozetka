package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.header.HeaderComponent;
import com.softserve.rozetka.pages.notebook_item_page.NotebookItemPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class NotebooksPage extends ProductsPage {
    private final static String URL = "https://rozetka.com.ua/ua/notebooks/c80004/";
    private FilterContent filterContent;
    private SortingContent sortingContent;

    public NotebooksPage(WebDriver driver) {
        super(driver);
        filterContent = new FilterContent(driver);
        sortingContent = new SortingContent(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlToBe(URL);
        return super.getProductItems();
    }

    public FilterContent getFilterContent() {
        waitForUrlToBe(URL);
        return filterContent;
    }

    public SortingContent getSortingContent() {
        return sortingContent;
    }

    @Step("Click in the first notebook's item in the Notebooks Page")
    public NotebookItemPage clickOnFirstProductItem(){
        getProductItems()
                .getProducts()
                .get(0).click();
        return new NotebookItemPage(driver);
    }

    public NotebookItemPage clickOnSecondProductItem(){
        getProductItems()
                .getProducts()
                .get(1).click();
        return new NotebookItemPage(driver);
    }

    @Step("Click on the cart's icons of the multiple notebook's items in the Notebooks Page")
    public HeaderComponent putMultipleProductsToCart(){
        for(int i = 0; i <= 3; i++){
            waitForElementToAppear(getProductItems().getCartIcons().get(i));
            getProductItems().getCartIcons().get(i).click();
        }
        return getHeaderComponent();
    }

    @Step("Click on the compare icon of the first notebook's item in the Notebooks Page")
    public String getFirstProductToCompare(){
            waitForElementToAppear(getProductItems().getCompareButtons().get(0));
            getProductItems().getCompareButtons().get(0).click();
        return getProductItems().getStringTitles().get(0);
    }

    @Step("Click on the compare icon of the second notebook's item in the Notebooks Page")
    public String getSecondProductToCompare(){
        waitForElementToAppear(getProductItems().getCompareButtons().get(1));
        getProductItems().getCompareButtons().get(1).click();
        return getProductItems().getStringTitles().get(1);
    }
}

