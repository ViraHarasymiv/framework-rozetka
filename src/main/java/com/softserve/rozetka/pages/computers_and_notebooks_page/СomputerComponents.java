package com.softserve.rozetka.pages.computers_and_notebooks_page;

import com.softserve.rozetka.locators.computers_and_notebooks_page_locators.ComputerComponentsLocators;
import com.softserve.rozetka.pages.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class СomputerComponents extends BasePO {
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
