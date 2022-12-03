package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.BrandsPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrandsPage extends BasePage{
    private By itemsOfOneBrand = BrandsPageElements.getItemsOfOneBrand();
    public BrandsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getItems(){
        waitForElementsToAppear(itemsOfOneBrand);
        return driver.findElements(itemsOfOneBrand);
    }
}
