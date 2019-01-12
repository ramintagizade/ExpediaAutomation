package com.expedia.automation.product.popups;

import com.expedia.automation.framework.ui.components.Link;
import com.expedia.automation.product.pages.FlightsPage;
import org.openqa.selenium.By;

public class AirportListPopUpWindow {

    public FlightsPage clickAirportLinkByText(String linkText) {
        final By airportLinkLocator = By.xpath("//ul[@id='typeaheadDataPlain']//"
                + "li[@class='results-item']//a[contains(@data-value,'" + linkText + "')]");
        final Link airportLink = new Link(airportLinkLocator);
        airportLink.click();
        return new FlightsPage();
    }

    public FlightsPage clickAirportLinkByIndex(int linkIndex) {
        final By airportLinkLocator = By.xpath("//ul[@id='typeaheadDataPlain']//"
                + "li[@class='results-item']//a[@data-row=" + linkIndex + "]");
        final Link airportLink = new Link(airportLinkLocator);
        airportLink.click();
        return new FlightsPage();
    }
}
