package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.fail;

public class TestBase {

    public final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
        String verificationErrorString = app.verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    protected void fillContactInfo() {
        app.getContactHelper().typeFIrstName();
        app.getContactHelper().typeMiddleName();
        app.getContactHelper().typeLastName();
        app.getContactHelper().typeNickname();
        app.getContactHelper().typeTitle();
        app.getContactHelper().typeCompany();
        app.getContactHelper().typeAddress();
        app.getContactHelper().typeEmail();
    }
}
