package com.expedia.automation.framework.ui.components;

import com.expedia.automation.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Label {

    private WebElement label;
    private List<WebElement> labels;

    public Label() {

    }

    public Label(By locator) {
        label = Browser.getInstance().getWrappedDriver().getDriver().findElement(locator);
    }

    public int getLabelSize(By locator) {
        labels = Browser.getInstance().getWrappedDriver().getDriver().findElements(locator);
        return labels.size();
    }

    public String getText() {

        return label.getText();
    }
}
