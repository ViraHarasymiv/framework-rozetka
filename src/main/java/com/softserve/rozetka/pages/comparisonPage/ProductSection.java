package com.softserve.rozetka.pages.comparisonPage;

import com.softserve.rozetka.pages.basePages.BasePage;
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
