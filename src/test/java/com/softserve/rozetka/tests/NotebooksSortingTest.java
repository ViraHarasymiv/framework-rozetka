package com.softserve.rozetka.tests;

import com.softserve.rozetka.locators.*;
import com.softserve.rozetka.pages.HomePage;
import com.softserve.rozetka.pages.NotebooksPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NotebooksSortingTest extends BaseRunner {
    private static final String BRAND = "Dell";

    @BeforeClass
    public void setPreconditions(){
        setDriver();
        NotebooksPage notebooksPage = new HomePage(driver)
                .clickOnCatalogButton(HomePageElements.getCatalogButton())
                .clickOnNotebooksAndComputersCategory(HomePageElements.getNotebooksAndComputersCategory())
                .clickOnNotebooksCategory(NotebooksAndComputersPageElements.getNotebooksCategory());
    }

    @Test (priority = 1)
    public void checkNotebooksFilteringFromLowerToHigher() {
        List<Integer> actualPricesOfSortedItems = new NotebooksPage(driver)
                .selectLowerToHigherOption(NotebooksPageElements.getSortField())
                .clickOnLowerToHigherOption(NotebooksPageElements.getFromLowerToHigherOption())
                .getActualPricesOfSortedFromLowerToHigherItems(PriceIncreasedItemsPageElements
                        .getFromLoweToHigherPricingSortedItems());
        Assert.assertTrue(actualPricesOfSortedItems.equals(actualPricesOfSortedItems
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList())));
    }

    @Test(priority = 2)
    public void checkNotebooksFilteringFromHigherToLower() {
        List<Integer> actualPriceOfSortedItems = new NotebooksPage(driver)
                .selectHigherToLoweOption(NotebooksPageElements.getSortField())
                .clickOnHigherToLowerOption(NotebooksPageElements.getFromHigherToLowerOption())
                .getActualPricesOfSortedFromHigherToLowerItems(PriceDecreasedItemsPageElements
                        .getFromHigherToLowerPricingSortedItems());
        Assert.assertTrue(actualPriceOfSortedItems.equals(actualPriceOfSortedItems
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())));
    }

    @Test(priority = 3)
    public void checkSearchingNotebooksOfOneBrand(){
        List<WebElement> results = new NotebooksPage(driver)
                .enterBrand(NotebooksPageElements.getBrandField())
                .clickOnBrandsCheckBox(NotebooksPageElements.getDellCheckBox())
                .getItems(BrandsPageElements.getItemsOfOneBrand());
        Assert.assertTrue(results
                .stream()
                .allMatch(webelement -> webelement.getText().contains(BRAND)));
    }
}
