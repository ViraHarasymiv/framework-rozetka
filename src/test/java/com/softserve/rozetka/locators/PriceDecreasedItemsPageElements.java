package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class PriceDecreasedItemsPageElements {
    private static By fromHigherToLowerPricingSortedItems = By.xpath("//span[contains(@class, 'price-value')]");

    public static By getFromHigherToLowerPricingSortedItems(){
        return fromHigherToLowerPricingSortedItems;
    }
}
