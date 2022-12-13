package com.softserve.rozetka.pages.decreased_by_price_notebooks_page;

import com.softserve.rozetka.pages.BasePageWithHeader;
import com.softserve.rozetka.pages.notebooks_page.NotebooksComponent;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class DecreasedByPriceNotebooksPage extends BasePageWithHeader {
    private List<NotebooksComponent> notebooks;
    public DecreasedByPriceNotebooksPage(WebDriver driver) {
        super(driver);
    }

}
