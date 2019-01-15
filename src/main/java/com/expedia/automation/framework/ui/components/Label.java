package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Label {

    private By locator;
    private WebDriverWait wait;

    public Label(By locator) {
        final int timeOutInSeconds = 5;
        this.wait = new WebDriverWait(Browser.getInstance().getWrappedDriver(), timeOutInSeconds);
        this.locator = locator;
    }

    public String getText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return Browser.getInstance().getText(locator);
    }
}
