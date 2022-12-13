package com.softserve.rozetka.locators.notebooks_page_locators;

import org.openqa.selenium.By;

public enum SortingContentLocators {
    SORT_FIELD(By.xpath("//select")),
    BIG_ITEMS_VIEW(By.xpath("//button[@title='Крупна плитка']"));

    private final By path;

    SortingContentLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
