package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class BrandsPageElements {
    private static By itemsOfOneBrand = By.xpath("//span[contains(text(), 'Ноутбук Dell')]");

    public static By getItemsOfOneBrand(){return itemsOfOneBrand;}
}
