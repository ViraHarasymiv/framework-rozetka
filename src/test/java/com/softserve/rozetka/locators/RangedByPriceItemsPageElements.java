package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class RangedByPriceItemsPageElements {
    private static By rangeByPriceItems = By.xpath("//span[@class='goods-tile__price-value']");

    public static By getRangeByPriceItems(){
        return rangeByPriceItems;
    }
}
