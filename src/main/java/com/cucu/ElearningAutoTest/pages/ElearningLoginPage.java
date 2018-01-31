package com.cucu.ElearningAutoTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 2018/1/31.
 */
public class ElearningLoginPage {

    @FindBy(id = "userName")
    public static WebElement userNameBox;

    @FindBy(id = "password")
    public static WebElement passwordBox;

    @FindBy(id = "submitBtn")
    public static WebElement submitBtn;

    @FindBy(xpath = "//span[text()='E-learning']")
    public static  WebElement elearningLogo;

    public static By by_elearningLogo = By.xpath("//span[text()='E-learning']");

    public void inputUserName(String userName){
        userNameBox.sendKeys(userName);
    }

    public void inputPassword(String password){
        passwordBox.sendKeys(password);
    }

    public void clickLoginBtn(){
        submitBtn.click();
    }

}
