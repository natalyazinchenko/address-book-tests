package tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testDeletionGroup() throws Exception {
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().selectAndDeleteGroup();
        app.getNavigationHelper().goBackToTheGroupsPage();
    }

}
