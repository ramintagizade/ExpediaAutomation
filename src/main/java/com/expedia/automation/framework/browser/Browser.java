package com.expedia.automation.framework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public final class Browser {

    private static Browser instance;
    private WebDriver webDriver;

    private Browser() {
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
        try {
            if (instance != null) {
                webDriver.quit();
            }
        } finally {
            instance = null;
        }
    }

    public WebDriver getWrappedDriver() {
        return webDriver;
    }

    public void navigate(String url) {
        webDriver.get(url);
    }

    public void click(By locator) {
        final WebElement element = webDriver.findElement(locator);
        element.click();
    }

    public void type(By locator, String text) {
        final WebElement element = webDriver.findElement(locator);
        element.sendKeys(text);
    }

    public String getText(By locator) {
        final WebElement element = webDriver.findElement(locator);
        return element.getText();
    }

    public void clear(By locator) {
        final WebElement element = webDriver.findElement(locator);
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.BACK_SPACE);
    }
}
