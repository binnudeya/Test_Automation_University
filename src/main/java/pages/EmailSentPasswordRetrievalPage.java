package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPasswordRetrievalPage {
    private WebDriver driver;

    public EmailSentPasswordRetrievalPage(WebDriver driver){
        this.driver = driver;
    }

    private By EmailSentText = By.id("content");

    public String getSuccessText(){
        return driver.findElement(EmailSentText).getText();
    }
}
