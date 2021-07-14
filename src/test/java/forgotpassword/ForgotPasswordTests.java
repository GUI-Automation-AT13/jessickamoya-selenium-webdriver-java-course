package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class ForgotPasswordTests extends BaseTests {

    //Optional Exercise Chapter 4.3
    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgotPasswordPage.retrievePassword("email@example.com");
        assertEquals(emailSentPage.getMessageContentText(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
