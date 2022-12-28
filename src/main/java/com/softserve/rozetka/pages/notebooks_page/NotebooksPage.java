package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.pages.base_pages.ProductItemPage;
import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.base_filter_content.BaseFilterContent;
import com.softserve.rozetka.pages.notebook_item_page.NotebookItemPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class NotebooksPage extends ProductsPage {
    private final static String URL = "https://rozetka.com.ua/ua/notebooks/c80004/";

    public NotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlContainsText(URL);
        waitForPageLoadComplete();
        return super.getProductItems();
    }

    @Override
    public BaseFilterContent getBaseFilterContent() {
        waitForUrlContainsText(URL);
        waitForPageLoadComplete();
        return super.getBaseFilterContent();
    }

    @Step("Click on the first notebook's item in the Notebooks Page")
    public NotebookItemPage clickOnFirstNotebookItem() {
        clickOnFirstProductItem();
        return new NotebookItemPage(driver);
    }
}

