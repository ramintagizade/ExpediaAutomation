package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import org.openqa.selenium.By;

public class BundleAndSavePage {

    public FlightsPage clickFlightsButton() {
        Button button = new Button(By.xpath("//*[@id='tab-flight-tab-hp']/span[1]/span"));
        button.click();
        return new FlightsPage();
    }
}
