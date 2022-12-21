package com.softserve.rozetka.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElement {
    private WebElement element;

    public BaseElement(WebDriver driver, By path) {
        element = driver.findElement(path);
        }

        public BaseElement(WebElement element) {
            element = element;
        }

        public void click() {
            element.click();
        }
    }

