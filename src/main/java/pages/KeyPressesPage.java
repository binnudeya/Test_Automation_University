package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    //method to send characters inside the input field
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    //method to enter Pi symbol
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "2") + Keys.chord(Keys.ALT, "2") +
                Keys.chord(Keys.ALT, "7") +"=3.14");
    }

    //method to get the result text
    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
