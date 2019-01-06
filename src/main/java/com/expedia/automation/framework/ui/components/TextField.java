package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextField {

    private By locator;
    private WebDriverWait wait;

    public TextField(By locator) {
        final int timeOutInSeconds = 5;
        this.wait = new WebDriverWait(Browser.getInstance().getWrappedDriver(), timeOutInSeconds);
        this.locator = locator;
    }

    public void type(String text) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Browser.getInstance().type(locator, text);
    }
}
