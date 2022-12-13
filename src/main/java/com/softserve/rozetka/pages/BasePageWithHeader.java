package com.softserve.rozetka.pages;

import com.softserve.rozetka.pages.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public abstract class BasePageWithHeader extends BasePO{
    private HeaderComponent headerComponent;

    public BasePageWithHeader(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }
    public abstract BasePO openPage();

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
}
