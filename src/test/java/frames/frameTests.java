package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class frameTests extends BaseTests {


    @Test
    public void testframes(){
        var framePage = homePage.clickWizyWig();
        framePage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World!";

        framePage.setTextArea(text1);

        framePage.clickIncreaseIndentButton();
        framePage.setTextArea(text2);
        assertEquals(framePage.getTextFromEditor(), text1+text2, "Text is incorrect!");
    }
}
