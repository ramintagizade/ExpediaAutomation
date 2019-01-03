package com.expedia.automation.product.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FlightsPage {

    public FlightsPage typeFlightOrigin(String searchQuery) {
        AirportListPopUpWindow airportListPopUpWindow = new AirportListPopUpWindow();
        airportListPopUpWindow.getOriginFlight().type(searchQuery);
        return this;
    }

    public FlightsPage typeFlightDestination(String searchQuery) {
        AirportListPopUpWindow airportListPopUpWindow = new AirportListPopUpWindow();
        airportListPopUpWindow.getDestinationFlight().type(searchQuery);
        return this;
    }

    public FlightsPage typeFlightReturningDate(LocalDate returningDate) {
        CalendarPopUpWindow calendarPopUpWindow = new CalendarPopUpWindow();
        calendarPopUpWindow.getFlightReturningDate().type(returningDate.format( DateTimeFormatter.ofPattern("MM/d/uuuu")));
        return this;
    }

    public FlightsPage typeFlightDepartingDate(LocalDate departingDate) {
        CalendarPopUpWindow calendarPopUpWindow = new CalendarPopUpWindow();
        calendarPopUpWindow.getFlightDepartingDate().type(departingDate.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));
        return this;
    }

    public FlightsPage clickTravelersButton() {
        TravelersPopUpWindow travelersPopUpWindow = new TravelersPopUpWindow();
        travelersPopUpWindow.openTravellersWindow();
        travelersPopUpWindow.clickIncreaseAdultsNumberButton();
        return this;
    }

    public FlightsPage clickSearchButton() {
        FlightsSearchResultsPage flightsSearchResultsPage = new FlightsSearchResultsPage();
        flightsSearchResultsPage.clickSearchButton();
        return this;
    }

}
