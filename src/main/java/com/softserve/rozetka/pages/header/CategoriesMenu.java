package com.softserve.rozetka.pages.header;

import com.softserve.rozetka.locators.headerLocators.MenuCategoriesLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import com.softserve.rozetka.pages.computersAndNotebooksPage.ComputersAndNotebooksPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesMenu extends BasePage {
    private WebElement notebooksAndComputersCategory;

    public CategoriesMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getNotebooksAndComputersCategory() {
        if(notebooksAndComputersCategory == null){
            waitForPresenceOfElement(MenuCategoriesLocators.NOTEBOOKS_AND_COMPUTERS_CATEGORY.getPath());
            notebooksAndComputersCategory = this.driver.findElement(MenuCategoriesLocators.NOTEBOOKS_AND_COMPUTERS_CATEGORY.getPath());
        }
        return notebooksAndComputersCategory;
    }

    @Step(value = "Click on the 'Ноутбуки та комп'ютери' menu")
    public ComputersAndNotebooksPage clickOnNotebooksAndComputersCategory(){
        waitForElementToAppear(getNotebooksAndComputersCategory()).click();
        return new ComputersAndNotebooksPage(driver);
    }
}