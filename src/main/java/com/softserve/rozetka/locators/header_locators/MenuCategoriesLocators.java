package com.softserve.rozetka.locators.header_locators;

import org.openqa.selenium.By;

public enum MenuCategoriesLocators {
    NOTEBOOKS_AND_COMPUTERS_CATEGORY(By.xpath("//li[contains(@class, 'menu-categories__item m')]/a[contains(@href, 'c80253/')]")),
    MENU_WRAPPER(By.xpath("//div[contains(@class, 'menu-wrapper')]"));

    private final By path;

    MenuCategoriesLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
