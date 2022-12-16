package com.softserve.rozetka.locators.product_items_locators;

import org.openqa.selenium.By;

public enum ProductItemsLocators {
    LIKE(By.xpath("//button[contains(@class, 'wish-button')]")),
    TITLE(By.xpath("//span[@class='goods-tile__title']")),
    PRICE(By.xpath("//span[@class='goods-tile__price-value']")),
    CART_ICON(By.xpath("//button[contains(@class, 'buy-button')]")),
    COMPARE_BUTTON(By.xpath("//button[contains(@class, 'compare-button')]")),
    PRODUCTS(By.xpath("//li[contains(@class, 'catalog-grid__cell')]"));

    private final By path;
    ProductItemsLocators(By path) {
        this.path = path;
    }
    public By getPath() {
        return path;
    }
}
