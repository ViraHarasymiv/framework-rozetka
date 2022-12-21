package com.softserve.rozetka.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputElement extends BaseElement{
    private WebElement element;

    public InputElement(WebDriver driver, By path) {
        super(driver, path);
    }

    public InputElement(WebElement element) {
        super(element);
    }

    public String getLabel() {
        return element.findElement(By.xpath("..//form__label")).getText();
    }

    public String getErrorMessage() {
        return element.findElement(By.xpath("..//p")).getText();
    }

    public InputElement sendKeys(String keys) {
        element.sendKeys(keys);
        return this;
    }
}
