package com.cucu.ElearningAutoTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 2018/1/29.
 */
public class KnowledgePointPage {

    @FindBy(id = "userName")
    public WebElement userNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "submitBtn")
    public  WebElement submitBtn;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/ul/li[5]/a/span")
    public WebElement knowledgePointMenuBtn;

    @FindBy(id = "s_status")
    public WebElement select_status;

    @FindBy(id = "sub_search")
    public WebElement sub_search_btn;

    public void inputUserName(String userName){
        userNameBox.sendKeys(userName);
    }

    public void inputPassword(String password){
        passwordBox.sendKeys(password);
    }

    public void clickLoginBtn(){
        submitBtn.click();
    }

    public void clickKnowledgePointMenuBtn(){
        knowledgePointMenuBtn.click();
    }

    public void clickSubSearchBtn(){
        sub_search_btn.click();
    }
}
