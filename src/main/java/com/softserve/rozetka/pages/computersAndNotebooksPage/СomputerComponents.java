package com.softserve.rozetka.pages.computersAndNotebooksPage;

import com.softserve.rozetka.locators.computersAndNotebooksPageLocators.ComputerComponentsLocators;
import com.softserve.rozetka.pages.basePages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class СomputerComponents extends ProductsPage {
    private WebElement title;
    private WebElement ssdMenu;

    public СomputerComponents(WebDriver driver) {
        super(driver);
    }

    public WebElement getTitle() {
        if (title == null){
            title = this.driver.findElement(ComputerComponentsLocators.TITLE.getPath());
        }
        return title;
    }

    public WebElement getSsdMenu() {
        if(ssdMenu == null){
            ssdMenu = this.driver.findElement(ComputerComponentsLocators.SSD_MENU.getPath());
        }
        return ssdMenu;
    }
}
