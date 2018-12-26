package tests;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().clickNewGroupButton();
        app.getGroupHelper().groupNameTyping();
        app.getGroupHelper().submitChanges("submit");
        app.goBackToTheGroupsPage();
    }

}

