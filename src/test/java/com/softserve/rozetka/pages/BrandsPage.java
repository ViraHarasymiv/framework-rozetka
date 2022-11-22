package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrandsPage extends BasePage{

    public BrandsPage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getItems(By itemsOfOneBrand){
        waitForElementsToAppear(itemsOfOneBrand);
        return driver.findElements(itemsOfOneBrand);
    }
}
