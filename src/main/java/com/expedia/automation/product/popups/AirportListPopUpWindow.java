package com.expedia.automation.product.popups;

import com.expedia.automation.framework.ui.components.Link;
import com.expedia.automation.product.pages.FlightsPage;
import org.openqa.selenium.By;

import java.util.Objects;

public class AirportListPopUpWindow {

    public FlightsPage clickAirportLinkByText(String linkText) {
        Objects.requireNonNull(linkText, "Link text cannot be null");
        final String airportLinkLocatorFormat = String.format("//a[contains(@data-value,'%s')]", linkText);
        final By airportLinkLocator = By.xpath(airportLinkLocatorFormat);
        final Link airportLink = new Link(airportLinkLocator);
        airportLink.click();
        return new FlightsPage();
    }

    public FlightsPage clickAirportLinkByIndex(int linkIndex) {
        if (linkIndex < 0) {
            throw new IllegalArgumentException(String.format("Link index is %d. It must be or greater than 0",
                    linkIndex));
        }
        final String airportLinkLocatorFormat = String.format("//a[@id='aria-option-%d']", linkIndex);
        final By airportLinkLocator = By.xpath(airportLinkLocatorFormat);
        final Link airportLink = new Link(airportLinkLocator);
        airportLink.click();
        return new FlightsPage();
    }
}
