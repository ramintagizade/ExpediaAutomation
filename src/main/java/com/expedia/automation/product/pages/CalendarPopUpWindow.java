package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.TextField;
import org.openqa.selenium.By;

public class CalendarPopUpWindow {

    public TextField getFlightDepartingDate() {
        TextField textField = new TextField(By.xpath("//*[@id='flight-departing-hp-flight']"));
        return textField;
    }

    public TextField getFlightReturningDate() {
        TextField textField = new TextField(By.xpath("//*[@id='flight-returning-hp-flight']"));
        return textField;
    }
}
