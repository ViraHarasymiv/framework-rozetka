package com.softserve.rozetka.locators.filterContentLocators;

import org.openqa.selenium.By;

public enum FilterContentLocators {
    BRAND_FIELD(By.xpath("//div[@data-filter-name='producer']//input[@type='search']")),
    CHECKBOXES(By.xpath("//rz-filter-section-autocomplete/ul/li/a[@data-id]")),
    MIN_RANGE_INPUT(By.xpath("//input[@formcontrolname='min']")),
    MAX_RANGE_INPUT(By.xpath("//input[@formcontrolname='max']")),
    SUBMIT_PRICE_BUTTON(By.xpath("//fieldset//button[@type='submit']"));

    private final By path;

    FilterContentLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
