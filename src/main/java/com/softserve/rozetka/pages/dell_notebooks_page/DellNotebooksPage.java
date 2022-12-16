package com.softserve.rozetka.pages.dell_notebooks_page;

import com.softserve.rozetka.pages.base_pages.BasePageWithHeaderAndProducts;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DellNotebooksPage extends BasePageWithHeaderAndProducts {
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/producer=dell/";

    public DellNotebooksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public List<String> getStringTitles() {
        waitForUrlToBe(URL);
        return super.getStringTitles();
    }
}

