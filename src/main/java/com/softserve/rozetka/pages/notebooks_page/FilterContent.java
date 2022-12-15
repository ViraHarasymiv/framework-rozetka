package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.locators.notebooks_page_locators.FilterContentLocators;
import com.softserve.rozetka.pages.BasePO;
import com.softserve.rozetka.pages.dell_notebooks_page.DellNotebooksPage;
import com.softserve.rozetka.pages.ranged_by_price_notebooks_page.RangedByPriceNotebooksPage;
import com.softserve.rozetka.utils.BrandsOptionsReader;
import com.softserve.rozetka.utils.PricesOptionsReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FilterContent extends BasePO {
    private WebElement brandField;
    private WebElement dellCheckBox;
    private List<WebElement> checkBoxes;
    private WebElement minRangeInput;
    private WebElement maxRangeInput;
    private WebElement submitPriceButton;

    private static final String VALID_BRAND = BrandsOptionsReader.get().getValidBrand();
    private static final String INVALID_BRAND = BrandsOptionsReader.get().getInValidBrand();
    private static final String MIN_PRICE = PricesOptionsReader.get().getMinPriceRange();
    private static final String MAX_PRICE = PricesOptionsReader.get().getMaxPriceRange();

    public FilterContent(WebDriver driver) {
        super(driver);
    }

    public WebElement getBrandField() {
        if(brandField == null){
            brandField = this.driver.findElement(FilterContentLocators.BRAND_FIELD.getPath());
        }
        return brandField;
    }

    public List<WebElement> getCheckBoxes() {
        if(checkBoxes == null){
            checkBoxes = this.driver.findElements(FilterContentLocators.CHECKBOXES.getPath());
        }
        return checkBoxes;
    }

    public WebElement getMinRangeInput() {
        if(minRangeInput == null){
            minRangeInput = this.driver.findElement(FilterContentLocators.MIN_RANGE_INPUT.getPath());
        }
        return minRangeInput;
    }

    public WebElement getMaxRangeInput() {
        if(maxRangeInput == null){
            maxRangeInput = this.driver.findElement(FilterContentLocators.MAX_RANGE_INPUT.getPath());
        }
        return maxRangeInput;
    }

    public WebElement getDellCheckBox() {
        if(dellCheckBox == null){
            dellCheckBox = this.driver.findElement(FilterContentLocators.DELL_CHECK_BOX.getPath());
        }
        return dellCheckBox;
    }

    public WebElement getSubmitPriceButton() {
        if(submitPriceButton == null){
            submitPriceButton = this.driver.findElement(FilterContentLocators.SUBMIT_PRICE_BUTTON.getPath());
        }
        return submitPriceButton;
    }
    public FilterContent enterValidBrand(){
        waitForElementToAppear(getBrandField());
        Actions actions = new Actions(driver);
        actions.sendKeys(getBrandField(),VALID_BRAND).perform();
        return this;
    }

    public List<WebElement> enterInvalidBrand(){
        waitForElementToAppear(getBrandField());
        Actions actions = new Actions(driver);
        actions.sendKeys(getBrandField(),INVALID_BRAND).perform();
        waitForElementsToDisappear(getCheckBoxes());
        return this.driver.findElements(FilterContentLocators.CHECKBOXES.getPath());
    }

    public DellNotebooksPage clickOnBrandsCheckBox(){
        waitForElementToAppear(getDellCheckBox()).click();
        return new DellNotebooksPage(driver);
    }

    public FilterContent enterMinPrice(){
        Actions actions = new Actions(driver);
        waitForElementToAppear(getMinRangeInput());
        actions.scrollToElement(getMinRangeInput()).perform();
        (getMinRangeInput()).clear();
        getMinRangeInput().sendKeys(MIN_PRICE);
        return this;
    }
    public FilterContent enterMaxPrice(){
       getMaxRangeInput().clear();
       getMaxRangeInput().sendKeys(MAX_PRICE);
       return this;
    }
    public RangedByPriceNotebooksPage clickOnSubmitButton(){
        waitForElementBecomeClickable(getSubmitPriceButton()).click();
        return new RangedByPriceNotebooksPage(driver);
    }
}
