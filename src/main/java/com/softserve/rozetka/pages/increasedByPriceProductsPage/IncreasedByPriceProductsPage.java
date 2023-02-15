package com.softserve.rozetka.pages.increasedByPriceProductsPage;

import com.softserve.rozetka.pages.basePages.ProductsPage;
import com.softserve.rozetka.pages.sections.header.productItem.ProductItem;
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