package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    private WebDriver driver;
    private By UsernameField = By.id("username");
    private By PasswordField = By.id("password");
    private By LoginButton = By.cssSelector("button.radius");

    public LogInPage(WebDriver driver){
        this.driver = driver;
    }

    public void SetUsername (String username){
        driver.findElement(UsernameField).sendKeys(username);
    }

    public void SetPassword (String password){
        driver.findElement(PasswordField).sendKeys(password);
    }

    public SecureAreaPage ClickLoginButton (){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
    }
}
