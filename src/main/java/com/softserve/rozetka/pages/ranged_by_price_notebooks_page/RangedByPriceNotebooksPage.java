package com.softserve.rozetka.pages.ranged_by_price_notebooks_page;

import com.softserve.rozetka.locators.notebooks_page_locators.NotebookComponentLocators;
import com.softserve.rozetka.pages.BasePageWithHeader;
import com.softserve.rozetka.pages.notebooks_page.NotebooksComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RangedByPriceNotebooksPage extends BasePageWithHeader {
    private List<NotebooksComponent> items;

    public RangedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

    public List<NotebooksComponent> getPrices() {
        items = new ArrayList<>();
        List<WebElement> elements = driver.findElements(NotebookComponentLocators.PRICE.getPath());
        for (WebElement webElement: elements){
            items.add(new NotebooksComponent(driver,webElement));
        }
        return items;
    }

}
