package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver){
        super(driver);
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
}
