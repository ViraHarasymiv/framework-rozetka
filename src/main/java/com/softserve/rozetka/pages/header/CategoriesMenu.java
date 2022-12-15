package com.softserve.rozetka.pages.header;

import com.softserve.rozetka.locators.header_locators.MenuCategoriesLocators;
import com.softserve.rozetka.pages.BasePO;
import com.softserve.rozetka.pages.computers_and_notebooks_page.ComputersAndNotebooksPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesMenu extends BasePO {
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

    public ComputersAndNotebooksPage clickOnNotebooksAndComputersCategory(){
      waitForElementToAppear(getNotebooksAndComputersCategory()).click();
        return new ComputersAndNotebooksPage(driver);
    }
}
