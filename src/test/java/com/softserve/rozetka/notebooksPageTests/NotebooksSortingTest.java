package com.softserve.rozetka.notebooksPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.pages.notebooksPage.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class contains user's management automated steps for sorting notebooks by price
 *
 * @author Vira Harasymiv
 */
@Feature("Sorting notebooks by price in the Notebooks Page")
public class NotebooksSortingTest extends BaseRunner {

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
    @Description("Verify if a user can sort notebooks from lower to higher price")
    @Severity(SeverityLevel.MINOR)
    @Issue("23")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
    public void checkSortingFromLowerToHigherPrice() {
        List<Integer> actualPrices = new NotebooksPage(driver)
                .getSortingContent()
                .selectLowerToHigherOption()
                .getProductItems()
                .getIntegerPrices();
        List<Integer> expectedPrices = actualPrices
                .stream()
                .sorted()
                .collect(Collectors.toList());
        Asserts.checkSortingFromLowerToHigherPrice(actualPrices, expectedPrices);
    }

    @Test(priority = 2)
    @Description("Verify if a user can sort notebooks from higher to lower price")
    @Severity(SeverityLevel.MINOR)
    @Issue("24")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
    public void checkSortingFromHigherToLowerPrice() {
        List<Integer> actualPrices = new NotebooksPage(driver)
                .getSortingContent()
                .selectHigherToLowerOption()
                .getProductItems()
                .getIntegerPrices();
        List<Integer> expectedPrices = actualPrices
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        Asserts.checkSortingFromHigherToLowerPrice(actualPrices, expectedPrices);
    }
}
