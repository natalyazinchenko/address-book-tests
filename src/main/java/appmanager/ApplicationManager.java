package appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    public NavigationHelper navigationHelper;
    public SessionHelper sessionHelper;
    public GroupHelper groupHelper;
    public String baseUrl;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nzinchenko\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper.login("admin","secret");
    }

    public void stop() {
        driver.quit();
    }

    public String closeAlertAndGetItsText() {
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

    public void submitAndGoToHomePage() {
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
        driver.findElement(By.linkText("home page")).click();
    }

    public void typeEmail() {
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("seleniumtests@mail.ru");
    }

    public void typeAddress() {
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("contact");
    }

    public void typeCompany() {
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("new");
    }

    public void typeTitle() {
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys("Adding");
    }

    public void typeNickname() {
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys("Test");
    }

    public void typeLastName() {
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Chrome");
    }

    public void typeMiddleName() {
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys("Contact");
    }

    public void typeFIrstName() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Selenium");
    }

    public void addNewContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
