package com.softserve.rozetka.pages.basePages;

import com.softserve.rozetka.pages.sections.header.header.Header;
import org.openqa.selenium.WebDriver;

public class BasePage extends BaseElement {
    private Header header;

    public BasePage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
    }
    public Header getHeaderComponent() {
        return header;
    }
}
