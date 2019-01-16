package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
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
        app.getGroupHelper().makeChangesToGroup();
        app.getGroupHelper().updateGroupModification();
    }
}
