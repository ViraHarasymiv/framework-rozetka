package com.softserve.rozetka.pages.rangedByPriceProductsPage;

import com.softserve.rozetka.pages.basePages.ProductsPage;
import com.softserve.rozetka.pages.sections.header.productItem.ProductItem;
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
