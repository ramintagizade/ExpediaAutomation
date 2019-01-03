package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.TextField;
import org.openqa.selenium.By;

public class AirportListPopUpWindow {

    public TextField getOriginFlight() {
        TextField textField = new TextField(By.xpath("//*[@id='flight-origin-hp-flight']"));
        return textField;
    }

    public TextField getDestinationFlight() {
        TextField textField = new TextField(By.xpath("//*[@id='flight-destination-hp-flight']"));
        return textField;
    }

}
