package com.softserve.rozetka.pages.header;

import com.softserve.rozetka.locators.header_locators.HeaderLocators;
import com.softserve.rozetka.pages.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent extends BasePO {
    private WebElement searchInput;
    private WebElement loginButton;
    private WebElement catalogButton;
    private WebElement cartIcon;
   private CategoriesMenu categoriesMenu;

    public HeaderComponent(WebDriver driver) {
        super(driver);
       categoriesMenu = new CategoriesMenu(driver);
    }
    public WebElement getCatalogButton(){
        if(catalogButton == null){
            catalogButton = this.driver.findElement(HeaderLocators.CATALOG_BUTTON.getPath());
        }
        return catalogButton;
    }
    public WebElement getCartIcon() {
        if(cartIcon == null){
            cartIcon = this.driver.findElement(HeaderLocators.CART_ICON.getPath());
        }
        return cartIcon;
    }

    public WebElement getSearchInput() {
        if(searchInput == null){
            searchInput = this.driver.findElement(HeaderLocators.SEARCH_INPUT.getPath());
        }
        return searchInput;
    }

    public WebElement getLoginButton() {
        if(loginButton == null){
            loginButton = this.driver.findElement(HeaderLocators.LOGIN_BUTTON.getPath());
        }
        return loginButton;
    }

    public CategoriesMenu clickOnCatalogButton(){
        waitForElementToAppear(getCatalogButton());
        getCatalogButton().click();
        return categoriesMenu;
    }
}
