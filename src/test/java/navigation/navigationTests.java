package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class navigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com");
    }

    @Test
    public void testSwitchTabs(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testRightClickToSwitchToNewTab(){
        var ButtonPAge = homePage.clickDynamicLoading().rightClickCtrlEx2();
        getWindowManager().switchToNewTab();
        assertTrue(ButtonPAge.isStartButtonDisplayed(), "Text Doesn't Appear!");
    }

}
