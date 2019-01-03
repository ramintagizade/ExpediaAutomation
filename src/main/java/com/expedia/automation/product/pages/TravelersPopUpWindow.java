package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import org.openqa.selenium.By;

public class TravelersPopUpWindow {

    public void openTravellersWindow() {
        Button button = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//button[contains(@class,'gcw-traveler-amount-select')]"));
        button.click();
    }

    public void clickIncreaseAdultsNumberButton() {
        Button button = new Button(By.xpath("//*[@id='traveler-selector-hp-flight']//div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']//div[4]/button"));
        button.click();
    }

}
