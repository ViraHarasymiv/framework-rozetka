package com.softserve.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;


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
        return wait.withMessage("Could not find the element")
                .pollingEvery(Duration.ofSeconds(POLLING_TIME))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }
    protected void waitForElementsToAppear(List<WebElement>elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
    protected void waitForElementsToDisappear(List<WebElement> elements){
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }
    protected WebElement waitForElementBecomeClickable(WebElement element){
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void waitForUrlToBe(String URL){
        wait.until(ExpectedConditions.urlToBe(URL));
    }

}

