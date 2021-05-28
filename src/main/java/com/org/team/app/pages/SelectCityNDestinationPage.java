package com.org.team.app.pages;

import com.org.team.app.utils.commonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCityNDestinationPage extends commonUtils {

    @FindBy(xpath="//select[@name='fromPort']")
    private WebElement departureCity;

    @FindBy(xpath="//select[@name='toPort']")
    private WebElement destinationCity;

    @FindBy(xpath="//input[@value='Find Flights']")
    private WebElement findFlights;

    public SelectCityNDestinationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setLocations(String departure,String destination){
        setDropdownValue( departureCity,departure);
        setDropdownValue(destinationCity,destination);
        findFlights.click();
    }

}
