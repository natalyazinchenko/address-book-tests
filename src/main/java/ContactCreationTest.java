import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        addNewContact();
        typeFIrstName();
        typeMiddleName();
        typeLastName();
        typeNickname();
        typeTitle();
        typeCompany();
        typeAddress();
        typeEmail();
        submitAndGoToHomePage();
    }

}
