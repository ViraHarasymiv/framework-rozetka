package com.softserve.rozetka.computersPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.computersPage.ComputersPage;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class contains user's management automated steps for sorting computers by price
 *
 * @author Vira Harasymiv
 *
 */
@Feature("Sorting computers by price in the Notebooks Page")
public class ComputersSortingTest extends BaseRunner {

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
        @Description("Verify if a user can sort computers from lower to higher price")
        @Severity(SeverityLevel.MINOR)
        @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
        public void checkSortingFromLowerToHigherPrice(){
            List<Integer> actualPrices = new ComputersPage(driver)
                    .getSortingContent()
                    .selectLowerToHigherOption()
                    .getProductItems()
                    .getIntegerPrices();
            List<Integer> expectedPrices = actualPrices
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());
            Asserts.checkSortingFromLowerToHigherPrice(actualPrices,expectedPrices);
        }

        @Test(priority = 2)
        @Description("Verify if a user can sort computers from higher to lower price")
        @Severity(SeverityLevel.MINOR)
        @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
        public void checkSortingFromHigherToLowerPrice(){
            List<Integer> actualPrices = new ComputersPage(driver)
                    .getSortingContent()
                    .selectHigherToLowerOption()
                    .getProductItems()
                    .getIntegerPrices();
            List<Integer> expectedPrices = actualPrices
                    .stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
            Asserts.checkSortingFromHigherToLowerPrice(actualPrices,expectedPrices);
        }
    }
