package com.softserve.rozetka.notebooks_filtering_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksComponent;
import com.softserve.rozetka.runners.BaseRunner;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class NotebooksFilteringTest extends BaseRunner {
    private final static String SEARCH_BRAND = "Dell";
    private final static int MIN_PRICE = 5000;
    private final static int MAX_PRICE = 20000;


    @Test(priority = 1)
    public void checkNotebooksFilteringByBrand() {
        List<NotebooksComponent> results = new HomePage(driver)
                 .getHeaderComponent()
                 .clickOnCatalogButton()
                 .clickOnNotebooksAndComputersCategory()
                .openPage()
                 .getMenuSection()
                 .clickOnNotebooksMenu()
                .openPage()
                .getFilterContent()
                .enterValidBrand()
                .clickOnBrandsCheckBox()
                        .getTitles();
        Assert.assertTrue(results
                .stream()
                .map(webEl -> webEl.getTitle()
                        .getText())
                .allMatch(el->el.contains(SEARCH_BRAND)));
    }
    @Test(priority = 2)
    public void checkNotebooksFilteringByPrice() {
        List<NotebooksComponent> results = new HomePage(driver)
                .getHeaderComponent()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                .openPage()
                .getMenuSection()
                .clickOnNotebooksMenu()
                .openPage()
                .getFilterContent()
                .enterMinPrice()
                .enterMaxPrice()
                .clickOnSubmitButton()
                .getPrices();
        Assert.assertTrue(results
                .stream()
                .map(el->el.getPrice().getText().replaceAll(" ",""))
                .map(webEl -> Integer.parseInt(webEl))
                .allMatch(element -> element >= MIN_PRICE && element <= MAX_PRICE));
    }
    }



