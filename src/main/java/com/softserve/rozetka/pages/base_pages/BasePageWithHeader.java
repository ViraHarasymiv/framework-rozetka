package com.softserve.rozetka.pages.base_pages;

import com.softserve.rozetka.pages.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class BasePageWithHeader extends BasePage{
    private HeaderComponent headerComponent;

    public BasePageWithHeader(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }
    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
}
