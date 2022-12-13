package com.softserve.rozetka.pages.dell_notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeaderAndProductsItems;
import org.openqa.selenium.WebDriver;

public class DellNotebooksPage extends BasePageWithHeaderAndProductsItems {
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/producer=dell/";

    public DellNotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DellNotebooksPage openPage() {
        driver.navigate().to(URL);
        return this;
    }
}

