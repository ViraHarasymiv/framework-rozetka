package com.softserve.rozetka.locators.login_page_locators;

import org.openqa.selenium.By;

public class HomePageElements {
    private static By loginToAccountButton = By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[2]/div/button");

    public static By getLoginToAccountButton(){return loginToAccountButton;}
}
