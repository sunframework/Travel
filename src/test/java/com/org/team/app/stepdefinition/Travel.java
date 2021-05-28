package com.org.team.app.stepdefinition;

import com.org.team.app.pages.ConfirmationPage;
import com.org.team.app.pages.SelectAirlineNFlightPage;
import com.org.team.app.pages.SelectCityNDestinationPage;
import com.org.team.app.utils.commonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Travel extends commonUtils {

    WebDriver driver= null;

    @Given("^user selects the \"([^\"]*)\" and the \"([^\"]*)\" location using \"([^\"]*)\"$")
    public void user_selects_the_something_and_the_something_location_using_something(String departure, String destination, String browser) throws Throwable {
        driver = setDriver(browser);
        driver.get(mainProperties.getProperty("applicationURL"));
        SelectCityNDestinationPage CitynDestination= new SelectCityNDestinationPage(driver);
        CitynDestination.setLocations(departure,destination);
    }

    @When("^user enters the details and chooses the flight$")
    public void user_enters_the_details_and_chooses_the_flight() throws Throwable {
        SelectAirlineNFlightPage bookFlight= new SelectAirlineNFlightPage(driver);
        bookFlight.bookFlightnEnterCustomerDetails();
    }

    @Then("^order id should be generated$")
    public void order_id_should_be_generated() throws Throwable {
        ConfirmationPage cp= new ConfirmationPage(driver);
        cp.confirmOrder();
        driver.quit();
    }
}
