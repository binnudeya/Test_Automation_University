package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();

        //Provide a handle to the homepage (Framewrork)
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void takeScreenshot(){
        //Casting driver to TakesScreenshot class
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot Path: " + screenshot.getAbsolutePath());
        //To put it in the project's directory (set a new path)
        try {
            Files.move(screenshot, new File("D:\\Mechatronics\\Testing\\testautomationU\\resources\\screenshots\\test.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

}
