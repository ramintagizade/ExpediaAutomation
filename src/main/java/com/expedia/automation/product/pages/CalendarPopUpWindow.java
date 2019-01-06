package com.expedia.automation.product.pages;

import com.expedia.automation.framework.ui.components.Button;
import org.openqa.selenium.By;

public class CalendarPopUpWindow {

    public FlightsPage clickFirstActiveDateOfCurrentMonth() {
        By firstActiveDateOfCurrentMonthLocator = By.xpath("//*[@id='flight-departing-wrapper-single-hp-flight']//"
                + "div[contains(@class,'datepicker-cal-month')][1]//button[contains(@class,'datepicker-cal-date') and "
                + "and contains(@class,'start')");
        Button button = new Button(firstActiveDateOfCurrentMonthLocator);
        button.click();
        return new FlightsPage();
    }

    public FlightsPage clickActiveDateOfCurrentMonth(int dayOfTheMonth) {
        By activeDateOfCurrentMonthLocator = By.xpath("//*[@id='flight-departing-wrapper-single-hp-flight']//"
                + "div[contains(@class,'datepicker-cal-month')][1]//button[contains(@class,'datepicker-cal-date') and "
                + "not(contains(@aria-hidden,'true')) and @data-day=" + dayOfTheMonth + "]");
        Button button = new Button(activeDateOfCurrentMonthLocator);
        button.click();
        return new FlightsPage();
    }

    public FlightsPage clickLastActiveDateOfCurrentMonth() {
        By lastActiveDateOfCurrentMonthLocator = By.xpath("//*[@id='flight-departing-wrapper-single-hp-flight']//"
                + "div[contains(@class,'datepicker-cal-month')][2]//tr[last()]//"
                + "td[contains(@class,'datepicker-day-number')][last()]/button");
        Button button = new Button(lastActiveDateOfCurrentMonthLocator);
        button.click();
        return new FlightsPage();
    }

    public FlightsPage clickFirstActiveDateOfNextMonth() {
        By firstActiveDateOfNextMonth = By.xpath("//*[@id='flight-departing-wrapper-single-hp-flight']//"
                + "div[contains(@class,'datepicker-cal-month')][2]//tr[1]//td[contains(@class,'datepicker-day-number')]"
                + "[1]/button");
        Button button = new Button(firstActiveDateOfNextMonth);
        button.click();
        return new FlightsPage();
    }

    public FlightsPage clickActiveDateOfNextMonth(int dayOfTheMonth) {
        By activeDateOfNextMonthLocator = By.xpath("//*[@id='flight-departing-wrapper-hp-flight']//"
                + "div[contains(@class,'datepicker-cal-month')][2]//button[contains(@class,'datepicker-cal-date') and "
                + "not(contains(@aria-hidden,'true')) and @data-day=" + dayOfTheMonth + "]");
        return new FlightsPage();
    }

    public FlightsPage clickLastActiveDateOfNextMonth() {
        By lastActiveDateOfNextMonthLocator = By.xpath("//*[@id='flight-departing-wrapper-single-hp-flight']//"
                + "div[contains(@class,'datepicker-cal-month')][2]//tr[last()]//"
                + "td[contains(@class,'datepicker-day-number')][last()]/button");
        Button button = new Button(lastActiveDateOfNextMonthLocator);
        button.click();
        return new FlightsPage();
    }

    public void clickNextMonthButton() {
        By nextMonthButtonLocator = By.xpath("//*[@id='flight-departing-wrapper-single-hp-flight']/div/div/button[2]");
        Button nextMonthButton = new Button(nextMonthButtonLocator);
        nextMonthButton.click();
    }

    public void clickPreviousMonthButton() {
        By previousMonthButtonLocator = By.xpath("//*[@id='flight-departing-wrapper-single-hp-flight']/div/div/"
                + "button[1]");
        Button previousMonthButton = new Button(previousMonthButtonLocator);
        previousMonthButton.click();
    }

    public FlightsPage clickDepartingCloseButton() {
        Button button = new Button(By.xpath("//*[@id='flight-departing-wrapper-hp-flight']//div[contains"
                + "(@class,'datepicker-dropdown')]//button[contains(@class,'datepicker-close-btn')]"));
        button.click();
        return new FlightsPage();
    }

    public FlightsPage clickReturningCloseButton() {
        By returningCloseLocator = By.xpath("//*[@id='flight-returning-wrapper-hp-flight']//"
                + "button[contains(@class,'datepicker-close-btn')]");
        Button button = new Button(returningCloseLocator);
        button.click();
        return new FlightsPage();
    }
}
