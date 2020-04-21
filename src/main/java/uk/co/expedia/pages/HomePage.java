package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created By Bhavesh
 */
public class HomePage  extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



   @FindBy (xpath ="//span[@class ='button-text']" )
    WebElement acceptTab;

   @FindBy (xpath ="//ul[contains(@class,'utility-nav nav-group cf')]//a[contains(text(),'Flights')]" )
    WebElement flightsTab;

    public void clickOnFlightsTab() {
      Reporter.log("clicking on flights tab : "+ flightsTab.toString()+"<br>");
        clickOnElement(flightsTab);
        log.info ("clicking on flights tab : "+ flightsTab.toString());

    }

    public void clickOnAcceptBtn() {
        Reporter.log("clicking on accept tab : "+ acceptTab.toString()+"<br>");
        clickOnElement(acceptTab);
        log.info("clicking on accept tab : "+ acceptTab.toString());

    }
}
