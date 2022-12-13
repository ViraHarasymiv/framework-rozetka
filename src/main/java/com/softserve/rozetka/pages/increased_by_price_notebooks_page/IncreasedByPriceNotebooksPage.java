package com.softserve.rozetka.pages.increased_by_price_notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeaderAndProductsItems;
import org.openqa.selenium.WebDriver;

public class IncreasedByPriceNotebooksPage extends BasePageWithHeaderAndProductsItems {
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/sort=cheap/";

    public IncreasedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public IncreasedByPriceNotebooksPage openPage() {
        driver.navigate().to(URL);
        return this;
    }
}
