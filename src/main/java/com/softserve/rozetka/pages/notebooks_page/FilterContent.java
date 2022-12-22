package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.locators.notebooks_page_locators.FilterContentLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.dell_notebooks_page.DellNotebooksPage;
import com.softserve.rozetka.pages.ranged_by_price_notebooks_page.RangedByPriceNotebooksPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FilterContent extends BasePage {
    private WebElement brandField;
    private WebElement dellCheckBox;
    private List<WebElement> checkBoxes;
    private WebElement minRangeInput;
    private WebElement maxRangeInput;
    private WebElement submitPriceButton;

    public FilterContent(WebDriver driver) {
        super(driver);
    }

    public By getBrandPath(){
        return FilterContentLocators.BRAND_FIELD.getPath();
    }
    public WebElement getBrandField() {
        if(brandField == null){
            waitForPresenceOfElement(getBrandPath());
            brandField = this.driver.findElement(getBrandPath());
        }
        return brandField;
    }

    public List<WebElement> getCheckBoxes() {
        if(checkBoxes == null){
            waitForPresenceOfAllElements(FilterContentLocators.CHECKBOXES.getPath());
            checkBoxes = this.driver.findElements(FilterContentLocators.CHECKBOXES.getPath());
        }
        return checkBoxes;
    }
    public By getMinRangeInputPath(){
        return FilterContentLocators.MIN_RANGE_INPUT.getPath();
    }

    public WebElement getMinRangeInput() {
        if(minRangeInput == null){
            waitForPresenceOfElement(getMinRangeInputPath());
            minRangeInput = this.driver.findElement(getMinRangeInputPath());
        }
        return minRangeInput;
    }

    public WebElement getMaxRangeInput() {
        if(maxRangeInput == null){
            waitForPresenceOfElement(FilterContentLocators.MAX_RANGE_INPUT.getPath());
            maxRangeInput = this.driver.findElement(FilterContentLocators.MAX_RANGE_INPUT.getPath());
        }
        return maxRangeInput;
    }

    public WebElement getDellCheckBox() {
        if(dellCheckBox == null){
            waitForPresenceOfElement(FilterContentLocators.DELL_CHECK_BOX.getPath());
            dellCheckBox = this.driver.findElement(FilterContentLocators.DELL_CHECK_BOX.getPath());
        }
        return dellCheckBox;
    }

    public WebElement getSubmitPriceButton() {
        if(submitPriceButton == null){
            waitForPresenceOfElement(FilterContentLocators.SUBMIT_PRICE_BUTTON.getPath());
            submitPriceButton = this.driver.findElement(FilterContentLocators.SUBMIT_PRICE_BUTTON.getPath());
        }
        return submitPriceButton;
    }

    @Step("Type a valid brand's name: {0} in the 'Бренд' field")
    public FilterContent enterValidBrand(String validBrandName){
        waitForElementToAppear(getBrandPath());
        Actions actions = new Actions(driver);
        actions.sendKeys(getBrandField(),validBrandName).perform();
        return this;
    }

    @Step("Type an invalid brand's name: {0} in the 'Бренд' field")
    public FilterContent enterInvalidBrand(String invalidBrandName){
        waitForElementToAppear(getBrandPath());
        Actions actions = new Actions(driver);
        actions.sendKeys(getBrandField(),invalidBrandName).perform();
        return this;
    }
    @Step("Pay attention to the brand's checkboxes visibility ")
    public List<WebElement> getBrandsCheckBoxes(){
        waitForElementsToDisappear(getCheckBoxes());
        return this.driver.findElements(FilterContentLocators.CHECKBOXES.getPath());
    }

    @Step("Click on the typed brand's checkbox")
    public DellNotebooksPage clickOnBrandsCheckBox(){
        waitForElementToAppear(getDellCheckBox());
        getDellCheckBox().click();
        return new DellNotebooksPage(driver);
    }

    @Step("Scroll to the price range inputs and type the minimum price value: {0} in the input field")
    public FilterContent enterMinPrice(String minPriceValue){
        waitForElementToAppear(getMinRangeInputPath());
        Actions actions = new Actions(driver);
        actions.scrollToElement(getMinRangeInput()).perform();
        (getMinRangeInput()).clear();
        getMinRangeInput().sendKeys(minPriceValue);
        return this;
    }

    @Step("Type the maximum price value: {0} in the input field")
    public FilterContent enterMaxPrice(String maxPriceValue){
        getMaxRangeInput().clear();
        getMaxRangeInput().sendKeys(maxPriceValue);
        return this;
    }

    @Step("Click on the 'OK' button")
    public RangedByPriceNotebooksPage clickOnSubmitButton(){
        waitForElementBecomeClickable(getSubmitPriceButton());
        getSubmitPriceButton().click();
        return new RangedByPriceNotebooksPage(driver);
    }
}