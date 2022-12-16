package com.softserve.rozetka.pages.notebook_item_page;

import com.softserve.rozetka.pages.base_pages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotebookItemPage extends BasePageWithHeader {
    private WebElement productTitle;
    private BuyOptions buyOptions;

    public NotebookItemPage(WebDriver driver) {
        super(driver);
        buyOptions = new BuyOptions(driver);
    }
    public BuyOptions getBuyOptions() {
        waitForPageLoadComplete();
        return buyOptions;
    }
}
