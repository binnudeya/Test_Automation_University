package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WizyWigPage {
    private WebDriver driver;
    private String editorFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("button[title = 'Increase indent']");

    public WizyWigPage(WebDriver driver){
        this.driver = driver;
    }

    //method to clear text area
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    //method to set text area
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    //method to switch to the editor iframe
    private void switchToEditArea(){
        driver.switchTo().frame(editorFrameID);
    }

    //method to exit out of the iframe
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    //method to click the increase indent button
    public void clickIncreaseIndentButton(){
        driver.findElement(decreaseIndentButton).click();
    }

    //method to get text from the text area
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
