package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() {
        if (!app.getContactHelper().isElementPresent(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='seleniumtests@mail.ru'])[1]/following::img[2]"))) {
            app.getContactHelper().addNewContact();
            fillContactInfo();
            app.submitAndGoToHomePage();
        }
            app.getContactHelper().editContact();
            app.getContactHelper().modifyContactInfo();
            app.getContactHelper().updateContactInfo();
        }
    }
