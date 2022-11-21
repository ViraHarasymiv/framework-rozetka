package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class NotebooksPageElements {
    private static By sortField = By.xpath("//select");
    private static By fromLowerToHigherOption = By.xpath("//option[contains(text(), 'Від дешевих до дорогих')]");
    private static By fromHigherToLowerOption = By.xpath("//option[contains(text(), 'Від дорогих до дешевих')]");

    public static By getSortField(){
        return sortField;
    }
    public static By getFromLowerToHigherOption(){
        return fromLowerToHigherOption;
    }
    public static By getFromHigherToLowerOption(){
        return fromHigherToLowerOption;
    }
}
