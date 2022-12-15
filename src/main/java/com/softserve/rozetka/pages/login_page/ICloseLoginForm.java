package com.softserve.rozetka.pages.login_page;

import com.softserve.rozetka.locators.login_modal_locators.RegistrationPageElements;
import org.openqa.selenium.By;

public interface ICloseLoginForm {
    By closeLoginFormButton = RegistrationPageElements.getCloseFormButton();

    BasePage closeLoginForm();
}
