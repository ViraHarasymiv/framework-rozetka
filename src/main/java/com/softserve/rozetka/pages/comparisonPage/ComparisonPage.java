package com.softserve.rozetka.pages.comparisonPage;

import com.softserve.rozetka.pages.basePages.BasePage;
import org.openqa.selenium.WebDriver;

public class ComparisonPage extends BasePage {
    private ProductSection productSection;

    public ComparisonPage(WebDriver driver) {
        super(driver);
        productSection = new ProductSection(driver);
    }

    public ProductSection getProductSection() {
        return productSection;
    }
}
