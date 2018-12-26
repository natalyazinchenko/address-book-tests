import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.selectGroups();
        app.clickNewGroupButton();
        app.groupNameTyping();
        app.submitChanges("submit");
        app.goBackToTheGroupsPage();
    }

}

