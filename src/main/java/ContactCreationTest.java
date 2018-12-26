import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.addNewContact();
        app.typeFIrstName();
        app.typeMiddleName();
        app.typeLastName();
        app.typeNickname();
        app.typeTitle();
        app.typeCompany();
        app.typeAddress();
        app.typeEmail();
        app.submitAndGoToHomePage();
    }

}
