package com.softserve.rozetka.locators.computers_and_notebooks_page_locators;

import org.openqa.selenium.By;

public enum MenuSectionLocators {
    NOTEBOOKS_MENU(By.xpath("//img[@alt='Ноутбуки']")),
    COMPUTERS_NETTOPS_MONOBLOCKS_MENU(By.xpath("//div[@class='tile-cats']/a[contains(text(), 'неттопи, моноблоки')]")),
    MONITORS_MENU(By.xpath("//div[@class='tile-cats']/a[contains(text(), 'Монітори')]")),
    GAMING_MENU(By.xpath("//div[@class='tile-cats']/a[contains(text(), 'Gaming')]")),
    TABLETS_MENU(By.xpath("//div[@class='tile-cats']/a[contains(text(), 'Планшети')]")),
    CABLES_AND_ADAPTERS_MENU(By.xpath("//div[@class='tile-cats']/a[contains(text(), 'Кабелі')]"));

    private final By path;

    MenuSectionLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
