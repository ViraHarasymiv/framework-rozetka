package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.RangedByPriceItemsPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RangedByPriceItemsPage extends BasePage{
    private By rangeByPriceItems = RangedByPriceItemsPageElements.getRangeByPriceItems();
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/price=5000-20000/";
    public RangedByPriceItemsPage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getItemsRangedByPrice(){
        waitForUrlToBe(URL);
        return driver.findElements(rangeByPriceItems);
    }
}
