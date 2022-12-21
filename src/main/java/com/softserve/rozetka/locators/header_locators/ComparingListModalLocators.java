package com.softserve.rozetka.locators.header_locators;

import org.openqa.selenium.By;

public enum ComparingListModalLocators {
    COMPARE_LINK(By.xpath("//a[@class='comparison-modal__link']")),
    ITEMS_QUANTITY(By.xpath("//span[@class='comparison-modal__quantity']")),
    REMOVE_COMPARING_ITEMS(By.xpath("//button[contains(@class, 'comparison-modal__remove')]"));

    private final By path;
    ComparingListModalLocators(By path) {
        this.path = path;
    }
    public By getPath() {
        return path;
    }
}
