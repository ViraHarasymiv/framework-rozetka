package com.softserve.rozetka.pages.brandProductsPage;

import com.softserve.rozetka.pages.basePages.ProductsPage;
import com.softserve.rozetka.pages.sections.header.productItem.ProductItem;
import org.openqa.selenium.WebDriver;

public class BrandProductsPage extends ProductsPage {
    private static final String URL_TEXT = "/producer=";

    public BrandProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlContainsText(URL_TEXT);
        return super.getProductItems();
    }
}