package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPAge {

    private WebDriver driver;
    private String linkXPath_format = ".//a[contains(text(), '%s')]";
    private By LinkExample1 = By.xpath(String.format(linkXPath_format, "Example 1"));
    private By LinkExample2 = By.xpath(String.format(linkXPath_format, "Example 2"));

    public DynamicLoadingPAge(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingEx1Page clickExample1(){
        driver.findElement(LinkExample1).click();
        return new DynamicLoadingEx1Page (driver);
    }

    public DynamicLoadingEx2Page clickExample2(){
        driver.findElement(LinkExample2).click();
        return new DynamicLoadingEx2Page(driver);
    }

    //method to right click + CTRL to open Example 2 in a new tab

    public DynamicLoadingEx2Page rightClickCtrlEx2(){
        driver.findElement(LinkExample2).sendKeys(Keys.CONTROL, Keys.RETURN);
        System.out.println("Done!");
        return new DynamicLoadingEx2Page(driver);
    }
}
