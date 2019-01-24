package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getGroupHelper().selectGroups();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().clickNewGroupButton();
        app.getGroupHelper().groupNameTyping();
        app.getGroupHelper().submitChanges("submit");
        app.getNavigationHelper().goBackToTheGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before+1, 0.001);
    }

}

