package com.org.team.app.pages;

import com.org.team.app.pojo.customerInfo;
import com.org.team.app.utils.commonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAirlineNFlightPage extends commonUtils {


    @FindBy(xpath="//input[@value='Lufthansa']/../td/input[@value='Choose This Flight']")
    private WebElement selectFlight;

    @FindBy(xpath="//input[@id=\"inputName\"]")
    private WebElement Name;

    @FindBy(xpath="//input[@name=\"address\"]")
    private WebElement Address;

    @FindBy(xpath="//input[@id='city']")
    private WebElement City;

    @FindBy(xpath="//input[@id='state']")
    private WebElement State;

    @FindBy(xpath="//input[@id='zipCode']")
    private WebElement zipCode;

    @FindBy(xpath="//select[@id='cardType']")
    private WebElement cardType;

    @FindBy(xpath="//input[@id='creditCardNumber']")
    private WebElement creditCardNumber;

    @FindBy(xpath="//input[@id='creditCardMonth']")
    private WebElement creditCardMonth;

    @FindBy(xpath="//input[@id='creditCardYear']")
    private WebElement creditCardYear;

    @FindBy(xpath="//input[@id='nameOnCard']")
    private WebElement CardName;

    @FindBy(xpath="//input[@type='checkbox' and @id='rememberMe']")
    private WebElement rememberMe;

    @FindBy(xpath="//input[@value='Purchase Flight']")
    private WebElement bookFlight;

    public SelectAirlineNFlightPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void bookFlightnEnterCustomerDetails(){
        customerInfo cInfo=new customerInfo();
        selectFlight.click();
        Name.sendKeys(cInfo.getName());
        Address.sendKeys(cInfo.getAddress());
        City.sendKeys(cInfo.getCity());
        State.sendKeys(cInfo.getState());
        zipCode.sendKeys(cInfo.getZipCode());
        setDropdownValue( cardType,cInfo.getCardType());
        creditCardNumber.sendKeys(cInfo.getCreditCardNumber());
        creditCardMonth.sendKeys(cInfo.getCreditCardMonth());
        creditCardYear.sendKeys(cInfo.getCreditCardYear());
        CardName.sendKeys(cInfo.getCardName());
        rememberMe.click();
        bookFlight.click();
    }
}
