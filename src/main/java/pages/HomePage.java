package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //Creating a field to store the webdriver
    private WebDriver driver;

    //Making a constructor to pass in the webdriver object
    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    //method used to interact/find with the web element
    //returns the handle for the new page that will be directed to after clicking form authentication
    public LogInPage clickFormAuthentication(){
        ClickLink("Form Authentication");
        return new LogInPage (driver);
    }

    //method to click on any of the multiple links in the homepage
    private void ClickLink(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }

    //method to click the dropdown page
    public DropdownPage clickDropDown(){
        ClickLink("Dropdown");
        return new DropdownPage(driver);
    }

    //method to forget password (additional exercises)
    public ForgetPasswordPage clickForgotPassword(){
        ClickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    //method to click on the hovers Page
    public HoversPage clickHovers(){
        ClickLink("Hovers");
        return new HoversPage(driver);
    }

    //method to click the horizontal slider page
    public HorizontalSliderPage clickSlider(){
        ClickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    //method to click on Key presses
    public KeyPressesPage clickKeyPresses(){
        ClickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    //method to click on the JS Alert
    public JSAlertsPage clickJSAlert(){
        ClickLink("Click for JS Alert");
        return new JSAlertsPage(driver);
    }

    //method to click file upload
    public FileUploadPage clickFileUplaod(){
        ClickLink("File Upload");
        return new FileUploadPage(driver);
    }

    //method to click wizzywig
    public WizyWigPage clickWizyWig(){
        ClickLink("WYSIWYG Editor");
        return new WizyWigPage(driver);
    }

    //method to click Context Menu
    public ContextPage clickContext(){
        ClickLink("Context Menu");
        return new ContextPage(driver);
    }

    //method to click the Nested Frames PAge
    public NestedFramesPAge clickFrames(){
        ClickLink("Frames");
        return new NestedFramesPAge(driver);
    }

    //method to click the dynamic loading page
    public DynamicLoadingPAge clickDynamicLoading(){
        ClickLink("Dynamic Loading");
        return new DynamicLoadingPAge(driver);
    }

    //method to click LargeanddeepDom Page
    public LargeAndDeepDOMPage clickLargeAndDeep(){
        ClickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        ClickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public JSDropdownPage clickDropdownJS(){
        ClickLink("Dropdown");
        return new JSDropdownPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        ClickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }



}
