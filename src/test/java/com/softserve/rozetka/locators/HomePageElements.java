package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class HomePageElements {
    private static By catalogButton = By.xpath("//button[contains(text(), 'Каталог')]");
    private static By notebooksAndComputersCategory = By.xpath("//li[contains(@class, 'menu-categories__item m')]/a[contains(@href, 'c80253/')]");
    private static By loginToAccountButton = By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[2]/div/button");

    public static By getCatalogButton(){return catalogButton;}
    public static By getNotebooksAndComputersCategory(){return notebooksAndComputersCategory;}
    public static By getLoginToAccountButton(){return loginToAccountButton;}
}
