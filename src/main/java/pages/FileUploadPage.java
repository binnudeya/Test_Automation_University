package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By InputField = By.id("file-upload");
    private By UploadButton = By.id("file-submit");
    private By UploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){this.driver = driver;}

    public void clickUploadButton(){
        driver.findElement(UploadButton).click();
    }

    /**
     *Provides path of file to the form then clicks uplaod button
     * @param pathofFile the complete path of the file to upload
     */
    public void uploadFile(String pathofFile){
        driver.findElement(InputField).sendKeys(pathofFile);
        clickUploadButton();
    }

    public String getUploadedFileText(){
        return driver.findElement(UploadedFile).getText();
    }

}
