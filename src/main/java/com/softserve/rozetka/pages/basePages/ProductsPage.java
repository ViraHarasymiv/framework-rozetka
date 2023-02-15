package com.softserve.rozetka.pages.basePages;

import com.softserve.rozetka.pages.baseFilterContent.BaseFilterContent;
import com.softserve.rozetka.pages.sections.header.header.Header;
import com.softserve.rozetka.pages.sections.header.sortingContent.SortingContent;
import com.softserve.rozetka.pages.sections.header.productItem.ProductItem;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    private ProductItem productItem;
    private SortingContent sortingContent;
    private BaseFilterContent baseFilterContent;

    public ProductsPage(WebDriver driver) {
        super(driver);
        productItem = new ProductItem(driver);
        sortingContent = new SortingContent(driver);
        baseFilterContent = new BaseFilterContent(driver);
    }

    public BaseFilterContent getBaseFilterContent() {
        return baseFilterContent;
    }

    public ProductItem getProductItems() {
        return productItem;
    }

    public SortingContent getSortingContent() {
        return sortingContent;
    }

    @Step("Click on the compare icon of the first product")
    public String getFirstProductToCompare() {
        waitForElementToAppear(getProductItems().getCompareButtons().get(0));
        getProductItems().getCompareButtons().get(0).click();
        return getProductItems().getStringTitles().get(0);
    }

    @Step("Click on the compare icon of the second product")
    public String getSecondProductToCompare() {
        waitForElementToAppear(getProductItems().getCompareButtons().get(1));
        getProductItems().getCompareButtons().get(1).click();
        return getProductItems().getStringTitles().get(1);
    }

    public void clickOnFirstProductItem() {
        waitForElementToAppear(getProductItems().getProducts().get(0));
        getProductItems().getProducts().get(0).click();
    }

    @Step("Click on the first three product's cart icons")
    public Header putMultipleProductsToCart() {
        waitForElementsToAppear(getProductItems().getCartIcons());
        for (int i = 0; i < 3; i++) {
            waitForElementToAppear(getProductItems().getCartIcons().get(i));
            waitForElementBecomeClickable(getProductItems().getCartIcons().get(i)).click();
        }
        return getHeaderComponent();
    }
}
