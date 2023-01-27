package com.softserve.rozetka.pages.buyOptionsContent;

import com.softserve.rozetka.locators.notebookItemPageLocators.BuyOptionsLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import com.softserve.rozetka.pages.header.HeaderComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BuyOptions extends BasePage {
    private WebElement productPrice;
    private WebElement cartButton;
    private WebElement creditButton;
    private WebElement compareIcon;
    private WebElement likeIcon;

    public BuyOptions(WebDriver driver) {
        super(driver);
    }

    public WebElement getCompareIcon() {
        if(compareIcon == null){
            waitForPresenceOfElement(BuyOptionsLocators.COMPARE_ICON.getPath());
            compareIcon = driver.findElement(BuyOptionsLocators.COMPARE_ICON.getPath());
        }
        return compareIcon;
    }

    public WebElement getProductPrice() {
        if(productPrice == null){
            waitForPresenceOfElement(BuyOptionsLocators.PRODUCT_PRICE.getPath());
            productPrice = driver.findElement(BuyOptionsLocators.PRODUCT_PRICE.getPath());
        }
        return productPrice;
    }

    public WebElement getCartButton() {
        if(cartButton == null){
            waitForPresenceOfElement(BuyOptionsLocators.CART_BUTTON.getPath());
            cartButton = driver.findElement(BuyOptionsLocators.CART_BUTTON.getPath());
        }
        return cartButton;
    }

    @Step("Click on the cart icon")
    public HeaderComponent putItemToCart(){
        waitForElementToAppear(getCartButton());
        Actions actions = new Actions(driver);
        actions.moveToElement(getCartButton()).click().perform();
        return new HeaderComponent(driver);
    }

    @Step("Pay attention to the notebook's price")
    public Integer getIntegerProductPrice(){
        waitForElementToAppear(getProductPrice());
        return Integer.parseInt(getProductPrice().getText().trim().replaceAll("\\D", ""));
    }
}