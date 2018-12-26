import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {
    protected WebDriver driver;
    protected String baseUrl;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();

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

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    protected void goBackToTheGroupsPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    protected void submitChanges(String submit) {
        driver.findElement(By.name(submit)).click();
    }

    protected void groupNameTyping() {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys("seleniumTestGroupCreate");
    }

    protected void selectGroups() {
        driver.findElement(By.linkText("groups")).click();
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

    protected void submitAndGoToHomePage() {
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
        driver.findElement(By.linkText("home page")).click();
    }

    protected void typeEmail() {
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("seleniumtests@mail.ru");
    }

    protected void typeAddress() {
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("contact");
    }

    protected void typeCompany() {
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("new");
    }

    protected void typeTitle() {
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys("Adding");
    }

    protected void typeNickname() {
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys("Test");
    }

    protected void typeLastName() {
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Chrome");
    }

    protected void typeMiddleName() {
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys("Contact");
    }

    protected void typeFIrstName() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Selenium");
    }

    protected void addNewContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    protected void selectAndDeleteGroup() {
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.name("delete")).click();
    }

    protected void clickNewGroupButton() {
        driver.findElement(By.name("new")).click();
    }
}
