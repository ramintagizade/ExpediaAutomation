package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Label;
import org.openqa.selenium.By;

public class FlightsSearchResultsPage {

    public String getFlightPrice(int flightIndex) {
        if (flightIndex < 0) {
            throw new IllegalArgumentException(String.format("Flight index is %d. It must be greater or equal to 0",
                    flightIndex));
        }
        final String priceLocatorFormat = String.format("//*[@id='flightModuleList']/li[%d]//*[@data-test-id="
                + "'listing-price-dollars']", flightIndex);
        final By priceLocator = By.xpath(priceLocatorFormat);
        final Label priceLabel = new Label(priceLocator);
        return priceLabel.getText();
    }

    public String getAirlinesIncluded() {
        final By airlinesIncludedLocator = By.xpath("//fieldset[@id='airlines']");
        final Label airlinesIncludedLabel = new Label(airlinesIncludedLocator);
        return airlinesIncludedLabel.getText();
    }
}
