package com.softserve.rozetka.pages.header;

import com.softserve.rozetka.locators.header_locators.ComparingListModalLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.comparison_page.ComparisonPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparingListModal extends BasePage {
    private WebElement compareLink;
    private  WebElement itemsQuantity;
    private WebElement removeComparingItems;

    public ComparingListModal(WebDriver driver) {
        super(driver);
    }

    public WebElement getCompareLink() {
        if(compareLink == null){
            waitForPresenceOfElement(ComparingListModalLocators.COMPARE_LINK.getPath());
            compareLink = driver.findElement(ComparingListModalLocators.COMPARE_LINK.getPath());
        }
        return compareLink;
    }

    public WebElement getItemsQuantity() {
        if(itemsQuantity == null){
            waitForPresenceOfElement(ComparingListModalLocators.ITEMS_QUANTITY.getPath());
            itemsQuantity = driver.findElement(ComparingListModalLocators.ITEMS_QUANTITY.getPath());
        }
        return itemsQuantity;
    }

    public WebElement getRemoveComparingItems() {
        if(removeComparingItems == null){
            waitForPresenceOfElement(ComparingListModalLocators.REMOVE_COMPARING_ITEMS.getPath());
            removeComparingItems = driver.findElement(ComparingListModalLocators.REMOVE_COMPARING_ITEMS.getPath());
        }
        return removeComparingItems;
    }

    @Step("Click on the compare 'Ноутбуки 2' link")
    public ComparisonPage clickOnCompareLink(){
        getCompareLink().click();
        return new ComparisonPage(driver);
    }
}
