package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Label;
import org.openqa.selenium.By;

public class FlightsSearchResultsPage {

    public String getFlightPrice(int flightIndex) {
        final By priceLocator = By.xpath("//*[@id='flightModuleList']/li[" + flightIndex + "]//*[@data-test-id="
                + "'listing-price-dollars']");
        final Label priceLabel = new Label(priceLocator);
        return priceLabel.getText();
    }

    public Boolean isAirlinesIncluded() {
        final By airlinesIncludedLocator = By.xpath("//fieldset[@id='airlines']");
        final Label airlinesIncludedLabel = new Label(airlinesIncludedLocator);
        final int startLength = 30;
        final String airlinesTextLength = airlinesIncludedLabel.getText();
        return airlinesTextLength.length() > startLength;
    }
}
