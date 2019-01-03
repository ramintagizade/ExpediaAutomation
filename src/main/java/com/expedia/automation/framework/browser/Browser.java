package com.expedia.automation.framework.browser;

import com.expedia.automation.webdrivers.ChromeWebDriver;
import org.openqa.selenium.By;

public final class Browser {

    private static Browser instance;
    private static ChromeWebDriver chromeWebDriver = new ChromeWebDriver();

    public static Browser getInstance() {
        if(instance==null){
            instance = new Browser();
        }
        return instance;
    }

    public void stop() {
        chromeWebDriver.close();
    }

    public ChromeWebDriver getWrappedDriver() {
        return chromeWebDriver;
    }

    public void navigate(String url) {
        chromeWebDriver.open(url);
    }

}
