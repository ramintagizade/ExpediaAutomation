package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import com.expedia.automation.framework.ui.components.Label;
import org.openqa.selenium.By;

public class FlightsSearchResultsPage {

    public void clickSearchButton() {
        Button button = new Button(By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[contains(@class,'cols-nested')]//label[contains(@class,'search-btn-col')]/button"));
        button.click();
    }

    public String getFirstRowPrice() {
        Label label = new Label(By.xpath("//*[@id='flightModuleList']/li[1]/div//*[@data-test-id='listing-price-dollars']"));
        return label.getText();
    }

    public int getAirlinesLen() {
       Label label = new Label();
       return label.getLabelSize(By.xpath("//*[@id='airlines']/div/label"));
    }
}
