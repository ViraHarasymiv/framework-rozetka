package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.product_items_locators.ProductItemsLocators;
import com.softserve.rozetka.pages.header.HeaderComponent;
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

    @Override
    public BasePageWithHeaderAndProductsItems openPage() {
        return this;
    }
    public List<String> getTitles() {
        productItems = new ArrayList<>();
        List<WebElement> elements = driver.findElements(ProductItemsLocators.TITLE.getPath());
        for (WebElement webElement: elements){
            productItems.add(new ProductItem(driver,webElement));
        }
        return productItems
                .stream()
                .map(element->element.getTitle().getText())
                .collect(Collectors.toList());
    }
    public List<Integer> getPrices() {
        productItems = new ArrayList<>();
        List<WebElement> elements = driver.findElements(ProductItemsLocators.PRICE.getPath());
        for (WebElement webElement: elements){
            productItems.add(new ProductItem(driver,webElement));
        }
        return productItems.stream()
                .map(el->el.getPrice().getText().replaceAll(" ",""))
                .map(webEl -> Integer.parseInt(webEl))
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
}
