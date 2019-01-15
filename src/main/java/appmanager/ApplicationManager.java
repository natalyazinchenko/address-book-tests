package appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public ContactHelper contactHelper;
    WebDriver driver;
    public NavigationHelper navigationHelper;
    public SessionHelper sessionHelper;
    public GroupHelper groupHelper;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        String browser = BrowserType.FIREFOX;
        if (browser == BrowserType.CHROME){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\nzinchenko\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser == BrowserType.IE){
            System.setProperty("webdriver.ie.driver","C:\\Users\\nzinchenko\\Documents\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser == BrowserType.EDGE){
            System.setProperty("webdriver.edge.driver","C:\\Users\\nzinchenko\\Documents\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        } else if (browser == BrowserType.FIREFOX){
            System.setProperty("webdriver.firefox.driver","C:\\Users\\nzinchenko\\Documents\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
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

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
