package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class PriceIncreasedItemsPageElements {
    private static By fromLoweToHigherPricingSortedItems = By.xpath("//span[contains(@class, 'price-value')]");

    public static By getFromLoweToHigherPricingSortedItems(){
        return fromLoweToHigherPricingSortedItems;
    }
}
