package com.softserve.rozetka.pages.base_pages;

import com.softserve.rozetka.pages.header.HeaderComponent;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{
    private HeaderComponent headerComponent;
    private ProductItem productItem;

    public ProductsPage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
        productItem = new ProductItem(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }

    public ProductItem getProductItems() {
        return productItem;
    }

}
