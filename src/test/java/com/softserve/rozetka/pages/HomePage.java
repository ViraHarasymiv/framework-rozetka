package com.softserve.rozetka.pages;

import com.softserve.rozetka.locators.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage implements ICanCloseBunner {
    private By catalogButton = HomePageElements.getCatalogButton();
    private By notebooksAndComputersCategory = HomePageElements.getNotebooksAndComputersCategory();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnCatalogButton(){
        driver.findElement(catalogButton).click();
        return this;
    }

    public NotebooksAndComputersPage clickOnNotebooksAndComputersCategory(){
        waitForElementToAppear(notebooksAndComputersCategory);
        driver.findElement(notebooksAndComputersCategory).click();
        return new NotebooksAndComputersPage(driver);
    }
    public LoginPage clickOnLoginButton(By loginBtn){
        waitForElementToAppear(loginBtn);
        driver.findElement(loginBtn).click();
        return new LoginPage(driver);
    }

    @Override
    public HomePage closeBunner() {
        if (driver.findElements(bunner).size() !=0 ){
            driver.findElement(bunnerClose).click();
        }
        return this;
    }
    }

