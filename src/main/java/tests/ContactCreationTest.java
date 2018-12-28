package tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().addNewContact();
        app.getContactHelper().typeFIrstName();
        app.getContactHelper().typeMiddleName();
        app.getContactHelper().typeLastName();
        app.getContactHelper().typeNickname();
        app.getContactHelper().typeTitle();
        app.getContactHelper().typeCompany();
        app.getContactHelper().typeAddress();
        app.getContactHelper().typeEmail();
        app.submitAndGoToHomePage();
    }

}
