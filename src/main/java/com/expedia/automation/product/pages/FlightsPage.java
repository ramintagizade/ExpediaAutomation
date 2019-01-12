package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import com.expedia.automation.framework.ui.components.TextField;
import com.expedia.automation.product.popups.AirportListPopUpWindow;
import com.expedia.automation.product.popups.CalendarPopUpWindow;
import com.expedia.automation.product.popups.TravelersPopUpWindow;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FlightsPage {

    public AirportListPopUpWindow typeFlightOrigin(String searchQuery) {
        final By flightOriginLocator = By.xpath("//*[@id='flight-origin-hp-flight']");
        final TextField flightOriginTextField = new TextField(flightOriginLocator);
        flightOriginTextField.type(searchQuery);
        return new AirportListPopUpWindow();
    }

    public AirportListPopUpWindow typeFlightDestination(String searchQuery) {
        final By flightDestinationLocator = By.xpath("//*[@id='flight-destination-hp-flight']");
        final TextField flightDestinationTextField = new TextField(flightDestinationLocator);
        flightDestinationTextField.type(searchQuery);
        return new AirportListPopUpWindow();
    }

    public CalendarPopUpWindow typeFlightReturningDate(LocalDate returningDate) {
        final By returningDateLocator = By.xpath("//*[@id='flight-returning-hp-flight']");
        final TextField reeturningDateTextField = new TextField(returningDateLocator);
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/d/uuuu");
        final String formattedReturningDate = returningDate.format(dateTimeFormatter);
        reeturningDateTextField.type(formattedReturningDate);
        return new CalendarPopUpWindow();
    }

    public CalendarPopUpWindow typeFlightDepartingDate(LocalDate departingDate) {
        final By departingDateLocator = By.xpath("//*[@id='flight-departing-hp-flight']");
        final TextField departingDateTextField = new TextField(departingDateLocator);
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/d/uuuu");
        final String formattedDepartingDate = departingDate.format(dateTimeFormatter);
        departingDateTextField.type(formattedDepartingDate);
        return new CalendarPopUpWindow();
    }

    public CalendarPopUpWindow clickFlightReturningDateTextField() {
        final By returningDateTextFieldLocator = By.xpath("//div[contains(@id,'flight-returning-wrapper-hp-flight')]");
        final TextField returningDateTextField = new TextField(returningDateTextFieldLocator);
        returningDateTextField.click();
        return new CalendarPopUpWindow();
    }

    public CalendarPopUpWindow clickFlightDepartingDateTextField() {
        final By departingDateTextFieldLocator = By.xpath("//div[contains(@id,'flight-departing-wrapper-hp-flight')]");
        final TextField departingDateTextField = new TextField(departingDateTextFieldLocator);
        departingDateTextField.click();
        return new CalendarPopUpWindow();
    }

    public TravelersPopUpWindow clickTravelersButton() {
        final By travellersLocator = By.xpath("//*[@id='traveler-selector-hp-flight']//button[contains(@class,'gcw-"
                + "traveler-amount-select')]");
        final Button travellersButton = new Button(travellersLocator);
        travellersButton.click();
        return new TravelersPopUpWindow();
    }

    public FlightsSearchResultsPage clickSearchButton() {
        final FlightsSearchResultsPage flightsSearchResultsPage = new FlightsSearchResultsPage();
        final By searchResultsLocator = By.xpath("//*[@id='gcw-flights-form-hp-flight']//"
                + "label[contains(@class,'search-btn-col')]/button");
        final Button searchButton = new Button(searchResultsLocator);
        searchButton.click();
        return flightsSearchResultsPage;
    }
}
