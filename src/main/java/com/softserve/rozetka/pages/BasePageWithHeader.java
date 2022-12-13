package com.softserve.rozetka.pages;

import com.softserve.rozetka.elements.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class BasePageWithHeader extends BasePO{
    private HeaderComponent headerComponent;

    public BasePageWithHeader(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
}
