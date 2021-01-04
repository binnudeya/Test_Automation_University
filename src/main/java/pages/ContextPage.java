package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextPage {
    private WebDriver driver;
    private By Box = By.id("hot-spot");

    public ContextPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickBox(){
        WebElement box = driver.findElement(Box);

        Actions action = new Actions(driver);
        action.contextClick(box).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clicktoAccept(){
        driver.switchTo().alert().accept();
    }

}
