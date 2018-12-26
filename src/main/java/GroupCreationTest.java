import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        selectGroups();
        clickNewGroupButton();
        groupNameTyping();
        submitChanges("submit");
        goBackToTheGroupsPage();
    }

}

