package com.softserve.rozetka.locators.product_items_locators;

import org.openqa.selenium.By;

public enum ProductLocators {
    PRODUCTS(By.xpath("//li[contains(@class, 'catalog-grid__cell')]")),
    CARTS(By.xpath("//button[contains(@class, 'buy-button')]"));

    private final By path;

    ProductLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
