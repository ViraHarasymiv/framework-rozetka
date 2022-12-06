package com.softserve.rozetka.locators;

import org.openqa.selenium.By;


public class BunnerElements {
    private static By bunner = By.xpath("//img[@id='rz-banner-img']");
    private static By bunnerClose = By.xpath("//span[@class='exponea-close-cross']");

    public static By getBunner(){
        return bunner;
    }
    public static By getBunnerClose(){
        return bunnerClose;
    }
}
