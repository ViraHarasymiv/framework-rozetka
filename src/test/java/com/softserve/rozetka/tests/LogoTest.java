package com.softserve.rozetka.tests;

import com.softserve.rozetka.locators.HomePageElements;
import com.softserve.rozetka.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogoTest extends BaseRunner{

    @Test
    public void checkThatSiteHasLogo(){
       Assert.assertTrue(new HomePage(driver)
               .clickOnLogo(HomePageElements.getLogo()));
    }
}
