package com.expedia.automation;

import com.expedia.automation.framework.browser.Browser;
import com.expedia.automation.product.pages.BundleAndSavePage;
import com.expedia.automation.product.pages.FlightsPage;
import org.junit.*;

import java.time.LocalDate;

public class BaseConfigurationTest {

    private static FlightsPage flightsPage;
    private static Browser browser = Browser.getInstance();
    private static BundleAndSavePage bundleAndSavePage = new BundleAndSavePage();

    @BeforeClass
    public static void setUp() {
        browser.getWrappedDriver().open("http://www.expedia.com");
        bundleAndSavePage.clickFlightsButton().typeFlightOrigin("London, England, UK (LHR-Heathrow)")
                .typeFlightDestination("Dublin Airport (DUB), Ireland")
                .typeFlightReturningDate(LocalDate.of(2019,7,12))
                .typeFlightDepartingDate(LocalDate.of(2019,1,12))
                .clickTravelersButton().clickSearchButton();
    }

    @AfterClass
    public static void tearDown() {
        browser.stop();
    }
}
