package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFrames (){
        var nestedFramesPage = homePage.clickFrames();
        var finalFramesPage = nestedFramesPage.clickNestedFrames();
        String text1 = "LEFT";
        String text2 = "BOTTOM";
        assertEquals(finalFramesPage.switchToLeftArea(), text1,"Left text is faulty!");
        assertEquals(finalFramesPage.switchToBottomArea(), text2,"Left text is faulty!");

    }
}
