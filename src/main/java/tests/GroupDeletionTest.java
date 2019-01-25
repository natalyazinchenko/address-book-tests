package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectOneGroup(before-1);
        app.getGroupHelper().deleteGroup();
        app.getNavigationHelper().goBackToTheGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before-1,0.001);
    }

}
