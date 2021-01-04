package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage (WebDriver driver){
        this.driver = driver;
    }

    //Generalize to select any choice from the dropdown menu
    public void selectFromDropdown (String option){
        findDropdownElement().selectByVisibleText(option);
    }

    //get all selected options and conversion from webelement list to a string list
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    //Helper method to find dropdown element
    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }

}
