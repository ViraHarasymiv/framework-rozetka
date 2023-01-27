package com.softserve.rozetka.pages.computersAndNotebooksPage;

import com.softserve.rozetka.pages.basePages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;


public class ComputersAndNotebooksPage extends BasePageWithHeader {
    private static final String URL = "https://rozetka.com.ua/ua/computers-notebooks/c80253/";
    private MenuSection menuSection;
    private СomputerComponents сomputerComponents;

    public ComputersAndNotebooksPage(WebDriver driver) {
        super(driver);
        menuSection = new MenuSection(driver);
        сomputerComponents = new СomputerComponents(driver);
   }

    public MenuSection getMenuSection() {
        waitForUrlContainsText(URL);
        return menuSection;
    }
    public СomputerComponents getСomputerComponents(){
        waitForUrlContainsText(URL);
        return сomputerComponents;}
}
