package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class PriceIncreasedItemsPage extends BasePage{

    public PriceIncreasedItemsPage(WebDriver driver) {
        super(driver);
    }
    public List<Integer> getActualPricesOfSortedFromLowerToHigherItems(By fromLoweToHigherPricingSortedItems){
        waitForElementsToAppear(fromLoweToHigherPricingSortedItems);
        return driver.findElements(fromLoweToHigherPricingSortedItems)
                .stream()
                .map(webelement -> webelement.getText().replaceAll(" ",""))
                .map(w -> Integer.parseInt(w))
                .collect(Collectors.toList());
    }
}
