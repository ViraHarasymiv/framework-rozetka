package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.banner_locators.BannerLocators;
import com.softserve.rozetka.locators.product_items_locators.ProductItemsLocators;
import com.softserve.rozetka.pages.product_item.ProductItem;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class BasePO {
    private static final int TIME = 10000;
    private static final int POLLING_TIME = 3;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePO(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME));
    }

    protected WebElement waitForElementToAppear(WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(TIME))
                .pollingEvery(Duration.ofSeconds(POLLING_TIME))
                .ignoring(NoSuchElementException.class);
         return  wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected void waitForPresenceOfElement(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void waitForElementsToAppear(List<WebElement>elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
    protected void waitForElementsToDisappear(List<WebElement>elements){
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }
    protected WebElement waitForElementBecomeClickable(WebElement element){
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void waitForUrlToBe(String URL){
        wait.until(ExpectedConditions.urlToBe(URL));
    }

}

