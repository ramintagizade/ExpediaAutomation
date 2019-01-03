package com.expedia.automation.webdrivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {

    private static WebDriver webDriver;
    private static final String WEBDRIVER_HOME = "/Users/ramintaghizada/homebrew/bin/chromedriver";
    private static final String DRIVER_NAME = "webdriver.chrome.driver";

    public ChromeWebDriver() {
        System.setProperty(DRIVER_NAME, WEBDRIVER_HOME);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return webDriver;
    }

    public void open(String url) {
        webDriver.get(url);
    }

    public void close() {
        webDriver.close();
    }

    public String getTitle() {
        return webDriver.getTitle();
    }
}