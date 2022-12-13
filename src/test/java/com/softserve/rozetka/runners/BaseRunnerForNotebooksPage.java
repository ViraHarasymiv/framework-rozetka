package com.softserve.rozetka.runners;

import com.softserve.rozetka.pages.homepage.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseRunnerForNotebooksPage {
    private static final String ROZETKA_URL = "https://rozetka.com.ua/ua/";
    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ROZETKA_URL);
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersCategory()
                .openPage()
                .getMenuSection()
                .clickOnNotebooksMenu();
    }

    @AfterSuite
    public void afterSuite(){
        if(driver != null){
            driver.quit();
        }
    }
    @AfterMethod
    public void closeWindow(){
        afterSuite();
    }
}
