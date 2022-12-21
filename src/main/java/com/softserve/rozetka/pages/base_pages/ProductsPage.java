package com.softserve.rozetka.pages.base_pages;

import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePageWithHeader{
    private ProductItem productItem;

    public ProductsPage(WebDriver driver) {
        super(driver);
        productItem = new ProductItem(driver);
    }

    public ProductItem getProductItems() {
        return productItem;
    }

}
