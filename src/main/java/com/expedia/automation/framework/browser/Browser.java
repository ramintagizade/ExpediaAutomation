package com.expedia.automation.framework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public final class Browser {

    private static final String WEBDRIVER_HOME = System.getenv("WEBDRIVER_HOME");
    private static final String DRIVER_NAME = "webdriver.chrome.driver";
    private static Browser instance;
    private WebDriver webDriver;
    private List<WebElement> webElements;

    public Browser() {
        System.setProperty(DRIVER_NAME, WEBDRIVER_HOME);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public static Browser getInstance() {
        if (instance == null) {
            instance = new Browser();
        }
        return instance;
    }

    public void stop() {
        webDriver.close();
    }

    public WebDriver getWrappedDriver() {
        return webDriver;
    }

    public void navigate(String url) {
        webDriver.get(url);
    }

    public void click(By locator) {
        webDriver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        webDriver.findElement(locator).sendKeys(text);
    }

    public String getText(By locator) {
        return webDriver.findElement(locator).getText();
    }

    public List<WebElement> getWebElements(By locator) {
        return webDriver.findElements(locator);
    }
}
