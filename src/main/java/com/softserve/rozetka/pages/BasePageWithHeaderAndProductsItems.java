package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.product_items_locators.ProductItemsLocators;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasePageWithHeaderAndProductsItems extends BasePageWithHeader{
    private List<ProductItem> productItems;

    public BasePageWithHeaderAndProductsItems(WebDriver driver) {
        super(driver);
    }

    public List<ProductItem> getTitles() {
        productItems = new ArrayList<>();
        List<WebElement> elements = driver.findElements(ProductItemsLocators.TITLE.getPath());
        for (WebElement webElement: elements){
            productItems.add(new ProductItem(driver,webElement));
        }
        return productItems;
    }
    public List<Integer> getIntegerPrices() {
        productItems = new ArrayList<>();
        List<WebElement> elements = driver.findElements(ProductItemsLocators.PRICE.getPath());
        for (WebElement webElement: elements){
            productItems.add(new ProductItem(driver,webElement));
        }
        return productItems
                .stream()
                .map(webElement -> webElement.getPrice().getText().replaceAll(" ",""))
                .map(el -> Integer.parseInt(el))
                .collect(Collectors.toList());
    }
    public List<ProductItem>getLikeButtons(){
        productItems = new ArrayList<>();
        List<WebElement> elements = driver.findElements(ProductItemsLocators.LIKE.getPath());
        for (WebElement webElement: elements){
            productItems.add(new ProductItem(driver,webElement));
        }
        return productItems;
    }
    public List<String> getStringTitles() {
        productItems = new ArrayList<>();
        List<WebElement> elements = driver.findElements(ProductItemsLocators.TITLE.getPath());
        for (WebElement webElement: elements){
            productItems.add(new ProductItem(driver,webElement));
        }
        return productItems
                .stream()
                .map(webElement -> webElement.getTitle().getText())
                .collect(Collectors.toList());
    }
}
