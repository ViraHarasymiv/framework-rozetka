package com.softserve.rozetka.pages.base_pages;

import com.softserve.rozetka.pages.sorting_content.SortingContent;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePageWithHeader{
    private ProductItem productItem;
    private SortingContent sortingContent;

    public ProductsPage(WebDriver driver) {
        super(driver);
        productItem = new ProductItem(driver);
        sortingContent = new SortingContent(driver);
    }

    public ProductItem getProductItems() {
        return productItem;
    }

    public SortingContent getSortingContent() {
        return sortingContent;
    }
}
