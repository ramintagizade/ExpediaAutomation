package com.expedia.automation.product.popups;

import com.expedia.automation.framework.ui.components.Button;
import com.expedia.automation.product.pages.FlightsPage;
import org.openqa.selenium.By;

public class TravelersPopUpWindow {

    public void clickIncreaseAdultsNumberButton() {
        final Button increaseAdultsNumberButton = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//"
                + "div[contains(@class,'traveler-selector-room-data')]//div[4]/button"));
        increaseAdultsNumberButton.click();
    }

    public void clickDecreaseAdultsNumberButton() {
        final Button decreaseAdultsNumberButton = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//"
                + "div[contains(@class,'traveler-selector-room-data')]//div[2]/button"));
        decreaseAdultsNumberButton.click();
    }

    public FlightsPage clickCloseButton() {
        final FlightsPage flightsPage = new FlightsPage();
        final Button closeButton = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//"
                + "button[contains(@class,'close')]"));
        closeButton.click();
        return flightsPage;
    }

}
