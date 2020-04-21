package uk.co.expedia.testsuit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;
import uk.co.expedia.testbase.TestBase;

import static uk.co.expedia.utility.Utility.getRandomString;

/**
 * Created By Bhavesh
 */
public class LoginTest extends TestBase {

    HomePage homePage ;
    AccountPage accountPage;
    SignInPage signInPage;

    @BeforeMethod
    public void SetUp(){
        homePage = new HomePage();
        accountPage = new AccountPage();
        signInPage = new SignInPage();
    }


    @Test(priority = 0, groups = {"sanity"})

    public void verifyUserShouldNotLoginWithInvalidCredential() {
        homePage.clickOnAcceptBtn();
        accountPage.clickOnAccountButton();
        accountPage.clickOnSignInTab();
        signInPage.enterEmailID("Rocky123@yahoo.com");
        signInPage.enterPassword("Chinki123");
        signInPage.clickOnSignInBtn();
        String expectedText = "You may have entered an unknown email address or an incorrect password";
        String actualText = signInPage.loginErrorMessage();
        Assert.assertEquals(expectedText, actualText);


    }
}
