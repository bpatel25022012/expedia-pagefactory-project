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
public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());


    @FindBy (xpath ="//label[contains(@class,'text')]//input[contains(@name,'signin-loginid')]" )
    WebElement emailIDField;

    @FindBy (xpath ="//fieldset[contains(@class,'no-padding')]//input[contains(@class,'clear-btn-input')]" )
    WebElement passwordField;

    @FindBy (id ="gss-signin-submit" )
    WebElement signInBtn;

    @FindBy (id ="gss-signin-incorrect-email-or-password" )
    WebElement errorMessage;




    public void enterEmailID(String email) {
        Reporter.log ("entering email address : "+ email +" to email field "+emailIDField.toString()+"<br>");
        sendTextToElement(emailIDField, email);
        log.info("entering email address : "+ email +" to email field "+emailIDField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log ("entering password : "+ password +" to password field "+passwordField.toString()+"<br>");
        sendTextToElement(passwordField, password);
        log.info("entering password : "+ password +" to password field "+passwordField.toString());
    }

    public void clickOnSignInBtn() {
        Reporter.log("Clicking on sign in button : " + signInBtn.toString() + "<br>");
        clickOnElement(signInBtn);
        log.info("Clicking on sign in button : " + signInBtn.toString());
    }

    public String loginErrorMessage() {
        Reporter.log("Getting error message  " + errorMessage.toString() + "<br>");
        log.info("Getting error message  " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
