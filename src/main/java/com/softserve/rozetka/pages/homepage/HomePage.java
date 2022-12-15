package com.softserve.rozetka.pages.homepage;

import com.softserve.rozetka.pages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageWithHeader {
    private final static String URL = "https://rozetka.com.ua/ua/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
