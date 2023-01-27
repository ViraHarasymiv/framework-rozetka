package com.softserve.rozetka.notebooksPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.pages.notebooksPage.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import com.softserve.rozetka.utils.BrandsOptionsReader;
import com.softserve.rozetka.utils.PricesOptionsReader;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;

/**
 * This class contains notebooks filtering related tests.
 *
 * @author Vira Harasymiv
 */
@Feature("Filtering notebooks in the Notebooks Page")
public class NotebooksFilteringTest extends BaseRunner {
    private static final String VALID_BRAND = BrandsOptionsReader.get().getValidBrand();
    private static final String INVALID_BRAND = BrandsOptionsReader.get().getInValidBrand();
    private static final String MIN_PRICE = PricesOptionsReader.get().getMinPriceRange();
    private static final String MAX_PRICE = PricesOptionsReader.get().getMaxPriceRange();

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
    @Description("Verify if a user can search notebooks by the valid brand name")
    @Severity(SeverityLevel.NORMAL)
    @Issue("21")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
    public void checkNotebooksFilteringByValidBrandName() {
        List<String> actualResults = new NotebooksPage(driver)
                .getBaseFilterContent()
                .enterValidBrand(VALID_BRAND)
                .clickOnBrandsCheckBox(VALID_BRAND.toLowerCase())
                .getProductItems()
                .getStringTitles();
        Asserts.checkFilteringByValidBrandName(actualResults, VALID_BRAND);
    }

    @Test(priority = 2)
    @Description("Verify if a user can filter notebooks from minimum to maximum price")
    @Severity(SeverityLevel.NORMAL)
    @Issue("25")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
    public void checkNotebooksFilteringByPriceRange() {
        List<Integer> actualResults = new NotebooksPage(driver)
                .getBaseFilterContent()
                .enterMinPrice(MIN_PRICE)
                .enterMaxPrice(MAX_PRICE)
                .clickOnSubmitButton()
                .getProductItems()
                .getIntegerPrices();
        Asserts.checkFilteringByPriceRange(actualResults, MIN_PRICE, MAX_PRICE);
    }

    @Test(priority = 3)
    @Description("Verify if a user can search notebooks by the invalid brand name")
    @Severity(SeverityLevel.NORMAL)
    @Issue("22")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
    public void checkNotebooksFilteringByInvalidBrandName() {
        List<WebElement> allCheckBoxes = new NotebooksPage(driver)
                .getBaseFilterContent()
                .enterInvalidBrand(INVALID_BRAND)
                .getBrandsCheckBoxes();
        Asserts.checkFilteringByInvalidBrandName(allCheckBoxes);
    }
}



