package uk.co.expedia.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By Bhavesh
 */
public class BasePage {
    public static WebDriver driver;
    public BasePage(){
        PageFactory.initElements(driver,this);
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/uk/co/expedia/resoruces/properties/log4j.properties");

    }

}
