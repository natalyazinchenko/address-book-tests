package tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().editContact();
        app.getContactHelper().modifyContactInfo();
        app.getContactHelper().updateContactInfo();
    }
}
