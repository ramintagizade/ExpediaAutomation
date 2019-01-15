package com.expedia.automation.product.popups;

import com.expedia.automation.framework.ui.components.Button;
import com.expedia.automation.product.pages.FlightsPage;
import org.openqa.selenium.By;

public class TravelersPopUpWindow {

    public void clickIncreaseAdultsNumberButton() {
        final By increaseAdultsBtnLocator = By.xpath("(//*[@id='traveler-selector-hp-flight']//div[contains(@class, "
                + "'step-input-outside')])[1]//button[contains(@class, 'uitk-step-input-plus')]");
        final Button increaseAdultsNumberButton = new Button(increaseAdultsBtnLocator);
        increaseAdultsNumberButton.click();
    }

    public void clickDecreaseAdultsNumberButton() {
        final By decreaseAdultsBtnLocator = By.xpath("(//*[@id='traveler-selector-hp-flight']//div[contains(@class, "
                + "'step-input-outside')])[1]//button[contains(@class, 'uitk-step-input-minus')]");
        final Button decreaseAdultsNumberButton = new Button(decreaseAdultsBtnLocator);
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
