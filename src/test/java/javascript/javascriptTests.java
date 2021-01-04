package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class javascriptTests extends BaseTests {

    @Test
    public void testScrollsToTable(){
        var largePage = homePage.clickLargeAndDeep();
        largePage.scrollToTable();
    }

    @Test
    public void testInfiniteScroll(){
        homePage.clickInfiniteScroll().scrollDownToParagraph(5);
    }

    @Test
    public void testJSSelectionChange(){
        var jsdropdown = homePage.clickDropdownJS();
        jsdropdown.setMultipleSelectorAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(jsdropdown::selectFromDowndown);

        var selectedOptions = jsdropdown.getSelectedTexts();

        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");





    }
}
