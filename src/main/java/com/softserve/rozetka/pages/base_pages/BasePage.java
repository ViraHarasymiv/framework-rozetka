package com.softserve.rozetka.pages.base_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BasePage {
    private static final int TIME = 60000;
    private static final int POLLING_TIME = 5;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME));
    }

    protected WebElement waitForElementToAppear(By locator){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitForElementToAppear(WebElement element){
        return  wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected void waitForPresenceOfElement(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    protected void waitForPresenceOfAllElements(By locator){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    protected void waitForElementsToAppear(List<WebElement>elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
    protected void waitForElementsToDisappear(List<WebElement>elements){
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }
    protected WebElement waitForElementBecomeClickable(WebElement element){
        return wait
                .withTimeout(Duration.ofSeconds(TIME))
                .pollingEvery(Duration.ofSeconds(POLLING_TIME))
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void waitForUrlContainsText(String UrlText){
        wait.until(ExpectedConditions.urlContains(UrlText));
    }

    public void waitForPageLoadComplete() {
        new WebDriverWait(driver, Duration.ofSeconds(TIME)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
    protected void waitForTextToBePresent(WebElement element, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}