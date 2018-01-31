package com.cucu.ElearningAutoTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 2018/1/29.
 */
public class KnowledgePointPage {

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/ul/li[5]/a/span")
    public WebElement knowledgePointMenuBtn;

    @FindBy(id = "s_status")
    public WebElement select_status;

    @FindBy(id = "sub_search")
    public WebElement sub_search_btn;

    public void clickKnowledgePointMenuBtn(){
        knowledgePointMenuBtn.click();
    }

    public void clickSubSearchBtn(){
        sub_search_btn.click();
    }
}
