package com.softserve.rozetka.notebooks_page_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import com.softserve.rozetka.pages.sorting_content.SortingContent;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class contains user's management automated steps for sorting notebooks by price
 *
 * @author Vira Harasymiv
 *
 */
@Feature("Sorting notebooks by price")
public class NotebooksSortingTest extends BaseRunner {

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
    @Description("Verify if a user can sort notebooks from lower to higher price")
    @Severity(SeverityLevel.MINOR)
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/23")
    @Issue("23")
    public void checkSortingFromLowerToHigherPrice(){
        List<Integer> actualPrices = new NotebooksPage(driver)
                .getSortingContent()
                .selectLowerToHigherOption()
                .getProductItems()
                .getIntegerPrices();
        Assert.assertTrue(actualPrices.equals(actualPrices
                .stream()
                .sorted()
                .collect(Collectors.toList())));
    }
    @Test(priority = 2)
    @Description("Verify if a user can sort notebooks from higher to lower price")
    @Severity(SeverityLevel.MINOR)
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/24")
    @Issue("24")
    public void checkSortingFromHigherToLowerPrice(){
        List<Integer> actualPrices = new NotebooksPage(driver)
                .getSortingContent()
                .selectHigherToLowerOption()
                .getProductItems()
                .getIntegerPrices();
        Assert.assertTrue(actualPrices.equals(actualPrices
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())));
    }
}
