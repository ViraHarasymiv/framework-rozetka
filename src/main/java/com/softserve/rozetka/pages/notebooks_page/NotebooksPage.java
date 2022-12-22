package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.header.HeaderComponent;
import com.softserve.rozetka.pages.notebook_item_page.NotebookItemPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import com.softserve.rozetka.pages.sorting_content.SortingContent;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class NotebooksPage extends ProductsPage {
    private final static String URL = "https://rozetka.com.ua/ua/notebooks/c80004/";
    private FilterContent filterContent;

    public NotebooksPage(WebDriver driver) {
        super(driver);
        filterContent = new FilterContent(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlToBe(URL);
        waitForPageLoadComplete();
        return super.getProductItems();
    }

    public FilterContent getFilterContent() {
        waitForUrlToBe(URL);
        waitForPageLoadComplete();
        return filterContent;
    }


    @Step("Click in the first notebook's item in the Notebooks Page")
    public NotebookItemPage clickOnFirstProductItem(){
      waitForElementToAppear(getProductItems().getProducts().get(0));
        getProductItems().getProducts().get(0).click();
        return new NotebookItemPage(driver);
    }

    public NotebookItemPage clickOnSecondProductItem(){
        getProductItems()
                .getProducts()
                .get(1).click();
        return new NotebookItemPage(driver);
    }
    @Step("Click on the cart's icon of the first notebook's item in the Notebooks Page")
    public NotebooksPage putFirstProductToCart(){
           waitForElementToAppear(getProductItems().getCartIcons().get(0));
           getProductItems().getCartIcons().get(0).click();
        return this;
    }

    @Step("Click on the cart's icon of the second notebook's item in the Notebooks Page")
    public NotebooksPage putSecondProductToCart(){
        waitForElementToAppear(getProductItems().getCartIcons().get(1));
        getProductItems().getCartIcons().get(1).click();
        return this;
    }
    @Step("Click on the cart's icon of the third notebook's item in the Notebooks Page")
    public HeaderComponent putThirdProductToCart(){
        waitForElementToAppear(getProductItems().getCartIcons().get(2));
        getProductItems().getCartIcons().get(2).click();
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

