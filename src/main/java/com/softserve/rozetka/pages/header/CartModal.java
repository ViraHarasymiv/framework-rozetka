package com.softserve.rozetka.pages.header;

import com.softserve.rozetka.locators.header_locators.CartModalLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartModal extends BasePage {
    private WebElement productPrice;
    private WebElement cartCounterInput;

    public CartModal(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductPrice() {
        if (productPrice == null) {
            waitForPresenceOfElement(CartModalLocators.PRODUCT_PRICE.getPath());
            productPrice = this.driver.findElement(CartModalLocators.PRODUCT_PRICE.getPath());
        }
        return productPrice;
    }

    public WebElement getCartCounterInput() {
        if (cartCounterInput == null) {
            waitForPresenceOfElement(CartModalLocators.CART_COUNTER_INPUT.getPath());
            cartCounterInput = this.driver.findElement(CartModalLocators.CART_COUNTER_INPUT.getPath());
        }
        return cartCounterInput;
    }

    @Step("Change the product's count to {0}")
    public HeaderComponent changeTheItemCount(String itemCount){
        getCartCounterInput().click();
        getCartCounterInput().clear();
        getCartCounterInput().sendKeys(itemCount);
        return new HeaderComponent(driver);
    }

    @Step("Pay attention to the product's price in the cart modal")
    public Integer getProductPriceInCart(){
        waitForElementToAppear(getProductPrice());
        return Integer.parseInt(getProductPrice().getText().trim().replaceAll("\\D", ""));
    }
}
