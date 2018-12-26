import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class deletionGroupTest extends TestBase {

    @Test
    public void testDeletionGroup() throws Exception {
        selectGroups();
        selectAndDeleteGroup();
        driver.findElement(By.linkText("group page")).click();
    }

}
