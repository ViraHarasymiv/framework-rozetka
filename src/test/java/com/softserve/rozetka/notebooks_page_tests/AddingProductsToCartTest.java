package com.softserve.rozetka.notebooks_page_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * This class contains user's automated steps for adding notebooks to the cart.
 *
 * @author Vira Harasymiv
 *
 */
@Feature("Adding notebooks to the cart")
public class AddingProductsToCartTest extends BaseRunner {
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
    @Description("Verify if a user can add the notebook to the cart in the Notebook's Page")
    @Severity(SeverityLevel.CRITICAL)
    public void checkAddingNotebookItemToCart(){
        String actualProductCountOfInCart = new NotebooksPage(driver)
                .clickOnFirstProductItem()
                .getBuyOptions()
                .putItemToCart()
                .getQuantityOfProductsInCart();
        Assert.assertTrue(actualProductCountOfInCart.contentEquals(EXPECTED_PRODUCT_COUNT_IN_CART),
                "Expected product count in the cart should be equal to " + EXPECTED_PRODUCT_COUNT_IN_CART);
    }

    @Test(priority = 2)
    @Description("Verify if a user can add multiple notebooks to the cart in the Notebooks Page")
    @Severity(SeverityLevel.CRITICAL)
    public void checkAddingMultipleNotebooksToCart(){
        String actualProductCountOfInCart = new NotebooksPage(driver)
                .putFirstProductToCart()
                .putSecondProductToCart()
                .putThirdProductToCart()
                .getQuantityOfProductsInCart();
        Assert.assertTrue(actualProductCountOfInCart.contentEquals(EXPECTED_MULTIPLE_COUNT_IN_CART),
                "Expected product count in the cart should be equal to " + EXPECTED_MULTIPLE_COUNT_IN_CART);
    }
}
