package com.softserve.rozetka.tests;

import com.softserve.rozetka.pages.HomePage;
import com.softserve.rozetka.pages.NotebooksPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NotebooksSortingTest extends BaseRunner {

    @BeforeClass
    public void setPreconditions() {
        setDriver();
         new HomePage(driver)
                 .closeBunner()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                 .closeBunner()
                .clickOnNotebooksCategory()
                 .closeBunner();
    }

    @Test(priority = 1)
    public void checkNotebooksFilteringFromLowerToHigher() {
        List<Integer> actualPricesOfSortedItems = new NotebooksPage(driver)
                .selectLowerToHigherOption()
                .getActualPricesOfSortedFromLowerToHigherItems();
        Assert.assertTrue(actualPricesOfSortedItems.equals(actualPricesOfSortedItems
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList())));
    }

    @Test(priority = 2)
    public void checkNotebooksFilteringFromHigherToLower() {
        List<Integer> actualPriceOfSortedItems = new NotebooksPage(driver)
                .selectHigherToLoweOption()
                .getActualPricesOfSortedFromHigherToLowerItems();
        Assert.assertTrue(actualPriceOfSortedItems.equals(actualPriceOfSortedItems
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())));
    }

    @AfterClass
    public void closeWindow(){
        afterSuite();
    }

}
