package com.expedia.automation.product.popups;

import com.expedia.automation.framework.ui.components.Button;
import com.expedia.automation.product.pages.FlightsPage;
import org.openqa.selenium.By;

public class CalendarPopUpWindow {

    public FlightsPage clickFirstActiveDateOfCurrentMonth() {
        final By firstActiveDateOfCurrentMonthLocator = By.xpath("(//div[contains(@class,'datepicker-cal-month')][1]//"
                + "button[not(contains(@aria-hidden,'true'))])[1]");
        final Button activeDateOfCurrentMonthButton = new Button(firstActiveDateOfCurrentMonthLocator);
        activeDateOfCurrentMonthButton.click();
        return new FlightsPage();
    }

    public FlightsPage clickActiveDateOfCurrentMonth(int dayOfTheMonth) {
        if (dayOfTheMonth < 0) {
            throw new IllegalArgumentException(String.format("Day of the month is %d. It must be greater than or "
                    + "equal to 0", dayOfTheMonth));
        }
        final String activeDateOfCurrentMonthLocatorFormat = String.format("//div[contains(@class,'datepicker-cal-"
                + "month')][1]//button[not(contains(@aria-hidden,'true')) and @data-day=%d]", dayOfTheMonth);
        final By activeDateOfCurrentMonthLocator = By.xpath(activeDateOfCurrentMonthLocatorFormat);
        final Button activeDateOfCurrentMonthButton = new Button(activeDateOfCurrentMonthLocator);
        activeDateOfCurrentMonthButton.click();
        return new FlightsPage();
    }

    public FlightsPage clickLastActiveDateOfCurrentMonth() {
        final By lastActiveDateOfCurrentMonthLocator = By.xpath("(//div[contains(@class,'datepicker-cal-month')][1]//"
                + "button[@class='datepicker-cal-date'])[last()]");
        final Button lastActiveDateOfCurrentMonthButton = new Button(lastActiveDateOfCurrentMonthLocator);
        lastActiveDateOfCurrentMonthButton.click();
        return new FlightsPage();
    }

    public FlightsPage clickFirstActiveDateOfNextMonth() {
        final By firstActiveDateOfNextMonth = By.xpath("(//div[contains(@class,'datepicker-cal-month')][2]//"
                + "button[not(contains(@aria-hidden,'true'))])[1]");
        final Button firstActiveDateOfNextMonthButton = new Button(firstActiveDateOfNextMonth);
        firstActiveDateOfNextMonthButton.click();
        return new FlightsPage();
    }

    public FlightsPage clickActiveDateOfNextMonth(int dayOfTheMonth) {
        if (dayOfTheMonth < 0) {
            throw new IllegalArgumentException(String.format("Day of the month is %d. It must be greater than or "
                    + "equal to 0 ", dayOfTheMonth));
        }
        final String activeDateOfNextMonthFormat = String.format("//div[contains(@class,'datepicker-cal-month')][2]//"
                + "button[contains(@class,'datepicker-cal-date') and not(contains(@aria-hidden,'true')) and "
                + "@data-day=%d]", dayOfTheMonth);
        final By activeDateOfNextMonthLocator = By.xpath(activeDateOfNextMonthFormat);
        final Button activeDateOfNextMonthButton = new Button(activeDateOfNextMonthLocator);
        activeDateOfNextMonthButton.click();
        return new FlightsPage();
    }

    public FlightsPage clickLastActiveDateOfNextMonth() {
        final By lastActiveDateOfNextMonthLocator = By.xpath("(//div[contains(@class,'datepicker-cal-month')][2]//"
                + "button[@class='datepicker-cal-date'])[last()]");
        final Button lastActiveDateOfNextMonthButton = new Button(lastActiveDateOfNextMonthLocator);
        lastActiveDateOfNextMonthButton.click();
        return new FlightsPage();
    }

    public void clickNextMonthButton() {
        final By nextMonthButtonLocator = By.xpath("//*[contains(@id,'hp-flight')]//button[contains(@class,'datepicker-"
                + "next')]");
        final Button nextMonthButton = new Button(nextMonthButtonLocator);
        nextMonthButton.click();
    }

    public void clickPreviousMonthButton() {
        final By previousMonthButtonLocator = By.xpath("//*[contains(@id,'hp-flight')]//button[contains(@class,"
                + "'datepicker-prev')]");
        final Button previousMonthButton = new Button(previousMonthButtonLocator);
        previousMonthButton.click();
    }

    public FlightsPage clickCloseButton() {
        final By closeButtonLocator = By.xpath("//button[contains(@class, 'datepicker-close-btn')]");
        final Button closeButton = new Button(closeButtonLocator);
        closeButton.click();
        return new FlightsPage();
    }
}
