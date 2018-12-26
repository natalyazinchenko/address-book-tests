import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class contactCreationTest extends TestBase{

    @Test
    public void untitledTestCase() throws Exception {

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
