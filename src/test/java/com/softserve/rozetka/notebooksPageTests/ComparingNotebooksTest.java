package com.softserve.rozetka.notebooksPageTests;

import com.softserve.rozetka.asserts.Asserts;
import com.softserve.rozetka.pages.header.HeaderComponent;
import com.softserve.rozetka.pages.homePage.HomePage;
import com.softserve.rozetka.pages.notebooksPage.NotebooksPage;
import com.softserve.rozetka.runners.BaseRunner;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * This class contains notebooks comparing related tests.
 *
 * @author Vira Harasymiv
 */
@Feature("Comparing notebooks in the Notebooks Page")
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
    @Issue("36")
    @Link(name = "Link to the Notebooks Page", url = "https://rozetka.com.ua/ua/notebooks/c80004/")
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
        Asserts.checkTwoItemsComparing(firstProductTitle, secondProductTitle, actualResults);
    }
}
