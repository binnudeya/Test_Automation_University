package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class fileuploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUplaod();
        uploadPage.uploadFile("D:\\Mechatronics\\Testing\\testautomationU\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFileText(), "chromedriver.exe", "Text Doesn't Match!");
    }
}
