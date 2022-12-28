package com.softserve.rozetka.locators.header_locators;

import org.openqa.selenium.By;

public enum CartModalLocators {
    PRODUCT_PRICE(By.xpath("//p[contains(@class, 'price--red')]")),
    CART_COUNTER_INPUT(By.xpath("//input[contains(@class, 'cart-counter')]"));

    private final By path;

    CartModalLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
