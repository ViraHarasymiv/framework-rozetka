package com.softserve.rozetka.pages.ranged_by_price_notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeaderAndProductsItems;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RangedByPriceNotebooksPage extends BasePageWithHeaderAndProductsItems {
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/price=5000-20000/";

    public RangedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public RangedByPriceNotebooksPage openPage() {
        driver.navigate().to(URL);
        return this;
    }
}
