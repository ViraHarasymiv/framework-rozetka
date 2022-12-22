package com.softserve.rozetka.notebooks_page_tests;

import com.softserve.rozetka.pages.header.HeaderComponent;
import com.softserve.rozetka.pages.homepage.HomePage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

/**
 * This class contains notebooks comparing related tests.
 *
 * @author Vira Harasymiv
 *
 */
@Feature("Comparing notebooks")
public class ComparingNotebooksTest extends BaseRunner {

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
    @Description("Verify if a user can compare two notebooks")
    @Severity(SeverityLevel.NORMAL)
    public void checkTwoNotebooksComparing() {
    String firstProductTitle = new NotebooksPage(driver)
                .getFirstProductToCompare();
    String secondProductTitle = new NotebooksPage(driver)
            .getSecondProductToCompare();
    List<String> actualResults = new HeaderComponent(driver)
            .clickOnCompareIcon()
            .clickOnCompareLink()
            .getProductSection()
            .getCompareItem()
            .getStringProductTitles();
    Assert.assertTrue(firstProductTitle.equals(actualResults.get(1)) &&
            secondProductTitle.equals(actualResults.get(0)));
    }
}
