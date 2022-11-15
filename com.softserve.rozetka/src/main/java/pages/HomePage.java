package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//img[@alt='Rozetka Logo']")
    private WebElement logo;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogo(){
        return logo.isDisplayed();
    }
}
