package com.softserve.rozetka.pages.increased_by_price_notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeader;
import com.softserve.rozetka.pages.notebooks_page.NotebooksComponent;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class IncreasedByPriceNotebooksPage extends BasePageWithHeader {
    private List<NotebooksComponent> notebooks;

    public IncreasedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

    public List<NotebooksComponent> getNotebooks() {
        return notebooks;
    }
}
