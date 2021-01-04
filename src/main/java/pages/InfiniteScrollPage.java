package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textboxes = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){this.driver = driver;}

    /**
     *
     * @param index is the number of the paragraph to scroll to on the infinite scroll page
     *              index is 1-based
     */
    public void scrollDownToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var JSExcuter = ((JavascriptExecutor)driver);

        while (getNumberofParagraphs() < index){
            JSExcuter.executeScript(script);
        }

    }

    //method to know the number of paragraphs present
    private int getNumberofParagraphs(){
        return driver.findElements(textboxes).size();
    }
}
