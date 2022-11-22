package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class PriceIncreasedItemsPage extends BasePage{
    private static final String url = "https://rozetka.com.ua/ua/notebooks/c80004/producer=dell;sort=cheap/";

    public PriceIncreasedItemsPage(WebDriver driver) {
        super(driver);
    }
    public List<Integer> getActualPricesOfSortedFromLowerToHigherItems(By fromLoweToHigherPricingSortedItems){
        waitForUrlToBe(url);
        waitForElementsToAppear(fromLoweToHigherPricingSortedItems);
        return driver.findElements(fromLoweToHigherPricingSortedItems)
                .stream()
                .map(webelement -> webelement.getText().replaceAll(" ",""))
                .map(w -> Integer.parseInt(w))
                .collect(Collectors.toList());
    }
}
