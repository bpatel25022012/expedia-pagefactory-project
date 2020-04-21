package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created By Bhavesh
 */
public class FlightsPage extends Utility {

    private static final Logger log = LogManager.getLogger(FlightsPage.class.getName());



    @FindBy (xpath ="//div[@class='col gcw-location-field']//label[@class='text icon-before autocomplete-arrow gcw-flights-from']//input[@placeholder='City or airport']" )
    WebElement flyingFromField;
    @FindBy (xpath ="//div[contains(@class,'col gcw-location-field')]//label[contains(@class,'text icon-before autocomplete-arrow gcw-flights-to')]//input[contains(@placeholder,'City or airport')]")
    WebElement goingToField;
    @FindBy (xpath ="//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div[2]/div[1]/label[1]/input[1]")
    WebElement departing;
    @FindBy (xpath ="//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div[3]/div[1]/label[1]/input[1]")
    WebElement returning;
    @FindBy (xpath ="//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div[3]/div[1]/label[1]/input[1]")
    WebElement clearReturnDate;
    @FindBy (xpath ="//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div/div/div/ul/li/button[1]")
    WebElement travellers;
    @FindBy (xpath ="//button[@class=\"uitk-step-input-button uitk-step-input-plus\"]")
    WebElement adultsTwo;
    @FindBy (xpath ="//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]")
    WebElement close;
    @FindBy (xpath = "//div[9]//label[1]//button[1]")
    WebElement searchButton;
    @FindBy (xpath = "//span[@class=\"title-city-text\"]")
    WebElement getSameDestinationText;

    public void clickOnFlyingFromField() {
        Reporter.log ("clicking on flying from : "+ flyingFromField.toString()+"<br>");
        clickOnElement(flyingFromField);
        log.info("clicking on flying from : "+ flyingFromField.toString());
    }

    public void enterFlyingFrom(String flyingFrom) {
        Reporter.log ("entering flying from : "+flyingFrom+ "into flying from field" + flyingFromField.toString()+"<br>");
        sendTextToElement(flyingFromField, flyingFrom);
        log.info("entering flying from : "+flyingFrom+ "into flying from field" + flyingFromField.toString());
    }



    public void clickOnGoingToField() {
        Reporter.log ("clicking on going to  : "+ goingToField.toString()+"<br>");
        clickOnElement(goingToField);
        log.info("clicking on going to  : "+ goingToField.toString());
    }

    public void enterGoingTo(String goingTo) {
        Reporter.log ("entering going to  : "+goingTo+ "into going to field" + goingToField.toString()+"<br>");
        sendTextToElement(goingToField, goingTo);
        log.info("entering going to  : "+goingTo+ "into going to field" + goingToField.toString());
    }

    public void enterDepartingDate(String departingDate) {
        Reporter.log("entering departure date : " +departingDate+ "into departing date field " + departing.toString()+"<br>");
        sendTextToElement(departing, departingDate);
        log.info("entering departure date : " +departingDate+ "into departing date field " + departing.toString());
    }

    public void enterReturningDate(String returnDate) {
        Reporter.log("entering returing date : " +returnDate+ "into returning date field " + returning.toString()+"<br>");
        sendTextToElement(returning, returnDate);
        log.info("entering returing date : " +returnDate+ "into returning date field " + returning.toString());
    }

    public void clearReturnDate() {
        Reporter.log("clearing autofeed returing date : " + clearReturnDate.toString()+"<br>");
        clearTextFromField(clearReturnDate);
        log.info("clearing autofeed returing date : " + clearReturnDate.toString());
    }

    public void clickOnTravellers() {
        Reporter.log("clicking on travellers : " +travellers.toString()+"<br>");
        clickOnElement(travellers);
        log.info("clicking on travellers : " +travellers.toString());

    }

    public void clickOnAdults() {
        Reporter.log("adding adults : " +adultsTwo.toString()+"<br>");
        clickOnElement(adultsTwo);
        log.info("adding adults : " +adultsTwo.toString());
    }

    public void clickOnClose() {
        Reporter.log("clicking close : " +close.toString()+"<br>");
        clickOnElement(close);
        log.info("clicking close : " +close.toString());
    }

    public void clickOnSearchButton() {
        Reporter.log("clicking search button  : " +searchButton.toString()+"<br>");
        clickOnElement(searchButton);
        log.info("clicking search button  : " +searchButton.toString());
    }

    public String getDestinationText() {
        Reporter.log("Getting text from : " + getSameDestinationText.toString() + "<br>");
        log.info("Getting text from : " + getSameDestinationText.toString());
        return getTextFromElement(getSameDestinationText);

    }

    public String verifyBodyContainsDestinationName(){
        String bodyText = driver.findElement(By.tagName("body")).getText();
        return bodyText;
    }

}
