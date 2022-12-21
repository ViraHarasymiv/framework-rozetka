package com.softserve.rozetka.pages.notebook_item_page;

import com.softserve.rozetka.locators.notebook_item_page_locators.NotebookItemPageLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.base_pages.BasePageWithHeader;
import com.softserve.rozetka.pages.header.HeaderComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotebookItemPage extends BasePageWithHeader {
    private WebElement productTitle;
    private BuyOptions buyOptions;
    private WebElement productId;

    public NotebookItemPage(WebDriver driver) {
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