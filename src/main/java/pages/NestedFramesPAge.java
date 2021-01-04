package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPAge {

    private WebDriver driver;

    public NestedFramesPAge(WebDriver driver){this.driver = driver;}

    public FinalFramesPage clickNestedFrames(){
         driver.findElement(By.linkText("Nested Frames")).click();
        return new FinalFramesPage(driver);
    }
}
