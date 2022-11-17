package com.softserve.rozetka.tests;

import com.softserve.rozetka.locators.Elements;
import com.softserve.rozetka.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoTest extends BaseTest{

    @Test
    public void checkThatSiteHasLogo(){
       Assert.assertTrue(new HomePage(driver)
               .clickOnLogo(Elements.logo));
    }
}
