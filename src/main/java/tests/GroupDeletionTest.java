package tests;

import org.openqa.selenium.By;
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
        app.getGroupHelper().selectAndDeleteGroup();
        app.getNavigationHelper().goBackToTheGroupsPage();
    }

}
