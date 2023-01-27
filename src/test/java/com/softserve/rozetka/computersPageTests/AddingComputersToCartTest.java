package com.softserve.rozetka.computersPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.computerItemPage.ComputerItemPage;
import com.softserve.rozetka.pages.computersPage.ComputersPage;
import com.softserve.rozetka.pages.header.CartModal;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.runners.BaseRunner;
import com.softserve.rozetka.utils.ItemCountReader;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * This class contains user's automated steps for adding computers to the cart.
 *
 * @author Vira Harasymiv
 */
@Feature("Adding computers to the cart")
public class AddingComputersToCartTest extends BaseRunner {
    private static final String EXPECTED_PRODUCT_COUNT_IN_CART = "1";
    private static final String EXPECTED_MULTIPLE_COUNT_IN_CART = "3";
    private static final String ITEM_COUNT = ItemCountReader.get().getItemCount();

    @BeforeMethod
    public void beforeEveryTestGoToComputersPage() {
        setDriver();
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                .getMenuSection()
                .clickOnComputersNettopsMonoblocksMenu();
    }

    @Test(priority = 1)
    @Description("Verify if a user can add one computer to the cart")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
    public void checkAddingComputerItemToCart() {
        String actualProductCountInCart = new ComputersPage(driver)
                .clickOnFirstComputerItem()
                .getBuyOptions()
                .putItemToCart()
                .getQuantityOfProductsInCart(EXPECTED_PRODUCT_COUNT_IN_CART);
        Asserts.checkAddingOneItemToCart(actualProductCountInCart,EXPECTED_PRODUCT_COUNT_IN_CART);
    }

    @Test(priority = 2)
    @Description("Verify if a user can add multiple computers to the cart in the Computers Page")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
    public void checkAddingMultipleComputersToCart() {
        String actualProductCountInCart = new ComputersPage(driver)
                .putMultipleProductsToCart()
                .getQuantityOfProductsInCart(EXPECTED_MULTIPLE_COUNT_IN_CART);
        Asserts.checkAddingThreeItemsToCart(actualProductCountInCart,EXPECTED_MULTIPLE_COUNT_IN_CART);
    }
}
