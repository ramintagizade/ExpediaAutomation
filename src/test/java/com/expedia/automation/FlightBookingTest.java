package com.expedia.automation;

import com.expedia.automation.product.pages.BundleAndSavePage;
import com.expedia.automation.product.pages.FlightsPage;
import com.expedia.automation.product.pages.FlightsSearchResultsPage;
import com.expedia.automation.product.popups.AirportListPopUpWindow;
import com.expedia.automation.product.popups.CalendarPopUpWindow;
import com.expedia.automation.product.popups.TravelersPopUpWindow;
import org.junit.*;

import java.time.LocalDate;

public class FlightBookingTest extends BaseConfigurationTest{

    private static FlightsSearchResultsPage flightsSearchResultsPage = new FlightsSearchResultsPage();

    @BeforeClass
    public static void init() {
        setUp();
        FlightsPage flightsPage = new FlightsPage();
        BundleAndSavePage bundleAndSavePage = new BundleAndSavePage();
        bundleAndSavePage.clickFlightsButton();
        AirportListPopUpWindow airportListPopUpWindow = flightsPage.typeFlightOrigin("London");
        airportListPopUpWindow.clickAirportLinkByText("Heathrow");
        flightsPage.typeFlightDestination("Dublin");
        airportListPopUpWindow.clickAirportLinkByText("Ireland");
        flightsPage.typeFlightReturningDate(LocalDate.of(2019,7,12));
        CalendarPopUpWindow calendarPopUpWindow = flightsPage.clickFlightReturningDateTextField();
        calendarPopUpWindow.clickCloseButton();
        flightsPage.typeFlightDepartingDate(LocalDate.of(2019,1,12));
        flightsPage.clickFlightDepartingDateTextField();
        TravelersPopUpWindow travelersPopUpWindow = flightsPage.clickTravelersButton();
        travelersPopUpWindow.clickIncreaseAdultsNumberButton();
        flightsPage.clickSearchButton();
    }

    @Test
    public void testFirstRowPrice() {
        String priceStr = flightsSearchResultsPage.getFlightPrice(1);
        String priceSubStr = priceStr.substring(1);
        Integer price  = Integer.parseInt(priceSubStr);
        Assert.assertTrue("The price for first row is greater than $100 ", price > 100);
    }

    @Test
    public void testFirstRowPriceGreaterThan1() {
        String price = flightsSearchResultsPage.getFlightPrice(1);
        Assert.assertTrue("The price for first row is not 1$" , !price.equals("1$"));
    }

    @Test
    public void testAirlinesIncluded() {
        Assert.assertTrue("Airlines included below stops " , flightsSearchResultsPage.isAirlinesIncluded());
    }
}
