package com.softserve.rozetka.pages.decreased_by_price_notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeaderAndProductsItems;
import org.openqa.selenium.WebDriver;
import java.util.List;


public class DecreasedByPriceNotebooksPage extends BasePageWithHeaderAndProductsItems {
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/sort=expensive/";
    public DecreasedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public List<Integer> getIntegerPrices() {
        waitForUrlToBe(URL);
        return super.getIntegerPrices();
    }
}
