import org.testng.annotations.Test;

public class DeletionGroupTest extends TestBase {

    @Test
    public void testDeletionGroup() throws Exception {
        selectGroups();
        selectAndDeleteGroup();
        goBackToTheGroupsPage();
    }

}
