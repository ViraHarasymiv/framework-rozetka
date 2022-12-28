package com.softserve.rozetka.pages.base_pages;

import com.softserve.rozetka.locators.notebook_item_page_locators.NotebookItemPageLocators;
import com.softserve.rozetka.pages.buy_options_content.BuyOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductItemPage extends BasePageWithHeader{
    private WebElement productTitle;
    private BuyOptions buyOptions;
    private WebElement productId;

    public ProductItemPage(WebDriver driver) {
        super(driver);
        buyOptions = new BuyOptions(driver);
    }

    public BuyOptions getBuyOptions() {
        waitForPageLoadComplete();
        return buyOptions;
    }

    public WebElement getProductId() {
        if(productId == null){
            waitForPresenceOfElement(NotebookItemPageLocators.PRODUCT_ID.getPath());
            productId = driver.findElement(NotebookItemPageLocators.PRODUCT_ID.getPath());
        }
        return productId;
    }
    public String getStringProductId(){
        return getProductId().getText().replaceAll(" ", "");
    }
}

