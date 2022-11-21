package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class NotebooksAndComputersPageElements {
    private static By notebooksCategory = By.xpath("//a[contains(@class, 'tile-cats__h')][@title='Ноутбуки']");

    public static By getNotebooksCategory(){
        return notebooksCategory;
    }
}
