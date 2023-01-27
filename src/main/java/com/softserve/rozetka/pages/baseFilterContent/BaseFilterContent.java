package com.softserve.rozetka.pages.baseFilterContent;

import com.softserve.rozetka.locators.filterContentLocators.FilterContentLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import com.softserve.rozetka.pages.brandProductsPage.BrandProductsPage;
import com.softserve.rozetka.pages.rangedByPriceProductsPage.RangedByPriceProductsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BaseFilterContent extends BasePage {
    private WebElement brandField;
    private List<WebElement> brandCheckBoxes;
    private WebElement minRangeInput;
    private WebElement maxRangeInput;
    private WebElement submitPriceButton;

    public BaseFilterContent(WebDriver driver) {
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

    public List<WebElement> getBrandCheckBoxes() {
        if(brandCheckBoxes == null){
            waitForPresenceOfAllElements(FilterContentLocators.CHECKBOXES.getPath());
            brandCheckBoxes = this.driver.findElements(FilterContentLocators.CHECKBOXES.getPath());
        }
        return brandCheckBoxes;
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


    public WebElement getSubmitPriceButton() {
        if(submitPriceButton == null){
            waitForPresenceOfElement(FilterContentLocators.SUBMIT_PRICE_BUTTON.getPath());
            submitPriceButton = this.driver.findElement(FilterContentLocators.SUBMIT_PRICE_BUTTON.getPath());
        }
        return submitPriceButton;
    }

    @Step("Type a valid brand's name: {0} in the 'Бренд' field")
    public BaseFilterContent enterValidBrand(String validBrandName){
        waitForElementToAppear(getBrandPath());
        Actions actions = new Actions(driver);
        actions.sendKeys(getBrandField(),validBrandName).perform();
        return this;
    }

    @Step("Type an invalid brand's name: {0} in the 'Бренд' field")
    public BaseFilterContent enterInvalidBrand(String invalidBrandName){
        waitForElementToAppear(getBrandPath());
        Actions actions = new Actions(driver);
        actions.sendKeys(getBrandField(),invalidBrandName).perform();
        return this;
    }
    @Step("Pay attention to the brand's checkboxes visibility ")
    public List<WebElement> getBrandsCheckBoxes(){
        waitForElementsToDisappear(getBrandCheckBoxes());
        return this.driver.findElements(FilterContentLocators.CHECKBOXES.getPath());
    }

    @Step("Click on the typed brand's checkbox")
    public BrandProductsPage clickOnBrandsCheckBox(String brand){
        waitForElementsToAppear(getBrandsCheckBoxes());
        WebElement brandCheckBox = getBrandsCheckBoxes()
                .stream()
                .filter(web -> web.getText().toLowerCase().contains(brand))
                .findAny().get();
        waitForElementToAppear(brandCheckBox);
        brandCheckBox.click();
        return new BrandProductsPage(driver);
    }

    @Step("Scroll to the price range inputs and type the minimum price value: {0} in the input field")
    public BaseFilterContent enterMinPrice(String minPriceValue){
        waitForElementToAppear(getMinRangeInputPath());
        Actions actions = new Actions(driver);
        actions.scrollToElement(getMinRangeInput()).perform();
        (getMinRangeInput()).clear();
        getMinRangeInput().sendKeys(minPriceValue);
        return this;
    }

    @Step("Type the maximum price value: {0} in the input field")
    public BaseFilterContent enterMaxPrice(String maxPriceValue){
        getMaxRangeInput().clear();
        getMaxRangeInput().sendKeys(maxPriceValue);
        return this;
    }

    @Step("Click on the 'OK' button")
    public RangedByPriceProductsPage clickOnSubmitButton(){
        waitForElementBecomeClickable(getSubmitPriceButton());
        getSubmitPriceButton().click();
        return new RangedByPriceProductsPage(driver);
    }
}