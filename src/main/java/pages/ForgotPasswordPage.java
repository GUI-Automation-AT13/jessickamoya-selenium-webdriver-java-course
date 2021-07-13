package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrievePassword(){
        //This button is not redirecting to the correct page https://the-internet.herokuapp.com/email_sent
        //It stays in the same URI and a message saying "Internal Server Error" appears
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);
    }

    public EmailSentPage retrievePassword(String email){
        enterEmail(email);
        return clickRetrievePassword();
    }
}
