package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class NotebooksPageElements {
    private static By sortField = By.xpath("//select");
    private static By fromLowerToHigherOption = By.xpath("//option[contains(text(), 'Від дешевих до дорогих')]");
    private static By brandField = By.xpath("//div[@data-filter-name='producer']//input[@type='search']");
    private static By dellCheckBox = By.xpath("//a[@data-id='Dell']");
    private static By anyBrandCheckBox = By.xpath("//rz-filter-section-autocomplete/ul/li/a[@data-id]");

    public static By getSortField(){
        return sortField;
    }
    public static By getFromLowerToHigherOption(){
        return fromLowerToHigherOption;
    }
    public static By getBrandField(){return brandField;}
    public static By getDellCheckBox(){return dellCheckBox;}
    public static By getAnyBrandCheckBox(){return anyBrandCheckBox;}
}
