package com.cucu.ElearningAutoTest.steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;
/**
 * Created by Administrator on 2018/1/24.
 */
public class DriverManager {

    private static WebDriver driver;
    static Logger log;

    static {
        log = Logger.getLogger(DriverManager.class);
    }

    public static WebDriver getDriver() {
        if (driver.getWindowHandle() == null) {
            log.info("Thread has no WedDriver, creating new one");
            setWebDriver(driver);
        }
        return driver;
    }

    public static void setWebDriver(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver  = new FirefoxDriver();
    }

    public static String getBrowserInfo(){
        log.debug("Getting browser info");
        Capabilities cap = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
        String b = cap.getBrowserName();
        String os = cap.getPlatform().toString();
        String v = cap.getVersion();
        return String.format("%s v:%s %s", b, v, os);
    }
}