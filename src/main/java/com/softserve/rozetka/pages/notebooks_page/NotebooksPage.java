package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.pages.base_pages.BasePageWithHeaderAndProducts;
import com.softserve.rozetka.pages.header.HeaderComponent;
import com.softserve.rozetka.pages.notebook_item_page.NotebookItemPage;
import org.openqa.selenium.WebDriver;

public class NotebooksPage extends BasePageWithHeaderAndProducts {
    private final static String URL = "https://rozetka.com.ua/ua/notebooks/c80004/";
    protected FilterContent filterContent;
    protected SortingContent sortingContent;

    public NotebooksPage(WebDriver driver) {
        super(driver);
        filterContent = new FilterContent(driver);
        sortingContent = new SortingContent(driver);
    }

    public FilterContent getFilterContent() {
        waitForUrlToBe(URL);
        return filterContent;
    }

    public SortingContent getSortingContent() {
        return sortingContent;
    }

    public NotebookItemPage clickOnProductItem(){
        getProducts().get(0).click();
        return new NotebookItemPage(driver);
    }
    public HeaderComponent putMultipleProductsToCart(){
        waitForElementsToAppear(getCartIcons());
        for(int i = 0; i <= 3; i++){
            waitForElementToAppear(getCartIcons().get(i));
            getCartIcons().get(i).click();
        }
        return getHeaderComponent();
    }
    public HeaderComponent compareTwoProducts(){
        for(int i = 0; i < 3; i++){
            getCompareButtons().get(i).click();
        }
        return getHeaderComponent();
    }
}
