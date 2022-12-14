package com.softserve.rozetka.notebooks_page_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
                .openPage()
                .getMenuSection()
                .clickOnNotebooksMenu();
    }

    @Test(priority = 1)
    public void checkNotebooksFilteringByBrand() {
        List<String> results = new NotebooksPage(driver)
                .getFilterContent()
                .enterValidBrand()
                .clickOnBrandsCheckBox()
                .openPage()
                .getTitles();
        Assert.assertTrue(results
                .stream()
                .allMatch(el -> el.contains(SEARCH_BRAND)));
    }

    @Test(priority = 2)
    public void checkNotebooksFilteringByPriceRange() {
        List<Integer> results = new NotebooksPage(driver)
                .getFilterContent()
                .enterMinPrice()
                .enterMaxPrice()
                .clickOnSubmitButton()
                .openPage()
                .getPrices();
        Assert.assertTrue(results
                .stream()
                .allMatch(element -> element >= MIN_PRICE && element <= MAX_PRICE));
    }

    @Test(priority = 3)
    public void checkNotebooksFilteringByInvalidBrand() {
    List<WebElement>allCheckBoxes = new NotebooksPage(driver)
                .getFilterContent()
                .enterInvalidBrand();
                Assert.assertTrue(allCheckBoxes.isEmpty());
    }
}



