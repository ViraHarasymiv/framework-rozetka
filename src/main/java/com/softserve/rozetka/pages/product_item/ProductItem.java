package com.softserve.rozetka.pages.product_item;

import com.softserve.rozetka.locators.product_items_locators.ProductItemsLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ProductItem extends BasePage {
    private List<WebElement> likeButtons;
    private List<WebElement> titles;
    private List<WebElement> prices;
    private List<WebElement> cartIcons;
    private List<WebElement> products;
    private List<WebElement> compareButtons;

    public ProductItem(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getLikeButtons() {
        if (likeButtons == null) {
            waitForPresenceOfAllElements(ProductItemsLocators.LIKE.getPath());
            likeButtons = this.driver.findElements(ProductItemsLocators.LIKE.getPath());
        }
        return likeButtons;
    }

    public List<WebElement> getTitles() {
        if (titles == null) {
            waitForPresenceOfAllElements(ProductItemsLocators.TITLE.getPath());
            titles = this.driver.findElements(ProductItemsLocators.TITLE.getPath());
        }
        return titles;
    }

    public List<WebElement> getPrices() {
        if (prices == null) {
            waitForPresenceOfAllElements(ProductItemsLocators.PRICE.getPath());
            prices = this.driver.findElements(ProductItemsLocators.PRICE.getPath());
        }
        return prices;
    }

    public List<WebElement> getCartIcons() {
        if (cartIcons == null) {
            waitForPresenceOfAllElements(ProductItemsLocators.CART_ICON.getPath());
            cartIcons = this.driver.findElements(ProductItemsLocators.CART_ICON.getPath());
        }
        return cartIcons;
    }

    public List<WebElement> getProducts() {
        if (products == null) {
            waitForPresenceOfAllElements(ProductItemsLocators.PRODUCTS.getPath());
            products = this.driver.findElements(ProductItemsLocators.PRODUCTS.getPath());
        }
        return products;
    }

    public List<WebElement> getCompareButtons() {
        if (compareButtons == null) {
            waitForPresenceOfAllElements(ProductItemsLocators.COMPARE_BUTTON.getPath());
            compareButtons = this.driver.findElements(ProductItemsLocators.COMPARE_BUTTON.getPath());
        }
        return compareButtons;
    }

    @Step("Pay attention to the products titles")
    public List<String>getStringTitles(){
        return getTitles()
                .stream()
                .map(element -> element.getText().toLowerCase())
                .collect(Collectors.toList());
    }

    @Step("Pay attention to the products prices")
    public List<Integer>getIntegerPrices(){
        return getPrices()
                .stream()
                .map(el -> el.getText().replaceAll(" ", ""))
                .map(element -> Integer.parseInt(element))
                .collect(Collectors.toList());
    }
}