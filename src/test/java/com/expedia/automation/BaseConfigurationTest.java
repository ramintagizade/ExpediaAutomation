package com.expedia.automation;

import com.expedia.automation.framework.browser.Browser;
import com.expedia.automation.product.pages.BundleAndSavePage;
import org.junit.*;

import java.time.LocalDate;

public class BaseConfigurationTest {

    private static BundleAndSavePage bundleAndSavePage = new BundleAndSavePage();

    @BeforeClass
    public static void setUp() {

        Browser.getInstance().navigate("http://www.expedia.com");
        bundleAndSavePage.clickFlightsButton().typeFlightOrigin("London").clickAriportLinkByText("Heathrow")
                .typeFlightDestination("Dublin").clickAriportLinkByText("Ireland")
                .typeFlightReturningDate(LocalDate.of(2019, 7, 12)).clickReturningCloseButton()
                .typeFlightDepartingDate(LocalDate.of(2019, 1, 12)).clickDepartingCloseButton()
                .clickTravelersButton().clickIncreaseAdultsNumberButton().clickCloseButton()
                .clickSearchButton();
    }

}
