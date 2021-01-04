package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class contextTests extends BaseTests {

    @Test
    public void contextClickTest(){
        var contextPage = homePage.clickContext();
        contextPage.rightClickBox();
        assertEquals(contextPage.getAlertText(), "You selected a context menu",
                "Texts don't match!");
        contextPage.alert_clicktoAccept();

    }
}
