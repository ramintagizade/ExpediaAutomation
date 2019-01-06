package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;

public class Label {

    private By locator;

    public Label(By locator) {
        this.locator = locator;
    }

    public int getSize() {
        return Browser.getInstance().getWebElements(locator).size();
    }

    public String getText() {
        return Browser.getInstance().getText(locator);
    }
}
