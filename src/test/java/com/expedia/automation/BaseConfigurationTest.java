package com.expedia.automation;

import com.expedia.automation.framework.browser.Browser;
import org.junit.*;

public class BaseConfigurationTest {

    @Before
    public void setUp() {
        Browser.getInstance().navigate("https://www.expedia.com");
    }

    @After
    public void tearDown() {
        Browser.getInstance().stop();
    }

}
