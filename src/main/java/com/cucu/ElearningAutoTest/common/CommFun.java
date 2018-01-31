package com.cucu.ElearningAutoTest.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/31.
 */
public class CommFun {

    public static void ImplicitWait (WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//设置全局等待5秒
    }

    public static void ExplicitWait (WebDriver driver, WebElement element) {
        new WebDriverWait(driver,15).until(ExpectedConditions.alertIsPresent());
    }

    //    Waits for specified elements to not appear.
    public static void waitElementNotAppear (WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

//    Waits for specified elements to appear.
    public static void waitElementAppear (WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitElementClickable (WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
