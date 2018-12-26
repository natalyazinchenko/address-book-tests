package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void submitChanges(String submit) {
        driver.findElement(By.name(submit)).click();
    }

    public void groupNameTyping() {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys("seleniumTestGroupCreate");
    }

    public void selectGroups() {
        driver.findElement(By.linkText("groups")).click();
    }

    public void selectAndDeleteGroup() {
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.name("delete")).click();
    }

    public void clickNewGroupButton() {
        driver.findElement(By.name("new")).click();
    }
}
