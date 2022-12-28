package com.softserve.rozetka.pages.computers_and_notebooks_page;

import com.softserve.rozetka.locators.computers_and_notebooks_page_locators.MenuSectionLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.computers_page.ComputersPage;
import com.softserve.rozetka.pages.notebooks_page.NotebooksPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuSection extends BasePage {
    private WebElement notebooksMenu;
    private WebElement computersNettopsMonoblocksMenu;
    private WebElement monitorsMenu;
    private WebElement gamingMenu;
    private WebElement tabletsMenu;
    private WebElement cablesAndAdaptersMenu;
    protected СomputerComponents сomputerComponents;

    public MenuSection(WebDriver driver) {
        super(driver);
        сomputerComponents = new СomputerComponents(driver);
    }
    public WebElement getNotebooksMenu(){
        if(notebooksMenu == null){
            waitForPresenceOfElement(MenuSectionLocators.NOTEBOOKS_MENU.getPath());
            notebooksMenu = this.driver.findElement(MenuSectionLocators.NOTEBOOKS_MENU.getPath());
        }
        return notebooksMenu;
    }

    public WebElement getComputersNettopsMonoblocksMenu() {
        if(computersNettopsMonoblocksMenu == null){
            waitForPresenceOfElement(MenuSectionLocators.COMPUTERS_NETTOPS_MONOBLOCKS_MENU.getPath());
            computersNettopsMonoblocksMenu = this.driver.findElement(MenuSectionLocators.COMPUTERS_NETTOPS_MONOBLOCKS_MENU.getPath());
        }
        return computersNettopsMonoblocksMenu;
    }

    public WebElement getMonitorsMenu() {
        if(monitorsMenu == null){
            waitForPresenceOfElement(MenuSectionLocators.MONITORS_MENU.getPath());
            monitorsMenu = this.driver.findElement(MenuSectionLocators.MONITORS_MENU.getPath());
        }
        return monitorsMenu;
    }

    public WebElement getGamingMenu() {
        if(gamingMenu == null){
            waitForPresenceOfElement(MenuSectionLocators.GAMING_MENU.getPath());
            gamingMenu = this.driver.findElement(MenuSectionLocators.GAMING_MENU.getPath());
        }
        return gamingMenu;
    }

    public WebElement getTabletsMenu() {
        if(tabletsMenu == null){
            waitForPresenceOfElement(MenuSectionLocators.TABLETS_MENU.getPath());
            tabletsMenu = this.driver.findElement(MenuSectionLocators.TABLETS_MENU.getPath());
        }
        return tabletsMenu;
    }

    public WebElement getCablesAndAdaptersMenu() {
        if(cablesAndAdaptersMenu == null){
            waitForPresenceOfElement(MenuSectionLocators.CABLES_AND_ADAPTERS_MENU.getPath());
            cablesAndAdaptersMenu = this.driver.findElement(MenuSectionLocators.CABLES_AND_ADAPTERS_MENU.getPath());
        }
        return cablesAndAdaptersMenu;
    }

    @Step(value = "Click on the 'Ноутбуки' category")
    public NotebooksPage clickOnNotebooksMenu()  {
        getNotebooksMenu().click();
        return new NotebooksPage(driver);
    }

    @Step(value = "Click on the 'Комп'ютери, неттопи, моноблоки' category")
    public ComputersPage clickOnComputersNettopsMonoblocksMenu(){
        getComputersNettopsMonoblocksMenu().click();
        return new ComputersPage(driver);
    }
}