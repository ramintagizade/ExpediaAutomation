package com.expedia.automation;


import com.expedia.automation.product.pages.FlightsSearchResultsPage;
import org.junit.Assert;
import org.junit.Test;

public class FlightBookingTest extends BaseConfigurationTest{

    private static FlightsSearchResultsPage flightsSearchResultsPage = new FlightsSearchResultsPage();

    @Test
    public void testFirstRowPrice() {
        String price = flightsSearchResultsPage.getFirstRowPrice();
        Assert.assertEquals("The price for first row is $133 ", price,"$133");
        Assert.assertTrue("The price for first row is not 1$ " ,!price.equals("1$"));
    }

    @Test
    public void testAirlinesIncluded() {
        int count = flightsSearchResultsPage.getAirlinesLen();
        Assert.assertTrue("There are available airlines  " , count>0);
    }

}
