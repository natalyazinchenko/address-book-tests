package tests;

import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().groupNameTyping();
        app.getGroupHelper().updateGroupModification();
    }
}
