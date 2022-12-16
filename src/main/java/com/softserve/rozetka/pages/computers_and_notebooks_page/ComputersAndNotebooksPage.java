package com.softserve.rozetka.pages.computers_and_notebooks_page;

import com.softserve.rozetka.pages.base_pages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;


public class ComputersAndNotebooksPage extends BasePageWithHeader{
    private static final String URL = "https://rozetka.com.ua/ua/computers-notebooks/c80253/";
    private MenuSection menuSection;
    private СomputerComponents сomputerComponents;

    public ComputersAndNotebooksPage(WebDriver driver) {
        super(driver);
        menuSection = new MenuSection(driver);
        сomputerComponents = new СomputerComponents(driver);
   }

    public MenuSection getMenuSection() {
        waitForUrlToBe(URL);
        return menuSection;
    }
    public СomputerComponents getСomputerComponents(){
        waitForUrlToBe(URL);
        return сomputerComponents;}
}
