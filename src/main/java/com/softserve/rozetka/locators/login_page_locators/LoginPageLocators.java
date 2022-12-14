package com.softserve.rozetka.locators.login_page_locators;

import org.openqa.selenium.By;

public enum LoginPageLocators {

    //Доробити Локатори
    NOTEBOOKS_AND_COMPUTERS_CATEGORY(By.xpath("//li[contains(@class, 'menu-categories__item m')]/a[contains(@href, 'c80253/')]")),
    MENU_WRAPPER(By.xpath("//div[contains(@class, 'menu-wrapper')]"));

    private final By path;

    LoginPageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }




}
