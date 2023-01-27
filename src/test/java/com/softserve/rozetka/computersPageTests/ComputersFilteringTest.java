package com.softserve.rozetka.computersPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.computersPage.ComputersPage;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.runners.BaseRunner;
import com.softserve.rozetka.utils.BrandsOptionsReader;
import com.softserve.rozetka.utils.PricesOptionsReader;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
/**
 * This class contains computers filtering related tests.
 *
 * @author Vira Harasymiv
 *
 */
@Feature("Filtering computers in the Computers Page")
public class ComputersFilteringTest extends BaseRunner {
        private static final String VALID_BRAND = BrandsOptionsReader.get().getValidBrand();
        private static final String INVALID_BRAND = BrandsOptionsReader.get().getInValidBrand();
        private static final String MIN_PRICE = PricesOptionsReader.get().getMinPriceRange();
        private static final String MAX_PRICE = PricesOptionsReader.get().getMaxPriceRange();

        @BeforeMethod
        public void beforeEveryTestGoToComputersPage(){
            setDriver();
            new HomePage(driver)
                    .getHeaderComponent()
                    .clickOnCatalogButton()
                    .clickOnNotebooksAndComputersCategory()
                    .getMenuSection()
                    .clickOnComputersNettopsMonoblocksMenu();
        }

        @Test(priority = 1)
        @Description("Verify if a user can search computers by the valid brand name")
        @Severity(SeverityLevel.NORMAL)
        @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
        public void checkComputersFilteringByValidBrandName() {
            List<String> actualResults = new ComputersPage(driver)
                    .getBaseFilterContent()
                    .enterValidBrand(VALID_BRAND)
                    .clickOnBrandsCheckBox(VALID_BRAND.toLowerCase())
                    .getProductItems()
                    .getStringTitles();
            Asserts.checkFilteringByValidBrandName(actualResults,VALID_BRAND);
        }

        @Test(priority = 2)
        @Description("Verify if a user can filter computers from minimum to maximum price")
        @Severity(SeverityLevel.NORMAL)
        @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
        public void checkComputersFilteringByPriceRange() {
            List<Integer> actualResults = new ComputersPage(driver)
                    .getBaseFilterContent()
                    .enterMinPrice(MIN_PRICE)
                    .enterMaxPrice(MAX_PRICE)
                    .clickOnSubmitButton()
                    .getProductItems()
                    .getIntegerPrices();
            Asserts.checkFilteringByPriceRange(actualResults,MIN_PRICE,MAX_PRICE);
        }

        @Test(priority = 3)
        @Description("Verify if a user can search computers by the invalid brand name")
        @Severity(SeverityLevel.NORMAL)
        @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
        public void checkComputersFilteringByInvalidBrandName() {
            List<WebElement>allCheckBoxes = new ComputersPage(driver)
                    .getBaseFilterContent()
                    .enterInvalidBrand(INVALID_BRAND)
                    .getBrandsCheckBoxes();
            Asserts.checkFilteringByInvalidBrandName(allCheckBoxes);
        }
    }
