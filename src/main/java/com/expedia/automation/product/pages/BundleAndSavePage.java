package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import org.openqa.selenium.By;

public class BundleAndSavePage {

    public FlightsPage clickFlightsButton() {
        final Button flightsButton = new Button(By.xpath("//*[@id='tab-flight-tab-hp']/span[1]/span"));
        flightsButton.click();
        return new FlightsPage();
    }
}
