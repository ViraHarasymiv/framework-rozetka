package com.softserve.rozetka.pages.product_item;

import com.softserve.rozetka.locators.product_items_locators.ProductItemsLocators;
import com.softserve.rozetka.pages.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductItem extends BasePO {
    private WebElement likeButton;
    private WebElement title;
    private WebElement root;
    public ProductItem(WebDriver driver) {
        super(driver);
    }
    public ProductItem(WebDriver driver, WebElement root) {
        super(driver);
        this.root = root;
    }

    public WebElement getLikeButton() {
        if(likeButton == null) {
            likeButton = this.root.findElement(ProductItemsLocators.LIKE.getPath());
        }
        return likeButton;
    }

    public WebElement getTitle() {
        if(title == null) {
            title = this.root.findElement(ProductItemsLocators.TITLE.getPath());
        }
        return title;
    }
    public WebElement getPrice() {
        if(title == null) {
            title = this.root.findElement(ProductItemsLocators.TITLE.getPath());
        }
        return title;
    }
}
