package com.softserve.rozetka.pages.comparison_page;

import com.softserve.rozetka.pages.base_pages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;

public class ComparisonPage extends BasePageWithHeader {
    private ProductSection productSection;

    public ComparisonPage(WebDriver driver) {
        super(driver);
        productSection = new ProductSection(driver);
    }

    public ProductSection getProductSection() {
        return productSection;
    }
}
