package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage =  homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);

        var selectedOptions = dropDownPage.getSelectedOptions();

        //assert number of selected options is 1
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of Selections.");

        //assert that the selected options list contains option1
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected.");


    }

}
