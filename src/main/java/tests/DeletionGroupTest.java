package tests;

import org.testng.annotations.Test;

public class DeletionGroupTest extends TestBase {

    @Test
    public void testDeletionGroup() throws Exception {
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().selectAndDeleteGroup();
        app.goBackToTheGroupsPage();
    }

}
