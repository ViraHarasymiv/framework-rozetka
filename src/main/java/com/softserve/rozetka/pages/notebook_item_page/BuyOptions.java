package com.softserve.rozetka.pages.notebook_item_page;

import com.softserve.rozetka.locators.notebook_item_page_locators.BuyOptionsLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
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

    public WebElement getCartButton() {
        if(cartButton == null){
            waitForPresenceOfElement(BuyOptionsLocators.CART_BUTTON.getPath());
            cartButton = driver.findElement(BuyOptionsLocators.CART_BUTTON.getPath());
        }
        return cartButton;
    }

    @Step("Click on the cart icon")
    public HeaderComponent putItemToCart(){
        Actions actions = new Actions(driver);
        actions.moveToElement(getCartButton()).click().perform();
        return new HeaderComponent(driver);
    }
}