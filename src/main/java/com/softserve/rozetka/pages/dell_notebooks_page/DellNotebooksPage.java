package com.softserve.rozetka.pages.dell_notebooks_page;

import com.softserve.rozetka.locators.notebooks_page_locators.NotebookComponentLocators;
import com.softserve.rozetka.pages.BasePageWithHeader;
import com.softserve.rozetka.pages.notebooks_page.NotebooksComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DellNotebooksPage extends BasePageWithHeader {
    private List<NotebooksComponent> items;

    public DellNotebooksPage(WebDriver driver) {
        super(driver);
    }

    public List<NotebooksComponent> getTitles() {
        items = new ArrayList<>();
        List<WebElement> elements = driver.findElements(NotebookComponentLocators.TITLE.getPath());
        for (WebElement webElement: elements){
            items.add(new NotebooksComponent(driver,webElement));
        }
        return items;
    }
}

