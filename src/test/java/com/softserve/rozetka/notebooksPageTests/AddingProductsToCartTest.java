package com.softserve.rozetka.notebooksPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.header.CartModal;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.pages.notebookItemPage.NotebookItemPage;
import com.softserve.rozetka.pages.notebooksPage.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import com.softserve.rozetka.utils.ItemCountReader;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * This class contains user's automated steps for adding notebooks to the cart.
 *
 * @author Vira Harasymiv
 */
@Feature("Adding notebooks to the cart")
public class AddingProductsToCartTest extends BaseRunner {
    private static final String EXPECTED_PRODUCT_COUNT_IN_CART = "1";
    private static final String EXPECTED_MULTIPLE_COUNT_IN_CART = "3";
    private static final String ITEM_COUNT = ItemCountReader.get().getItemCount();

    @BeforeMethod
    public void beforeEveryTestGoToNotebooksPage() {
        setDriver();
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                .getMenuSection()
                .clickOnNotebooksMenu();
    }

    @Test(priority = 1)
    @Description("Verify if a user can add one notebook to the cart")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("37")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
    public void checkAddingNotebookItemToCart() {
        String actualProductCountInCart = new NotebooksPage(driver)
                .clickOnFirstNotebookItem()
                .getBuyOptions()
                .putItemToCart()
                .getQuantityOfProductsInCart(EXPECTED_PRODUCT_COUNT_IN_CART);
        Asserts.checkAddingOneItemToCart(actualProductCountInCart, EXPECTED_PRODUCT_COUNT_IN_CART);
    }

    @Test(priority = 2)
    @Description("Verify if a user can add multiple notebooks to the cart in the Notebooks Page")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("38")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
    public void checkAddingMultipleNotebooksToCart() {
        String actualProductCountInCart = new NotebooksPage(driver)
                .putMultipleProductsToCart()
                .getQuantityOfProductsInCart(EXPECTED_MULTIPLE_COUNT_IN_CART);
        Asserts.checkAddingThreeItemsToCart(actualProductCountInCart, EXPECTED_MULTIPLE_COUNT_IN_CART);
    }
}
