package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class JSDropdownPage {
    private WebDriver driver;
    private By SelectOptionBar = By.id("dropdown");

    WebElement barElement = driver.findElement(SelectOptionBar);


    public JSDropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    private Select findDropdownElement() {
        return new Select(driver.findElement(SelectOptionBar));
    }

    public void selectFromDowndown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    public void setMultipleSelectorAttribute() {
        String script = "document.querySelector(\"#dropdown\").setAttribute('multiple', '')";
        var JSExecuter = (JavascriptExecutor) driver;
        JSExecuter.executeScript(script, findDropdownElement());
    }

    public List<String> getSelectedTexts(){

        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}


