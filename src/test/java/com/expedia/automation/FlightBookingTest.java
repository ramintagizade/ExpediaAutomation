package com.expedia.automation;


import com.expedia.automation.framework.browser.Browser;
import com.expedia.automation.product.pages.FlightsSearchResultsPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class FlightBookingTest extends BaseConfigurationTest{

    private static FlightsSearchResultsPage flightsSearchResultsPage = new FlightsSearchResultsPage();

    @Test
    public void testFirstRowPrice() {
        String price = flightsSearchResultsPage.getFirstRowPrice().substring(1);
        Assert.assertTrue("The price for first row is greater than $100 ", Integer.parseInt(price) > 100);
        Assert.assertTrue("The price for first row is not 1$ " ,!price.equals("1$"));
    }

    @Test
    public void testAirlinesIncluded() {
        int count = flightsSearchResultsPage.getAirlinesLen();
        Assert.assertTrue("There are available airlines  " , count>0);
    }

    @AfterClass
    public static void tearDown() {
        Browser.getInstance().stop();
    }

}
