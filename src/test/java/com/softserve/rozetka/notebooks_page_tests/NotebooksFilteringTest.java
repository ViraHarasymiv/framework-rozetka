package com.softserve.rozetka.notebooks_page_tests;

import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import com.softserve.rozetka.utils.BrandsOptionsReader;
import com.softserve.rozetka.utils.PricesOptionsReader;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.List;

/**
 * This class contains notebooks filtering related tests.
 *
 * @author Vira Harasymiv
 *
 */
public class NotebooksFilteringTest extends BaseRunner {
    private static final String VALID_BRAND = BrandsOptionsReader.get().getValidBrand();;
    private static final String INVALID_BRAND = BrandsOptionsReader.get().getInValidBrand();
    private static final String MIN_PRICE = PricesOptionsReader.get().getMinPriceRange();
    private static final String MAX_PRICE = PricesOptionsReader.get().getMaxPriceRange();

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
    @Description("Verify if a user can search notebooks by the valid brand name")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/21")
    @Issue("21")
    public void checkNotebooksFilteringByValidBrandName() {
        List<String> actualResults = new NotebooksPage(driver)
                .getFilterContent()
                .enterValidBrand(VALID_BRAND)
                .clickOnBrandsCheckBox()
                .getProductItems()
                .getStringTitles();
        Assert.assertTrue(actualResults
                .stream()
                .allMatch(el -> el.contains(VALID_BRAND.toLowerCase())),
                "Not all notebook's titles contain " + VALID_BRAND);
    }

    @Test(priority = 2)
    @Description("Verify if a user can filter notebooks from minimum to maximum price")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/25")
    @Issue("25")
    public void checkNotebooksFilteringByPriceRange() {
        List<Integer> actualResults = new NotebooksPage(driver)
                .getFilterContent()
                .enterMinPrice(MIN_PRICE)
                .enterMaxPrice(MAX_PRICE)
                .clickOnSubmitButton()
                .getProductItems()
                .getIntegerPrices();
        Assert.assertTrue(actualResults
                .stream()
                .allMatch(element -> element >= Integer.parseInt(MIN_PRICE) && element <= Integer.parseInt(MAX_PRICE)),
                "Notebook's price range should be between " + MIN_PRICE + " and " + MAX_PRICE);
    }

    @Test(priority = 3)
    @Description("Verify if a user can search notebooks by the invalid brand name")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://github.com/Test-Automation-Crash-Course-24-10-22/team_16/issues/22")
    @Issue("22")
    public void checkNotebooksFilteringByInvalidBrandName() {
    List<WebElement>allCheckBoxes = new NotebooksPage(driver)
                .getFilterContent()
                .enterInvalidBrand(INVALID_BRAND);
                Assert.assertTrue(allCheckBoxes.isEmpty(),
                        "The brand name is invalid. Brand checkboxes shouldn't be shown");
    }
}



