package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextField {

    private WebElement textField;

    public TextField(By locator) {
        textField = Browser.getInstance().getWrappedDriver().getDriver().findElement(locator);
    }

    public void type(String text) {
        textField.clear();
        textField.sendKeys(text);
    }
}
