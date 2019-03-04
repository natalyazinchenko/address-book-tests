package tests;

import appmanager.GroupData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getGroupHelper().selectGroups();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().clickNewGroupButton();
        app.getGroupHelper().groupNameTyping();
        app.getGroupHelper().submitChanges("submit");
        app.getNavigationHelper().goBackToTheGroupsPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(),before.size()+1, 0.001);
    }

}

