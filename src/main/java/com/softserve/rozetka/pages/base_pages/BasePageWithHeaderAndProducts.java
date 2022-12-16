package com.softserve.rozetka.pages.base_pages;

import com.softserve.rozetka.locators.product_items_locators.ProductLocators;
import com.softserve.rozetka.pages.base_pages.BasePageWithHeader;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasePageWithHeaderAndProducts extends BasePageWithHeader {
    private List<ProductItem> productItems;

    public BasePageWithHeaderAndProducts(WebDriver driver) {
        super(driver);
    }

    public List<ProductItem> getProductItems() {
        productItems = new ArrayList<>();
        waitForPresenceOfAllElements(ProductLocators.PRODUCTS.getPath());
        List<WebElement> elements = driver.findElements(ProductLocators.PRODUCTS.getPath());
            for(WebElement product: elements) {
                productItems.add(new ProductItem(driver, product));
            }
            return productItems;
        }
    public List<String> getStringTitles(){
        return getProductItems()
                .stream()
                .map(el -> el.getTitle().getText().toLowerCase())
                .collect(Collectors.toList());
    }
    public List<Integer> getIntegerPrices(){
        return getProductItems()
                .stream()
                .map(webElement -> webElement.getPrice().getText().replaceAll(" ",""))
                .map(el -> Integer.parseInt(el))
                .collect(Collectors.toList());
    }

    public List<WebElement>getCartIcons(){
        waitForPresenceOfAllElements(ProductLocators.CARTS.getPath());
        return driver.findElements(ProductLocators.CARTS.getPath());
    }
    public List<WebElement>getProducts(){
        waitForPresenceOfAllElements(ProductLocators.PRODUCTS.getPath());
        return driver.findElements(ProductLocators.PRODUCTS.getPath());
    }
    public List<WebElement>getCompareButtons(){
        return getProductItems()
                .stream()
                .map(el->el.getCompareButton())
                .collect(Collectors.toList());
    }
}
