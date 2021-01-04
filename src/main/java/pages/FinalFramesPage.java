package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.management.BadStringOperationException;

public class FinalFramesPage {
    private WebDriver driver;
    private String UpperFrame = "frame-top";
    private String LeftFrame = "frame-left";
    private String BottomFrame = "frame-bottom";
    private By Text = By.tagName("body");


    public FinalFramesPage(WebDriver driver){
        this.driver = driver;
    }

    //method to read the LEFT text page
    public String switchToLeftArea(){
        driver.switchTo().frame(UpperFrame);
        driver.switchTo().frame(LeftFrame);

        String text1 = driver.findElement(Text).getText();
        //2 Ups to get back to the main page from the nested frame
        switchToMainArea();
        switchToMainArea();
        return text1;
    }

    //method to read the Bottom text page
    public String switchToBottomArea(){
        driver.switchTo().frame(BottomFrame);
        String text2 = driver.findElement(Text).getText();
        switchToMainArea();
        return text2;
    }

    //method to switch to main area
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
