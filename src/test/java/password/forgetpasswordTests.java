package password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPasswordRetrievalPage;
import pages.ForgetPasswordPage;
import pages.HomePage;

import static org.testng.Assert.*;

public class forgetpasswordTests extends BaseTests {

    @Test
    public void testSentEmail(){
        ForgetPasswordPage forgetPasswordPage = homePage.clickForgotPassword();
        forgetPasswordPage.setEmail("TAU@example.com");
        EmailSentPasswordRetrievalPage emailSentPasswordRetrievalPage =
                forgetPasswordPage.clickRetrieveButton();
        assertTrue(emailSentPasswordRetrievalPage.getSuccessText().contains("Your e-mail's been sent!"),
                "Invalid email");

    }

}
