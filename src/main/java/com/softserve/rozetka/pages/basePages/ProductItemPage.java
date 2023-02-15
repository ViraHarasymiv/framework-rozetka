package com.softserve.rozetka.pages.basePages;

import com.softserve.rozetka.locators.notebookItemPageLocators.NotebookItemPageLocators;
import com.softserve.rozetka.pages.sections.header.buyOptionsContent.BuyOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductItemPage extends BasePage {
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

