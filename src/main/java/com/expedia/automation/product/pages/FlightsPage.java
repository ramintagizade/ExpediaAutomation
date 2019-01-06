package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import com.expedia.automation.framework.ui.components.TextField;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FlightsPage {

    public AirportListPopUpWindow typeFlightOrigin(String searchQuery) {
        By flightOriginLocator = By.xpath("//*[@id='flight-origin-hp-flight']");
        TextField flightOriginTextField = new TextField(flightOriginLocator);
        flightOriginTextField.type(searchQuery);
        return new AirportListPopUpWindow();
    }

    public AirportListPopUpWindow typeFlightDestination(String searchQuery) {
        By flightDestinationLocator = By.xpath("//*[@id='flight-destination-hp-flight']");
        TextField flightDestinationTextField = new TextField(flightDestinationLocator);
        flightDestinationTextField.type(searchQuery);
        return new AirportListPopUpWindow();
    }

    public CalendarPopUpWindow typeFlightReturningDate(LocalDate returningDate) {
        By returningDateLocator = By.xpath("//*[@id='flight-returning-hp-flight']");
        TextField textField = new TextField(returningDateLocator);
        textField.type(returningDate.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));

        By returningDateInputLocator = By.xpath("//div[contains(@id,'flight-returning-wrapper-hp-flight')]");
        Button button = new Button(returningDateInputLocator);
        button.click();
        return new CalendarPopUpWindow();
    }

    public CalendarPopUpWindow typeFlightDepartingDate(LocalDate departingDate) {
        By departingDateLocator = By.xpath("//*[@id='flight-departing-hp-flight']");
        TextField textField = new TextField(departingDateLocator);
        textField.type(departingDate.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));

        By departingDateInputLocator = By.xpath("//div[contains(@id,'flight-departing-wrapper-hp-flight')]");
        Button button = new Button(departingDateInputLocator);
        button.click();
        return new CalendarPopUpWindow();
    }

    public TravelersPopUpWindow clickTravelersButton() {
        By travellersLocator = By.xpath("//*[@id='traveler-selector-hp-flight']//button[contains(@class,'gcw-"
                + "traveler-amount-select')]");
        Button button = new Button(travellersLocator);
        button.click();
        return new TravelersPopUpWindow();
    }

    public FlightsSearchResultsPage clickSearchButton() {
        FlightsSearchResultsPage flightsSearchResultsPage = new FlightsSearchResultsPage();
        flightsSearchResultsPage.clickSearchButton();
        return flightsSearchResultsPage;
    }

}
