package com.softserve.rozetka.pages.decreased_by_price_notebooks_page;

import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;

public class DecreasedByPriceNotebooksPage extends ProductsPage {
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/sort=expensive/";

    public DecreasedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlToBe(URL);
        return super.getProductItems();
    }
}