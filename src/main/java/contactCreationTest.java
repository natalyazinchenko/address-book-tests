import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class contactCreationTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nzinchenko\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }

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

    private void submitAndGoToHomePage() {
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
        driver.findElement(By.linkText("home page")).click();
    }

    private void typeEmail() {
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("seleniumtests@mail.ru");
    }

    private void typeAddress() {
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("contact");
    }

    private void typeCompany() {
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("new");
    }

    private void typeTitle() {
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys("Adding");
    }

    private void typeNickname() {
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys("Test");
    }

    private void typeLastName() {
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Chrome");
    }

    private void typeMiddleName() {
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys("Contact");
    }

    private void typeFIrstName() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Selenium");
    }

    private void addNewContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
