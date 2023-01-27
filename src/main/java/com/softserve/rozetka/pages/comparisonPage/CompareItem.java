package com.softserve.rozetka.pages.comparisonPage;

import com.softserve.rozetka.locators.comparasionPageLocators.ComparisonPageLocators;
import com.softserve.rozetka.pages.basePages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class CompareItem extends BasePage {
    private List<WebElement> productTitles;

    public CompareItem(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getProductTitles() {
        if(productTitles == null){
            waitForPresenceOfAllElements(ComparisonPageLocators.PRODUCT_TITLES.getPath());
            productTitles = driver.findElements(ComparisonPageLocators.PRODUCT_TITLES.getPath());
        }
        return productTitles;
    }

    @Step("Pay attention to the notebooks titles ")
    public List<String> getStringProductTitles(){
        return  getProductTitles()
                .stream()
                .map(element -> element.getText().toLowerCase())
                .collect(Collectors.toList());
    }
}
