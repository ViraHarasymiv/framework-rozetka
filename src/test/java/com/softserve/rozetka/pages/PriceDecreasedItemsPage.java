package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class PriceDecreasedItemsPage extends BasePage{
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/sort=expensive/";

    public PriceDecreasedItemsPage(WebDriver driver) {
        super(driver);
    }
    public List<Integer> getActualPricesOfSortedFromHigherToLowerItems(By fromHigherToLowerPricingSortedItems){
        waitForUrlToBe(URL);
        waitForElementsToAppear(fromHigherToLowerPricingSortedItems);
        return driver.findElements(fromHigherToLowerPricingSortedItems)
                .stream()
                .map(webelement -> webelement.getText().replaceAll(" ",""))
                .map(w -> Integer.parseInt(w))
                .collect(Collectors.toList());
    }
}
