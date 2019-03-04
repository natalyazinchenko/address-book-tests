package tests;

import appmanager.GroupData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testDeletionGroup() throws Exception {
        if (!app.getGroupHelper().isElementPresent(By.name("selected[]"))){
            app.getGroupHelper().selectGroups();
            app.getGroupHelper().clickNewGroupButton();
            app.getGroupHelper().groupNameTyping();
            app.getGroupHelper().submitChanges("submit");
            app.getNavigationHelper().goBackToTheGroupsPage();
        }
        app.getGroupHelper().selectGroups();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectOneGroup(before.size()-1);
        app.getGroupHelper().deleteGroup();
        app.getNavigationHelper().goBackToTheGroupsPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()-1, 0.001);
    }

}
