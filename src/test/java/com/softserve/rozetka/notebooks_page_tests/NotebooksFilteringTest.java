package com.softserve.rozetka.notebooks_page_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import com.softserve.rozetka.pages.product_item.ProductItem;
import com.softserve.rozetka.runners.BaseRunner;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class NotebooksFilteringTest extends BaseRunner {
    private final static String SEARCH_BRAND = "Dell";
    private final static int MIN_PRICE = 5000;
    private final static int MAX_PRICE = 20000;

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
    public void checkNotebooksFilteringByValidBrandName() {
        List<String> actualResults = new NotebooksPage(driver)
                .getFilterContent()
                .enterValidBrand()
                .clickOnBrandsCheckBox()
                .getStringTitles();
        Assert.assertTrue(actualResults
                .stream()
                .allMatch(el -> el.contains(SEARCH_BRAND)));
    }

    @Test(priority = 2)
    public void checkNotebooksFilteringByPriceRange() {
        List<Integer> actualResults = new NotebooksPage(driver)
                .getFilterContent()
                .enterMinPrice()
                .enterMaxPrice()
                .clickOnSubmitButton()
                .getIntegerPrices();
        Assert.assertTrue(actualResults
                .stream()
                .allMatch(element -> element >= MIN_PRICE && element <= MAX_PRICE));
    }

    @Test(priority = 3)
    public void checkNotebooksFilteringByInvalidBrandName() {
    List<WebElement>allCheckBoxes = new NotebooksPage(driver)
                .getFilterContent()
                .enterInvalidBrand();
                Assert.assertTrue(allCheckBoxes.isEmpty());
    }
}



