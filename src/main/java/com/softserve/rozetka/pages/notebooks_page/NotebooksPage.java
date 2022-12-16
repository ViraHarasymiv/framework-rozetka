package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.header.HeaderComponent;
import com.softserve.rozetka.pages.notebook_item_page.NotebookItemPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;

public class NotebooksPage extends ProductsPage {
    private final static String URL = "https://rozetka.com.ua/ua/notebooks/c80004/";
    private FilterContent filterContent;
    private SortingContent sortingContent;

    public NotebooksPage(WebDriver driver) {
        super(driver);
        filterContent = new FilterContent(driver);
        sortingContent = new SortingContent(driver);
    }

    @Override
    public ProductItem getProductItems() {
        waitForUrlToBe(URL);
        return super.getProductItems();
    }

    public FilterContent getFilterContent() {
        waitForUrlToBe(URL);
        return filterContent;
    }

    public SortingContent getSortingContent() {
        return sortingContent;
    }

    public NotebookItemPage clickOnProductItem(){
        getProductItems()
                .getProducts()
                .get(0).click();
        return new NotebookItemPage(driver);
    }
    public HeaderComponent putMultipleProductsToCart(){
        for(int i = 0; i <= 3; i++){
            waitForElementToAppear(getProductItems().getCartIcons().get(i));
            getProductItems().getCartIcons().get(i).click();
        }
        return getHeaderComponent();
    }
    public HeaderComponent compareTwoProducts(){
        for(int i = 0; i < 3; i++){
            getProductItems().getCompareButtons().get(i).click();
        }
        return getHeaderComponent();
    }
}
