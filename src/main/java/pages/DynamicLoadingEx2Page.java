package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingEx2Page {
    private WebDriver driver;
    private By StartButton = By.cssSelector("#start button");
    private By Text = By.id("finish");


    public DynamicLoadingEx2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartAndWaitForText(){
        driver.findElement(StartButton).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(Text));

    }

    public String getHiddenText2(){
        return driver.findElement(Text).getText();
    }

    public Boolean isStartButtonDisplayed(){
        return driver.findElement(StartButton).isDisplayed();
    }


}
