package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHiddenEx1(){
        var dynamicLoadingPAge = homePage.clickDynamicLoading();
        var dynamicLoadingEx1 = dynamicLoadingPAge.clickExample1();
        dynamicLoadingEx1.clickStartButton();

        String text = "Hello World!";
        assertEquals(dynamicLoadingEx1.getLoadedText(), text, "Text doesn't Match!");
    }

    @Test
    public void testWaitTillHiddenEx2(){
        var dynamicPage2 = homePage.clickDynamicLoading().clickExample2();
        dynamicPage2.clickStartAndWaitForText();
        assertEquals(dynamicPage2.getHiddenText2(), "Hello World!", "Text doesn't match!");
    }
}
