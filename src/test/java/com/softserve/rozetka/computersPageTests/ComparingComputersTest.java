package com.softserve.rozetka.computersPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.computersPage.ComputersPage;
import com.softserve.rozetka.pages.sections.header.header.Header;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

/**
 * This class contains computers comparing related tests.
 *
 * @author Vira Harasymiv
 *
 */
@Feature("Comparing computers in the Computers Page")
public class ComparingComputersTest extends BaseRunner {

    @BeforeMethod
    public void beforeEveryTestGoToComputersPage() {
        setDriver();
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                .getMenuSection()
                .clickOnComputersNettopsMonoblocksMenu();
    }

    @Test(priority = 1)
    @Description("Verify if a user can compare two computers")
    @Severity(SeverityLevel.NORMAL)
    @Link(name="Link to the Computers Page", url = "https://hard.rozetka.com.ua/ua/computers/c80095/")
    public void checkTwoComputersComparing() {
        String firstProductTitle = new ComputersPage(driver)
                .getFirstProductToCompare();
        String secondProductTitle = new ComputersPage(driver)
                .getSecondProductToCompare();
        List<String> actualResults = new Header(driver)
                .clickOnCompareIcon()
                .clickOnCompareLink()
                .getProductSection()
                .getCompareItem()
                .getStringProductTitles();
        Asserts.checkTwoItemsComparing(firstProductTitle,secondProductTitle,actualResults);
    }
}
