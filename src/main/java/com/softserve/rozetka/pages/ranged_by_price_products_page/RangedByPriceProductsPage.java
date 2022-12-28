package com.softserve.rozetka.pages.ranged_by_price_products_page;

import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;

public class RangedByPriceProductsPage extends ProductsPage {
    private static final String URL_TEXT = "/price=";

    public RangedByPriceProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlContainsText(URL_TEXT);
        return super.getProductItems();
    }
}
