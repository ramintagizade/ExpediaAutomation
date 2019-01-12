package com.expedia.automation;

import com.expedia.automation.framework.browser.Browser;
import com.expedia.automation.product.pages.BundleAndSavePage;
import org.junit.*;

public class BaseConfigurationTest {

    private static BundleAndSavePage bundleAndSavePage = new BundleAndSavePage();

    @BeforeClass
    public static void setUp() {
        Browser.getInstance().navigate("http://www.expedia.com");
    }

    @AfterClass
    public static void tearDown() {
        Browser.getInstance().stop();
    }

}
