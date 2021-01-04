package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class sliderTests extends BaseTests {

    @Test
    public void testSlider(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickSlider();
        horizontalSliderPage.clickSlider();
        System.out.println(horizontalSliderPage.getSliderResult());
        horizontalSliderPage.sendRightArrow();
        System.out.println(horizontalSliderPage.getSliderResult());
        assertEquals(horizontalSliderPage.getSliderResult(), "4", "Not the same result!");
    }
}
