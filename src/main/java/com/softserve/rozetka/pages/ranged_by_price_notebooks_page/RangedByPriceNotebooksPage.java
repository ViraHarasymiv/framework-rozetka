package com.softserve.rozetka.pages.ranged_by_price_notebooks_page;

import com.softserve.rozetka.pages.base_pages.BasePageWithHeaderAndProducts;
import org.openqa.selenium.WebDriver;
import java.util.List;


public class RangedByPriceNotebooksPage extends BasePageWithHeaderAndProducts {
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/price=5000-20000/";

    public RangedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public List<Integer> getIntegerPrices() {
        waitForUrlToBe(URL);
        return super.getIntegerPrices();
    }
}
