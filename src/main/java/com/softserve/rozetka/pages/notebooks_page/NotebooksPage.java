package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeaderAndProductsItems;
import org.openqa.selenium.WebDriver;

public class NotebooksPage extends BasePageWithHeaderAndProductsItems {
    private final static String URL = "https://rozetka.com.ua/ua/notebooks/c80004/";
    protected FilterContent filterContent;
    protected SortingContent sortingContent;

    public NotebooksPage(WebDriver driver) {
        super(driver);
        filterContent = new FilterContent(driver);
        sortingContent = new SortingContent(driver);
    }

    @Override
    public NotebooksPage openPage() {
        driver.navigate().to(URL);
        return this;
    }

    public FilterContent getFilterContent() {
        return filterContent;
    }

    public SortingContent getSortingContent() {
        return sortingContent;
    }

}
