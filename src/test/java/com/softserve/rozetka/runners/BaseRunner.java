package com.softserve.rozetka.runners;

import com.softserve.rozetka.listeners.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.stream.Collectors;

@Listeners({TestListener.class})
public class BaseRunner {
    private static final String ROZETKA_URL = "https://rozetka.com.ua/ua/";
    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ROZETKA_URL);
    }

    @AfterSuite
    public void afterSuite(){
        if(driver != null){
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

    @AfterMethod
    public void closeWindow(){
        afterSuite();
    }

}
