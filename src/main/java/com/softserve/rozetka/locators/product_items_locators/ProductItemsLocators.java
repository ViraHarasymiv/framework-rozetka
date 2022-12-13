package com.softserve.rozetka.locators.product_items_locators;

import org.openqa.selenium.By;

public enum ProductItemsLocators {
    LIKE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/div[1]/app-goods-wishlist/button")),
    TITLE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]/span")),
    PRICE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/p/span[1]"));

    private final By path;

    ProductItemsLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
