package com.softserve.rozetka.pages.increased_by_price_products_page;

import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;

public class IncreasedByPriceProductsPage extends ProductsPage {
    private static final String URL_TEXT = "sort=cheap/";

    public IncreasedByPriceProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlContainsText(URL_TEXT);
        waitForPageLoadComplete();
        return super.getProductItems();
    }
}