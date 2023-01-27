package com.softserve.rozetka.locators.comparasionPageLocators;

import org.openqa.selenium.By;

public enum ComparisonPageLocators {
    PRODUCT_TITLES(By.xpath("//a[@class='product__heading']"));
    private final By path;

    ComparisonPageLocators(By path) {
        this.path = path;
    }
    public By getPath() {
        return path;
    }
}
