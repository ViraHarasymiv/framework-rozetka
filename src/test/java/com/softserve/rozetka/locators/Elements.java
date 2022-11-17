package com.softserve.rozetka.locators;

import org.openqa.selenium.By;

public class Elements {
    private static By logo = By.xpath("//img[@alt='Rozetka Logo']");

    public static By getLogo(){
        return logo;
    }
}
