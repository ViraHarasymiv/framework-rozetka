package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.BunnerElements;
import org.openqa.selenium.By;

public interface IcanCloseBunner {
    By bunner = BunnerElements.getBunner();
    By bunnerClose = BunnerElements.getBunnerClose();

    public BasePage closeBunner();
}
