package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification(){
        //проверка, есть ли существующий контакт
        if (!app.getContactHelper().isElementPresent(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='seleniumtests@mail.ru'])[1]/following::img[2]"))){
            app.getContactHelper().addNewContact();
            fillContactInfo();
            app.submitAndGoToHomePage();
        } //сам тест по модификации
        app.getContactHelper().editContact();
        app.getContactHelper().modifyContactInfo();
        app.getContactHelper().updateContactInfo();
    }
    }
