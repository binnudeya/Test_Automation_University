package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class loginTests extends BaseTests {

    @Test
    public void testLoginSuccessful(){
        LogInPage loginPage = homePage.clickFormAuthentication();
        loginPage.SetUsername("tomsmith");
        loginPage.SetPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Incorrect Login!");

    }
}
