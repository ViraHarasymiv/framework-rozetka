package com.softserve.rozetka.pages.notebook_item_page;

import com.softserve.rozetka.locators.notebook_item_page_locators.BuyOptionsLocators;
import com.softserve.rozetka.pages.BasePO;
import com.softserve.rozetka.pages.header.HeaderComponent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BuyOptions extends BasePO {
    private WebElement productPrice;
    private WebElement cartButton;
    private WebElement creditButton;
    private WebElement compareButton;
    private WebElement likeIcon;

    public BuyOptions(WebDriver driver) {
        super(driver);
    }

    public WebElement getCartButton() {
        if(cartButton == null){
            waitForPresenceOfElement(BuyOptionsLocators.CART_BUTTON.getPath());
            cartButton = driver.findElement(BuyOptionsLocators.CART_BUTTON.getPath());
        }
        return cartButton;
    }
    public HeaderComponent putItemToCart(){
        Actions actions = new Actions(driver);
        actions.moveToElement(getCartButton()).click().perform();
        return new HeaderComponent(driver);
    }
}
