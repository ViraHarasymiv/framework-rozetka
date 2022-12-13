package com.softserve.rozetka.locators.notebooks_page_locators;

import org.openqa.selenium.By;

public enum NotebookComponentLocators {
    LIKE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/div[1]/app-goods-wishlist/button")),
    TITLE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]/span")),
    PRICE(By.xpath("./rz-catalog/div/div/section/rz-grid/ul/li[6]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/p/span[1]"));

    private final By path;

    NotebookComponentLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
