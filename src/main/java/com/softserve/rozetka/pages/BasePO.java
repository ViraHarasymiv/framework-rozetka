package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePO {
    private static final int TIME = 5000;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePO(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME));
    }

    protected void waitForElementToAppear(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected void waitForElementsToAppear(List<WebElement>elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
    protected void waitForElementsToDisappear(List<WebElement> elements){
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }
    protected void waitForElementBecomeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void waitForUrlToBe(String url){
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void waitForPageLoadComplete() {
        wait.until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}

