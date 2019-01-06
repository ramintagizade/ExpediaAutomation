package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import com.expedia.automation.framework.ui.components.Label;
import org.openqa.selenium.By;

public class FlightsSearchResultsPage {

    public void clickSearchButton() {
        By searchLocator = By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[contains(@class,'cols-nested')]//"
                + "label[contains(@class,'search-btn-col')]/button");
        Button button = new Button(searchLocator);
        button.click();
    }

    public String getFirstRowPrice() {
        By firstRowPriceLocator = By.xpath("//*[@id='flightModuleList']/li[1]/div//*[@data-test-id='listing-price-"
                + "dollars']");
        Label label = new Label(firstRowPriceLocator);
        return label.getText();
    }

    public int getAirlinesLen() {
        By airlinesLocator = By.xpath("//*[@id='airlines']/div/label");
        Label label = new Label(airlinesLocator);
        return label.getSize();
    }
}
