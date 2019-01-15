package com.expedia.automation;

import com.expedia.automation.product.pages.BundleAndSavePage;
import com.expedia.automation.product.pages.FlightsPage;
import com.expedia.automation.product.pages.FlightsSearchResultsPage;
import com.expedia.automation.product.popups.AirportListPopUpWindow;
import com.expedia.automation.product.popups.TravelersPopUpWindow;
import org.javamoney.moneta.Money;
import org.junit.*;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.time.LocalDate;

public class FlightBookingTest extends BaseConfigurationTest{

    @Test
    public void testFirstRowPrice() {
        BundleAndSavePage bundleAndSavePage = new BundleAndSavePage();
        FlightsPage flightsPage = bundleAndSavePage.clickFlightsButton();
        AirportListPopUpWindow originAirportListPopUpWindow = flightsPage.typeFlightOrigin("London");
        originAirportListPopUpWindow.clickAirportLinkByText("Heathrow");
        AirportListPopUpWindow destinationAirportListPopUpWindow = flightsPage.typeFlightDestination("Dublin");
        destinationAirportListPopUpWindow.clickAirportLinkByText("Ireland");

        LocalDate returningDate = LocalDate.of(2019, 7, 12);
        flightsPage.clickFlightReturningDateTextField();
        flightsPage.clearFlightReturningDate();
        flightsPage.typeFlightReturningDate(returningDate);

        LocalDate departingDate = LocalDate.of(2019, 1, 30);
        flightsPage.clickFlightDepartingDateTextField();
        flightsPage.clearFlightDepartingDate();
        flightsPage.typeFlightDepartingDate(departingDate);

        TravelersPopUpWindow travelersPopUpWindow = flightsPage.clickTravelersButton();
        travelersPopUpWindow.clickIncreaseAdultsNumberButton();
        travelersPopUpWindow.clickCloseButton();
        FlightsSearchResultsPage flightsSearchResultsPage = flightsPage.clickSearchButton();
        String flightPrice = flightsSearchResultsPage.getFlightPrice(1);
        String flightPriceSub = flightPrice.substring(1);
        Integer price  = Integer.parseInt(flightPriceSub);
        MonetaryAmount flightPriceAmount = Monetary.getDefaultAmountFactory().setCurrency("USD")
                .setNumber(price).create();
        Assert.assertTrue("First row price is greater than $50 ", flightPriceAmount.isGreaterThan(Money.of(50,"USD")));
    }

    @Test
    public void testFirstRowPriceGreaterThan1() {
        BundleAndSavePage bundleAndSavePage = new BundleAndSavePage();
        FlightsPage flightsPage = bundleAndSavePage.clickFlightsButton();
        AirportListPopUpWindow originAirportListPopUpWindow = flightsPage.typeFlightOrigin("London");
        originAirportListPopUpWindow.clickAirportLinkByText("Heathrow");
        AirportListPopUpWindow destinationAirportListPopUpWindow = flightsPage.typeFlightDestination("Dublin");
        destinationAirportListPopUpWindow.clickAirportLinkByText("Ireland");
        flightsPage.clickFlightReturningDateTextField();
        flightsPage.clearFlightReturningDate();
        LocalDate returningDate = LocalDate.of(2019, 7, 12);
        flightsPage.typeFlightReturningDate(returningDate);
        flightsPage.clickFlightDepartingDateTextField();
        flightsPage.clearFlightDepartingDate();
        LocalDate departingDate = LocalDate.of(2019, 1, 30);
        flightsPage.typeFlightDepartingDate(departingDate);
        TravelersPopUpWindow travelersPopUpWindow = flightsPage.clickTravelersButton();
        travelersPopUpWindow.clickIncreaseAdultsNumberButton();
        travelersPopUpWindow.clickCloseButton();
        FlightsSearchResultsPage flightsSearchResultsPage = flightsPage.clickSearchButton();
        String flightPrice = flightsSearchResultsPage.getFlightPrice(1);
        String flightPriceSub = flightPrice.substring(1);
        Integer price  = Integer.parseInt(flightPriceSub);
        MonetaryAmount flightPriceAmount = Monetary.getDefaultAmountFactory().setCurrency("USD")
                .setNumber(price).create();
        Assert.assertTrue("First row price is not equal to $1", !flightPriceAmount.equals(Money.of(1,"USD")));
    }


    @Test
    public void testAirlinesIncluded() {

        BundleAndSavePage bundleAndSavePage = new BundleAndSavePage();
        FlightsPage flightsPage = bundleAndSavePage.clickFlightsButton();
        AirportListPopUpWindow originAirportListPopUpWindow = flightsPage.typeFlightOrigin("London");
        originAirportListPopUpWindow.clickAirportLinkByText("Heathrow");
        AirportListPopUpWindow destinationAirportListPopUpWindow = flightsPage.typeFlightDestination("Dublin");
        destinationAirportListPopUpWindow.clickAirportLinkByText("Ireland");
        flightsPage.clickFlightReturningDateTextField();
        flightsPage.clearFlightReturningDate();
        LocalDate returningDate = LocalDate.of(2019, 7, 12);
        flightsPage.typeFlightReturningDate(returningDate);
        flightsPage.clickFlightDepartingDateTextField();
        flightsPage.clearFlightDepartingDate();
        LocalDate departingDate = LocalDate.of(2019, 1, 30);
        flightsPage.typeFlightDepartingDate(departingDate);
        TravelersPopUpWindow travelersPopUpWindow = flightsPage.clickTravelersButton();
        travelersPopUpWindow.clickIncreaseAdultsNumberButton();
        travelersPopUpWindow.clickCloseButton();
        FlightsSearchResultsPage flightsSearchResultsPage = flightsPage.clickSearchButton();
        String airlinesIncludedText = flightsSearchResultsPage.getAirlinesIncluded();
        int startLength = 30;
        Assert.assertTrue("Airlines included below stops" , airlinesIncludedText.length() > startLength);
    }
}
