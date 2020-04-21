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
public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());



    @FindBy (xpath ="//button[@id='header-account-menu']" )
    WebElement accountLink;

    @FindBy(id ="header-account-signin-button" )
    WebElement signInTab;

    public void clickOnAccountButton() {
        Reporter.log("clicking on account link : "+ accountLink.toString()+"<br>");
        clickOnElement(accountLink);
        log.info("clicking on account link : "+ accountLink.toString());
    }

    public void clickOnSignInTab() {
        Reporter.log("clicking on sign in tab :" +signInTab.toString()+"<br>");
        clickOnElement(signInTab);
        log.info("clicking on sign in tab :" +signInTab.toString());
    }
}
