package com.softserve.rozetka.pages.header;

import com.softserve.rozetka.locators.header_locators.HeaderLocators;
import com.softserve.rozetka.pages.base_pages.BasePage;
import com.softserve.rozetka.pages.login_component.LoginModal;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent extends BasePage {
    private WebElement searchInput;
    private WebElement loginButton;
    private WebElement catalogButton;
    private WebElement cartIcon;
    private WebElement compareIcon;
    private WebElement productQuantityInCart;
    private CategoriesMenu categoriesMenu;
    private ComparingListModal comparingListModal;

    public HeaderComponent(WebDriver driver) {
        super(driver);
        categoriesMenu = new CategoriesMenu(driver);
        comparingListModal = new ComparingListModal(driver);
    }

    public WebElement getCatalogButton() {
        if (catalogButton == null) {
            waitForPresenceOfElement(HeaderLocators.CATALOG_BUTTON.getPath());
            catalogButton = this.driver.findElement(HeaderLocators.CATALOG_BUTTON.getPath());
        }
        return catalogButton;
    }

    public WebElement getCartIcon() {
        if (cartIcon == null) {
            waitForPresenceOfElement(HeaderLocators.CART_ICON.getPath());
            cartIcon = this.driver.findElement(HeaderLocators.CART_ICON.getPath());
        }
        return cartIcon;
    }

    public WebElement getSearchInput() {
        if (searchInput == null) {
            waitForPresenceOfElement(HeaderLocators.SEARCH_INPUT.getPath());
            searchInput = this.driver.findElement(HeaderLocators.SEARCH_INPUT.getPath());
        }
        return searchInput;
    }


    public WebElement getProductQuantityInCart() {
        if (productQuantityInCart == null) {
            waitForPresenceOfElement(HeaderLocators.PRODUCT_QUANTITY_IN_CART.getPath());
            productQuantityInCart = this.driver.findElement(HeaderLocators.PRODUCT_QUANTITY_IN_CART.getPath());
        }
        return productQuantityInCart;
    }

    public WebElement getLoginButton() {
        if (loginButton == null) {
            waitForPresenceOfElement(HeaderLocators.LOGIN_BUTTON.getPath());
            loginButton = this.driver.findElement(HeaderLocators.LOGIN_BUTTON.getPath());
        }
        return loginButton;
    }

    public WebElement getCompareIcon() {
        if (compareIcon == null) {
            waitForPresenceOfElement(HeaderLocators.COMPARE_ICON.getPath());
            compareIcon = this.driver.findElement(HeaderLocators.COMPARE_ICON.getPath());
        }
        return compareIcon;
    }

    public CategoriesMenu getCategoriesMenu() {
        return categoriesMenu;
    }

    public ComparingListModal getComparingListModal() {
        return comparingListModal;
    }

    public LoginModal clickOnLoginButton() {
        waitForElementToAppear(getLoginButton()).click();
        return new LoginModal(driver);
    }

    @Step("Click on the compare icon in the page header")
    public ComparingListModal clickOnCompareIcon(){
        waitForElementToAppear(getCompareIcon()).click();
        return getComparingListModal();
    }

    @Step("Click on the 'Каталог' button")
    public CategoriesMenu clickOnCatalogButton() {
        waitForElementToAppear(getCatalogButton()).click();
        return getCategoriesMenu();
    }

    @Step("Pay attention to the product's quantity in the cart")
    public String getQuantityOfProductsInCart() {
        return getProductQuantityInCart().getText().replaceAll(" ", "");
    }
}