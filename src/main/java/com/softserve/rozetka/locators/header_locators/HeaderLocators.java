package com.softserve.rozetka.locators.header_locators;

import org.openqa.selenium.By;

public enum HeaderLocators {
    CATALOG_BUTTON(By.xpath("//button[contains(text(), 'Каталог')]")),
    CART_ICON(By.xpath("//rz-cart/button")),
    PRODUCT_QUANTITY_IN_CART(By.xpath("//rz-cart//span")),
    SEARCH_INPUT(By.xpath("//input[@name='search']")),
    LOGIN_BUTTON(By.xpath("//rz-user/button"));

    private final By path;
    HeaderLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }
}
