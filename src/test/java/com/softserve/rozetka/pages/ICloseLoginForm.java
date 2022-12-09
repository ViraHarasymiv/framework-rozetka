package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.BunnerElements;
import com.softserve.rozetka.locators.RegistrationPageElements;
import org.openqa.selenium.By;

public interface ICloseLoginForm {
    By closeLoginFormButton = RegistrationPageElements.getCloseFormButton();

    BasePage closeLoginForm();
}
