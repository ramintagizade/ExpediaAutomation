package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import org.openqa.selenium.By;

public class TravelersPopUpWindow {

    public TravelersPopUpWindow clickIncreaseAdultsNumberButton() {
        Button button = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//div[@class='traveler-selector-"
                + "sinlge-room-data traveler-selector-room-data']//div[4]/button"));
        button.click();
        return new TravelersPopUpWindow();
    }

    public TravelersPopUpWindow clickDecreaseAdultsNumberButton() {
        Button button = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//div[@class='traveler-selector-"
                + "sinlge-room-data traveler-selector-room-data']//div[2]/button"));
        button.click();
        return new TravelersPopUpWindow();
    }

    public FlightsPage clickCloseButton() {
        FlightsPage flightsPage = new FlightsPage();
        Button button = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//div[contains(@class,'menu-close')]"
                + "//button[contains(@class,'close')]"));
        button.click();
        return flightsPage;
    }

}
