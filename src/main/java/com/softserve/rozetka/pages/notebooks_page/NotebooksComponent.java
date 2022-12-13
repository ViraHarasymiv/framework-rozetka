package com.softserve.rozetka.pages.notebooks_page;

import com.softserve.rozetka.locators.notebooks_page_locators.NotebookComponentLocators;
import com.softserve.rozetka.pages.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class NotebooksComponent extends BasePO {
    private WebElement likeButton;
    private WebElement title;
    private WebElement root;

    public NotebooksComponent(WebDriver driver) {
        super(driver);
    }
    public NotebooksComponent(WebDriver driver, WebElement root) {
        super(driver);
        this.root = root;
    }

    public WebElement getLikeButton() {
        if(likeButton == null) {
            likeButton = this.root.findElement(NotebookComponentLocators.LIKE.getPath());
        }
        return likeButton;
    }

    public WebElement getTitle() {
        if(title == null) {
            title = this.root.findElement(NotebookComponentLocators.TITLE.getPath());
        }
        return title;
    }
    public WebElement getPrice() {
        if(title == null) {
            title = this.root.findElement(NotebookComponentLocators.TITLE.getPath());
        }
        return title;
    }
}
