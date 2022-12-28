package com.softserve.rozetka.locators.notebook_item_page_locators;

import org.openqa.selenium.By;

public enum BuyOptionsLocators {
    PRODUCT_PRICE(By.xpath("//span[@class='product-prices__symbol']/..")),
    CART_BUTTON(By.xpath("//button[contains(@class, 'buy-button button button--w')]")),
    CREDIT_BUTTON(By.xpath("//button[contains(text(), 'Купити в кредит')]")),
    COMPARE_ICON(By.xpath("//button[contains(@class, 'compare')]")),
    LIKE_ICON(By.xpath("//li[contains(@class, 'product-buttons')]//app-goods-wishlist/button"));
    private final By path;

    BuyOptionsLocators(By path) {
        this.path = path;
    }
    public By getPath() {
        return path;
    }
}
