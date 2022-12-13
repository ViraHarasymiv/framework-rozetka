package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;

public class NotebooksPage extends BasePageWithHeader {
    protected FilterContent filterContent;
    protected SortingContent sortingContent;

    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/";

    public NotebooksPage(WebDriver driver) {
        super(driver);
        filterContent = new FilterContent(driver);
        sortingContent = new SortingContent(driver);
    }
    public NotebooksPage openPage(){
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
