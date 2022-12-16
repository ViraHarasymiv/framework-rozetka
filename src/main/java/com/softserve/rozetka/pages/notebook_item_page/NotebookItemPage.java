package com.softserve.rozetka.pages.notebook_item_page;

import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.header.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotebookItemPage extends BasePage {
    private HeaderComponent headerComponent;
    private WebElement productTitle;
    private BuyOptions buyOptions;

    public NotebookItemPage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
        buyOptions = new BuyOptions(driver);
    }
    public BuyOptions getBuyOptions() {
        waitForPageLoadComplete();
        return buyOptions;
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
}
