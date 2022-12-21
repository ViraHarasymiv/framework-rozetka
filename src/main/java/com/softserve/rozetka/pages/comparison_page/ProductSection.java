package com.softserve.rozetka.pages.comparison_page;

import com.softserve.rozetka.pages.base_pages.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductSection extends BasePage {
    private CompareItem compareItem;

    public ProductSection(WebDriver driver) {
        super(driver);
        compareItem = new CompareItem(driver);
    }

    public CompareItem getCompareItem() {
        return compareItem;
    }
}
