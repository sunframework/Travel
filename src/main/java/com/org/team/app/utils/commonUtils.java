package com.org.team.app.utils;

import com.org.team.app.config.ProjectConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class commonUtils {

    public static Properties mainProperties;
    public  static WebDriver driver=null;

    public commonUtils(){
         mainProperties = PropertiesUtils.getProperties();
         if(mainProperties.isEmpty()){
             mainProperties=PropertiesUtils.realAllProperties(ProjectConfiguration.PROJECT_PATH+ ProjectConfiguration.packagePath+"/dataset/");
         }
    }


    public static WebDriver setDriver(String browser){
        switch(browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case "firefox":
                 driver= new FirefoxDriver();
                break;
            case "edge":
                driver= new EdgeDriver();
                break;
            default:
                throw new IllegalStateException("Unexpected value : " +browser);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void setDropdownValue(WebElement dropdownAddress,String value){
        Select s= new Select(dropdownAddress);
        s.selectByValue(value);
    }

    public String verifyText(WebElement text){
        Assert.assertTrue("Element with locator:  "+text+" is not displayed", text.isDisplayed());
        return text.getText();
        }

    }

