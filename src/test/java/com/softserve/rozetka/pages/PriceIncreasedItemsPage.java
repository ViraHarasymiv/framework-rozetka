package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.PriceIncreasedItemsPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class PriceIncreasedItemsPage extends BasePage{
    private By fromLowerToHigherPricingSortedItems = PriceIncreasedItemsPageElements.getFromLoweToHigherPricingSortedItems();
private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/sort=cheap/";

    public PriceIncreasedItemsPage(WebDriver driver) {
        super(driver);
    }

    public List<Integer> getActualPricesOfSortedFromLowerToHigherItems(){
        waitForUrlToBe(URL);
        waitForElementsToAppear(fromLowerToHigherPricingSortedItems);
        return driver.findElements(fromLowerToHigherPricingSortedItems)
                .stream()
                .map(webelement -> webelement.getText().replaceAll(" ",""))
                .map(w -> Integer.parseInt(w))
                .collect(Collectors.toList());
    }
}
