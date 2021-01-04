package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDOMPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDOMPage(WebDriver driver){
        this.driver = driver;
    }

    //method to scroll down to the table in the large page using JS
    public void scrollToTable(){
        WebElement TablElement = driver.findElement(table);
        //We have to cast the driver to JSexecuter to be able to use it
        String script = "arguments[0].ScrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, TablElement);
    }
}
