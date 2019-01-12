package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Label {

    private static Browser browserInstance = Browser.getInstance();
    private By locator;
    private WebDriverWait wait;

    public Label(By locator) {
        final int timeOutInSeconds = 5;
        this.wait = new WebDriverWait(browserInstance.getWrappedDriver(), timeOutInSeconds);
        this.locator = locator;
    }

    public String getText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return browserInstance.getText(locator);
    }
}
