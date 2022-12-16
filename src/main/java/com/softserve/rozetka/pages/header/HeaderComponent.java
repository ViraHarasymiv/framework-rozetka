package com.softserve.rozetka.pages.header;

import com.softserve.rozetka.locators.header_locators.HeaderLocators;
import com.softserve.rozetka.pages.BasePO;
import com.softserve.rozetka.pages.login_component.LoginModal;
import com.softserve.rozetka.pages.login_page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent extends BasePO {
    private WebElement searchInput;
    private WebElement loginButton;
    private WebElement catalogButton;
    private WebElement cartIcon;
    private WebElement productQuantityInCart;
   private CategoriesMenu categoriesMenu;

    public HeaderComponent(WebDriver driver) {
        super(driver);
       categoriesMenu = new CategoriesMenu(driver);
    }
    public WebElement getCatalogButton(){
        if(catalogButton == null){
            waitForPresenceOfElement(HeaderLocators.CATALOG_BUTTON.getPath());
            catalogButton = this.driver.findElement(HeaderLocators.CATALOG_BUTTON.getPath());
        }
        return catalogButton;
    }
    public WebElement getCartIcon() {
        if(cartIcon == null){
            waitForPresenceOfElement(HeaderLocators.CART_ICON.getPath());
            cartIcon = this.driver.findElement(HeaderLocators.CART_ICON.getPath());
        }
        return cartIcon;
    }

    public WebElement getSearchInput() {
        if(searchInput == null){
            waitForPresenceOfElement(HeaderLocators.SEARCH_INPUT.getPath());
            searchInput = this.driver.findElement(HeaderLocators.SEARCH_INPUT.getPath());
        }
        return searchInput;
    }

    public WebElement getProductQuantityInCart() {
        if(productQuantityInCart == null){
            waitForPresenceOfElement(HeaderLocators.PRODUCT_QUANTITY_IN_CART.getPath());
            productQuantityInCart = this.driver.findElement(HeaderLocators.PRODUCT_QUANTITY_IN_CART.getPath());
        }
        return productQuantityInCart;
    }

    public WebElement getLoginButton() {
        if(loginButton == null){
            waitForPresenceOfElement(HeaderLocators.LOGIN_BUTTON.getPath());
            loginButton = this.driver.findElement(HeaderLocators.LOGIN_BUTTON.getPath());
        }
        return loginButton;
    }
    public LoginModal clickOnLoginButton(){
        waitForElementToAppear(getLoginButton()).click();
        return new LoginModal(driver);
    }

    public CategoriesMenu clickOnCatalogButton(){
        waitForElementToAppear(getCatalogButton()).click();
        return categoriesMenu;
    }
    public String getQuantityOfProductsInCart(){
        return getProductQuantityInCart().getText().replaceAll(" ", "");
    }
}
