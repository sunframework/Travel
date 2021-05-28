package com.org.team.app.pages;

import com.org.team.app.utils.commonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends commonUtils {

    @FindBy(xpath="//h1[.='Thank you for your purchase today!']")
    private WebElement successMsg;

    @FindBy(xpath="//td[.='Id']/following-sibling::td")
    private WebElement orderID;

    @FindBy(xpath="//td[.='Status']/following-sibling::td")
    private WebElement orderStatus;

    public ConfirmationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void confirmOrder(){
        System.out.println(verifyText(successMsg));
        String bookingId=orderID.getText();
        String bookingStatus=orderStatus.getText();
        System.out.println("The booking Id is : "+bookingId+" and status is : "+bookingStatus);
    }
}
