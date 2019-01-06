package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import org.openqa.selenium.By;

public class AirportListPopUpWindow {

    public FlightsPage clickAriportLinkByText(String linkText) {
        By airportLinkLocator = By.xpath("//div[contains(@class,'display-group-results')]//li[@class='results-item']//"
                + "a[contains(@data-value," + linkText + ")]");
        Button airportLinkBtn = new Button(airportLinkLocator);
        airportLinkBtn.click();
        return new FlightsPage();
    }

    public FlightsPage clickAriportLinkByIndex(int linkIndex) {
        By airportLinkLocator = By.xpath("//div[contains(@class,'display-group-results')]//li[@class='results-item']//"
                + "a[@data-row=" + linkIndex + "]");
        Button airportLinkBtn = new Button(airportLinkLocator);
        airportLinkBtn.click();
        return new FlightsPage();
    }

}
