package com.softserve.rozetka.locators.product_items_locators;

import org.openqa.selenium.By;

public enum ProductItemsLocators {
    LIKE(By.xpath("./rz-catalog-tile//button[contains(@class, 'wish-button')]")),
    TITLE(By.xpath("./rz-catalog-tile//span[@class='goods-tile__title']")),
    PRICE(By.xpath("./rz-catalog-tile//span[@class='goods-tile__price-value']")),
    CART_ICON(By.xpath("./rz-catalog-tile//button[contains(@class, 'buy-button')]")),
    COMPARE_BUTTON(By.xpath("./rz-catalog-tile//button[contains(@class, 'compare-button')]"));

    private final By path;
    ProductItemsLocators(By path) {
        this.path = path;
    }
    public By getPath() {
        return path;
    }
}
