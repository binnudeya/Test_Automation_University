package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;

    public ForgetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    private By ForgotPassword = By.id("email");
    private By RetrieveButton = By.id("form_submit");

    //set the email
    public void setEmail(String email){
        driver.findElement(ForgotPassword).sendKeys(email);
    }

    //click retrieve password button
    public EmailSentPasswordRetrievalPage clickRetrieveButton(){
        driver.findElement(RetrieveButton).click();
        return new EmailSentPasswordRetrievalPage(driver);
    }





}
