package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By Slider = By.tagName("input");
    private By SliderHead = By.id("range");


    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    //method to click the slider
    public void clickSlider(){
        //Make a move to element to avoid clicking the slider in the middle
        //Slider casting to a webelement to be able to use movetoelement method
        WebElement slider = driver.findElement(Slider);

        Actions actions = new Actions(driver);
        actions.moveToElement(slider).click();
    }

    //method to send 8 right arrow keys to the slider to get to the result = 4
    public void sendRightArrow() {
        int n = 8;
        for (int i = 1; i <= 8; i++) {
            driver.findElement(Slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }


    //method to get the slider result
    public String getSliderResult(){
        return  driver.findElement(SliderHead).getText();
    }

}
