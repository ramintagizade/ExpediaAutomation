package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button {

    private WebElement button;
    private static WebDriverWait wait;

    public Button(By locator) {
        wait = new WebDriverWait(Browser.getInstance().getWrappedDriver().getDriver(), 4);
        button = Browser.getInstance().getWrappedDriver().getDriver().findElement(locator);
    }

    public void click() {
        button = wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }
}
