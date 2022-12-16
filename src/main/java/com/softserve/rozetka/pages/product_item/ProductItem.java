package com.softserve.rozetka.pages.product_item;

import com.softserve.rozetka.locators.product_items_locators.ProductItemsLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductItem extends BasePage {
    private WebElement likeButton;
    private WebElement title;
    private WebElement price;
    private WebElement cartIcon;
    private WebElement root;
    private WebElement compareButton;

    public ProductItem(WebDriver driver) {
        super(driver);
    }

    public ProductItem(WebDriver driver , WebElement root) {
        super(driver);
        this.root = root;
    }

    public WebElement getLikeButton() {
        if (likeButton == null) {
            likeButton = this.root.findElement(ProductItemsLocators.LIKE.getPath());
        }
        return likeButton;
    }

    public WebElement getTitle() {
        if (title == null) {
            title = this.root.findElement(ProductItemsLocators.TITLE.getPath());
        }
        return title;
    }

    public WebElement getPrice() {
        if (price == null) {
            price = this.root.findElement(ProductItemsLocators.PRICE.getPath());
        }
        return price;
    }

    public WebElement getCartIcon() {
        if (cartIcon == null) {
            cartIcon = this.root.findElement(ProductItemsLocators.CART_ICON.getPath());
        }
        return cartIcon;
    }

    public WebElement getCompareButton() {
        if (compareButton == null) {
            compareButton = this.root.findElement(ProductItemsLocators.COMPARE_BUTTON.getPath());
        }
        return compareButton;
    }
}
