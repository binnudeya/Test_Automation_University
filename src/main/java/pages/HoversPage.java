package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    //Figure element locator
    private By FigureBox = By.className("figure");
    //Box caption that includes both the user&the profile hyperlink
    private By BoxCaption = By.className("figcaption");

    /**
     *
     * @param index starts at 1
     */
    //Method to hover over any of the 3 figures on the hovers Page
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(FigureBox).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(BoxCaption));
    }

    //Class for the hovering over figures captions
    public class FigureCaption{
        private WebElement caption;

        public FigureCaption(WebElement caption){
            this.caption = caption;
        }
        //By objects to locate the user & profile Hyperlink
        private By Header = By.tagName("h5");
        private By Link = By.tagName("a");

        //method to verify that the caption is displayed
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        //methods to get the texts of the header and link
        public String getTitle(){
            return caption.findElement(Header).getText();
        }
        public String getLink(){
            return caption.findElement(Link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(Link).getText();
        }


    }
}
