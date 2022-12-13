package com.softserve.rozetka.locators.computers_and_notebooks_page_locators;

import org.openqa.selenium.By;

public enum ComputerComponentsLocators {
    TITLE(By.xpath("//div[@class='tile-cats']/a[contains(text(), 'комплектуючі')]")),
    SSD_MENU(By.xpath("//div[@class='tile-cats']//a[contains(text(), 'SSD')]"));
    private final By path;

    ComputerComponentsLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
