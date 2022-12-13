package com.softserve.rozetka.pages.computers_and_notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeader;
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

    @Override
    public ComputersAndNotebooksPage openPage() {
        driver.navigate().to(URL);
        return this;
    }

    public MenuSection getMenuSection() {
        return menuSection;
    }
    public СomputerComponents getСomputerComponents(){return сomputerComponents;}
}
