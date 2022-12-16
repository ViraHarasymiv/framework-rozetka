package com.softserve.rozetka.notebooks_page_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingToCartTest extends BaseRunner {
    private static final String EXPECTED_PRODUCT_COUNT_IN_CART = "1";
    private static final String EXPECTED_MULTIPLE_COUNT_IN_CART = "3";

    @BeforeMethod
    public void beforeEveryTestGoToNotebooksPage(){
        setDriver();
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                .getMenuSection()
                .clickOnNotebooksMenu();
    }
    @Test(priority = 1)
    public void checkAddingNotebookItemToCart(){
        String actualProductCountOfInCart = new NotebooksPage(driver)
                .clickOnProductItem()
                .getBuyOptions()
                .putItemToCart()
                .getQuantityOfProductsInCart();
        Assert.assertTrue(actualProductCountOfInCart.equals(EXPECTED_PRODUCT_COUNT_IN_CART));
    }
    @Test(priority = 2)
    public void checkAddingMultipleNotebooksToCart(){
        String actualProductCountOfInCart = new NotebooksPage(driver)
                .putMultipleProductsToCart()
                .getQuantityOfProductsInCart();
        Assert.assertTrue(actualProductCountOfInCart.equals(EXPECTED_MULTIPLE_COUNT_IN_CART));
    }
}
