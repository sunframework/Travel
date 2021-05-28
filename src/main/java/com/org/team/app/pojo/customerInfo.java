package com.org.team.app.pojo;

import com.org.team.app.utils.commonUtils;

// We can use lombok extension to simplify and hide the getters and setters

public class customerInfo extends commonUtils {
    private String name;
    private String Address;
    private String City;
    private String State;
    private String zipCode;
    private String cardType;
    private String creditCardNumber;
    private String creditCardMonth;
    private String creditCardYear;
    private String CardName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardMonth() {
        return creditCardMonth;
    }

    public void setCreditCardMonth(String creditCardMonth) {
        this.creditCardMonth = creditCardMonth;
    }

    public String getCreditCardYear() {
        return creditCardYear;
    }

    public void setCreditCardYear(String creditCardYear) {
        this.creditCardYear = creditCardYear;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

public customerInfo(){
    this.name= mainProperties.getProperty("name");
    this.Address=mainProperties.getProperty("Address");
    this.City=mainProperties.getProperty("City");
    this.State=mainProperties.getProperty("State");
    this.zipCode=mainProperties.getProperty("zipCode");
    this.cardType=mainProperties.getProperty("cardType");
    this.creditCardNumber=mainProperties.getProperty("creditCardNumber");
    this.creditCardMonth=mainProperties.getProperty("creditCardMonth");
    this.creditCardYear=mainProperties.getProperty("creditCardYear");
    this.CardName=mainProperties.getProperty("CardName");
}




}
