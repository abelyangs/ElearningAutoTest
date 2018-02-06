package com.cucu.ElearningAutoTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage {

    @FindBy(xpath = "(//*[@id=\"masthead\"]/button)[2]")
    public static WebElement searchButton;

    @FindBy(xpath = "/html/body/div[1]/div/input")
    public static WebElement searchInput;

    @FindBy(xpath = "/html/body/div[1]/div/ul/li[1]/article/a")
    public static  WebElement searchResultFirst;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/article/header/h1")
    public static  WebElement articleTitle;

    public void clickSearchButton() {
        searchButton.click();
    }

    public void inputSearchWording(String wantedStr){
        searchInput.sendKeys(wantedStr);
    }

    public void clickFirstResultOfSearch() {
        searchResultFirst.click();
    }

    public String getArticleTitle() {
        return articleTitle.getText();
    }
}
