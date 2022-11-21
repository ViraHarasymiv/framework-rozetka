package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class HomePageElements {
    private static By logo = By.xpath("//img[@alt='Rozetka Logo']");
    private static By catalogButton = By.xpath("//button[contains(text(), 'Каталог')]");
    private static By notebooksAndComputersCategory = By.xpath("//li[contains(@class, 'menu-categories__item m')]/a[contains(@href, 'c80253/')]");

    public static By getLogo(){
        return logo;
    }
    public static By getCatalogButton(){return catalogButton;}
    public static By getNotebooksAndComputersCategory(){return notebooksAndComputersCategory;}
}
