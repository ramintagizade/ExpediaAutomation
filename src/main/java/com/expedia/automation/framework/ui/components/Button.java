package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button {

    private By locator;
    private WebDriverWait wait;

    public Button(By locator) {
        final int timeOutInSeconds = 5;
        this.wait = new WebDriverWait(Browser.getInstance().getWrappedDriver(), timeOutInSeconds);
        this.locator = locator;
    }

    public void click() {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Browser.getInstance().click(locator);
    }
}
