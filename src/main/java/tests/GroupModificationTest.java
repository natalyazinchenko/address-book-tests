package tests;

import appmanager.GroupData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        int before = app.getGroupHelper().getGroupCount();
        if (!app.getGroupHelper().isElementPresent(By.name("selected[]"))){
            app.getGroupHelper().selectGroups();
            app.getGroupHelper().clickNewGroupButton();
            app.getGroupHelper().groupNameTyping();
            app.getGroupHelper().submitChanges("submit");
            app.getNavigationHelper().goBackToTheGroupsPage();
        }
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().groupNameTyping();
        app.getGroupHelper().makeChangesToGroup(new GroupData("testChangesIntoGroupHeader", "changes into footer"));
        app.getGroupHelper().updateGroupModification();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before, 0.001);
    }
}
