package com.softserve.rozetka.locators.notebook_item_page_locators;

import org.openqa.selenium.By;

public enum NotebookItemPageLocators {
    PRODUCT_TITLE(By.xpath("//h1[@class='product__title']")),
    PRODUCT_ID(By.xpath("//span[@class='product__code-accent']"));
    private final By path;

    NotebookItemPageLocators(By path) {
        this.path = path;
    }
    public By getPath() {
        return path;
    }
}
