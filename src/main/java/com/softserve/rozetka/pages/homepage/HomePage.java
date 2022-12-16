package com.softserve.rozetka.pages.homepage;

import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private HeaderComponent headerComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
}
