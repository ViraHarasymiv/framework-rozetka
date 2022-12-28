package com.softserve.rozetka.pages.computers_page;

import com.softserve.rozetka.pages.base_filter_content.BaseFilterContent;
import com.softserve.rozetka.pages.base_pages.ProductsPage;
import com.softserve.rozetka.pages.computer_item_page.ComputerItemPage;
import com.softserve.rozetka.pages.notebook_item_page.NotebookItemPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ComputersPage extends ProductsPage {
    private final static String URL = "https://hard.rozetka.com.ua/ua/computers/c80095/";

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseFilterContent getBaseFilterContent() {
        waitForUrlContainsText(URL);
        waitForPageLoadComplete();
        return super.getBaseFilterContent();
    }

    @Step("Click on the first computer's item in the Computers Page")
    public ComputerItemPage clickOnFirstComputerItem() {
        clickOnFirstProductItem();
        return new ComputerItemPage(driver);
    }
}
