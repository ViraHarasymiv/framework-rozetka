package com.softserve.rozetka.tests;

import com.softserve.rozetka.pages.HomePage;
import com.softserve.rozetka.pages.NotebooksPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class FilterByPriceTest extends BaseRunner{
    private static final int MIN_RANGE = 5000;
    private static final int MAX_RANGE = 20000;

    @BeforeClass
    public void setPreconditions() {
        setDriver();
        new HomePage(driver)
                .closeBunner()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                .closeBunner()
                .clickOnNotebooksCategory()
                .closeBunner();
    }
    @Test
    public void checkThePriceRange(){
        List<WebElement> allItemsRangedByPrice = new NotebooksPage(driver)
                .scrollToPriceRange()
                .enterMinPrice()
                .enterMaxPrice()
                .clickOnSubmitButton()
                .getItemsRangedByPrice();
        Assert.assertTrue(allItemsRangedByPrice
                .stream()
                .map(web -> web.getText().replaceAll(" ", ""))
                .map(st->Integer.parseInt(st))
                .allMatch(price->price <= MAX_RANGE && price >= MIN_RANGE)
        );
    }
    @AfterClass
    public void closeWindow(){
        afterSuite();
    }
}
