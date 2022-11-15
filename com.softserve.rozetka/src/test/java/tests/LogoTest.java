package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LogoTest extends BaseTest{

    @Test
    public void checkThatSiteHasLogo(){
       Assert.assertTrue(new HomePage(driver).hasLogo());
    }
}
