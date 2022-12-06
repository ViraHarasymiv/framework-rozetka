package com.softserve.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    private static final int TIME = 100;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME));
    }

    protected void waitForElementToAppear(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void waitForElementsToAppear(By locator){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    protected void waitForElementsToDisappear(List<WebElement> elements){
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }
    protected void waitForElementBecomeClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    protected void waitForUrlToBe(String url){
        wait.until(ExpectedConditions.urlToBe(url));
    }

    protected void waitForElementToBeClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
