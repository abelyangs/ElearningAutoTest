package com.cucu.ElearningAutoTest.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.Assert;

/**
 * Created by Administrator on 2018/1/24.
 */
public class DriverManager {

    private static volatile WebDriver ydriver;

    public static WebDriver getCurrentDriver () throws InterruptedException {
        if (DriverManager.ydriver == null) {
            try {
                createWebDriver();
            } catch (Exception e) {
                try{
                    Thread.sleep(5000);
                    System.out.println("second.....");
                    createWebDriver();
                }catch (Exception e2) {
                    e2.printStackTrace();
                    System.out.println("fail.....");
                    Assert.fail();
                }finally {
                    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                        public void run () { close(); }
                    }));
                }
        }finally{
                Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                    public void run () { close(); }
                }));
            }
        }
        return DriverManager.ydriver;
    }

    public static void createWebDriver () {
        DriverManager.ydriver = new FirefoxDriver();
    }

    public static void close () {
        try {
            if(DriverManager.ydriver != null) {
                DriverManager.ydriver.close();
                System.out.println("success");
                DriverManager.ydriver.quit();
                DriverManager.ydriver = null;
            }
        }catch (UnreachableBrowserException e) {
            e.printStackTrace();
        }
    }

}