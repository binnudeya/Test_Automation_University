package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingEx1Page {

    private WebDriver driver;
    private By StartButton = By.cssSelector("#start button");
    private By LoadingIndicator = By.id("loading");
    private By LoadingText = By.id("finish");

    public DynamicLoadingEx1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(StartButton).click();
        //Explicit wait functionality
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(LoadingIndicator)));

        //method fuent wait that timesout after 5 secs with polling every 1 sec
        //and ignoring all the nosuchelementexception before the time out occurs
        //FluentWait wait =new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                //.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchFieldException.class);

        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(LoadingIndicator)));
    }

    //method to get the loaded text
    public String getLoadedText(){
        return driver.findElement(LoadingText).getText();
    }
}
