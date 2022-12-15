package com.softserve.rozetka.locators.banner_locators;

import org.openqa.selenium.By;

public enum BannerLocators {
    BANNER_IMAGES(By.xpath("//a[@id='rz-banner']")),
    BANNER_CLOSE_BUTTONS(By.xpath("//span[@class='exponea-close-cross']"));
    private final By path;
    BannerLocators(By path) {
        this.path = path;
    }
    public By getPath(){
        return path;
    }
}
